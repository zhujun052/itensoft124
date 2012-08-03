package com.itensoft.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itensoft.bean.VUser;
import com.itensoft.mapper.VirtualManagerMapper;
import com.itensoft.model.User;
import com.itensoft.service.VirtualManagerService;

@Service("virtualManagerService")
public class VirtualManagerServiceImpl implements VirtualManagerService {

	VirtualManagerMapper virtualManagerMapper;
	@Resource(name = "virtualManagerMapper")
	public void setVirtualManagerMapper(
			VirtualManagerMapper virtualManagerMapper) {
		this.virtualManagerMapper = virtualManagerMapper;
	}

	@Override
	public int getTotal() {
		return this.virtualManagerMapper.getTotal();
	}

	@Override
	public List<User> loadList(int page, int rows) {
		int start = page * rows;
		int total = this.virtualManagerMapper.getTotal();
		int res = total - start;
		if (res < 0 && page > 1) {
			rows = rows + res;
		}
		return this.virtualManagerMapper.loadList(start, rows);
	}

	@Override
	public int add(String name, List<VUser> list) {
		String addsql = "";
		addsql = "insert into VirtualManager ";
		addsql += "([Name])";
		addsql += " VALUES (";
		addsql += " '" + name + "')";

		int id = this.virtualManagerMapper.insertin(addsql);

		for (int i = 0; i < list.size(); i++) {
			String updatesql = "";
			int p = list.get(i).getSno() + 1;
			String user = "User" + p;
			String Priority = "Priority" + p;
			updatesql += "update VirtualManager set " + user + " ='"
					+ list.get(i).getUser() + "'," + Priority + "="
					+ (list.get(i).getSno() + 1) + "  ";
			updatesql += " where name = '" + name + "'";
			this.virtualManagerMapper.updatesql(updatesql);
		}
		return id;
	}

	@Override
	public int update(int id, String name, List<VUser> list) {
		String updatesql = "update VirtualManager set name = '" + name
				+ "' where id = " + id;
		this.virtualManagerMapper.updatesql(updatesql);

		// 清空现有的数据
		for (int i = 0; i < list.size(); i++) {
			String clearsql = "UPDATE VirtualManager set User1 = '',Priority1='',User2 = '',Priority2='',User3 = '',Priority3='',User4 = '',Priority4='',User5 = '',Priority5='',User6 = '',Priority6='',User7 = '',Priority7='',User8 = '',Priority8='' where id = "
					+ id;
			this.virtualManagerMapper.updatesql(clearsql);
		}

		for (int i = 0; i < list.size(); i++) {
			String upsql = "";
			int p = list.get(i).getSno() + 1;
			String user = "User" + p;
			String Priority = "Priority" + p;
			upsql += "update VirtualManager set " + user + " ='"
					+ list.get(i).getUser() + "'," + Priority + "="
					+ (list.get(i).getSno() + 1) + "  ";
			upsql += " where name = '" + name + "'";
			this.virtualManagerMapper.updatesql(upsql);
		}

		return 1;
	}

	@Override
	public int delete(int id) {
		return this.virtualManagerMapper.delete(id);
	}

}
