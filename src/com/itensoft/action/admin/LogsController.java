package com.itensoft.action.admin;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JsonConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itensoft.bean.easyui.ListBean;
import com.itensoft.model.Logs;
import com.itensoft.service.LogsService;
import com.itensoft.util.ExportExcel;
import com.itensoft.util.JsonDateValueProcessor;

@Controller
@RequestMapping(value = "admin/logs")
public class LogsController extends BaseController {

	LogsService logsService;
	@Resource(name = "logsService")
	public void setLogsService(LogsService logsService) {
		this.logsService = logsService;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "admin/logs";
	}

	@RequestMapping(value = "/filter", method = RequestMethod.POST)
	@ResponseBody
	public String filter(String username, String startdate, String enddate,
			String manager, String docer, int page, int rows) {

		int total = this.logsService.getTotalFilter(username, startdate,
				enddate, manager, docer);
		List<Logs> list = this.logsService.loadFilter(page, rows, username,
				startdate, enddate, manager, docer);

		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.registerJsonValueProcessor(java.util.Date.class,
				new JsonDateValueProcessor("yyyy-MM-dd"));

		ListBean bean = new ListBean();
		bean.setTotal(total);
		bean.setRows(list);

		return objToJson(bean, jsonConfig);
	}

	@RequestMapping(value = "/excel", method = RequestMethod.POST)
	public void excel(String username, String startdate,
			String enddate, String manager, String docer,int page,int rows,HttpServletResponse response) throws IOException{
		ExportExcel<Logs> ex = new ExportExcel<Logs>();  
		
        String[] headers =  
        {"用户","会话标识","开始时间","动作","原因","管理员","结果"};  
        List<Logs> dataset = new ArrayList<Logs>();  
        List<Logs> list = this.logsService.loadFilter(page,rows,username,startdate,enddate,manager,docer);
        for(int i=0;i<list.size();i++){
            dataset.add(list.get(i));  
        }
        String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).toString();
        response.setContentType("application/vnd.ms-excel");     
        response.setHeader("Content-disposition", "attachment;filename="+time+".xls"); 
        OutputStream ouputStream = response.getOutputStream();
        String[] methodArray = {"getUsername","getSessionid","getDatetime1","getAction","getReason1","getVirtualmanager","getResult1"};
        ex.exportExcel(time,headers,methodArray, dataset, ouputStream,"yyyy-MM-dd");  
        ouputStream.flush();     
        ouputStream.close();     
	}

}
