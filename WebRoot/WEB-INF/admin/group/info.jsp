<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>	
<%@ include file="../common/config.jsp" %>
<div class="container">

<ul id="tt1" class="easyui-tree" animate="true" lines="true" dnd="true">
	<c:if test="${groupinfo.id!=null && groupinfo.id!='' }">
		<li>
			<span>信息</span>
			<ul>
				<li>IP地址：</li>
				<li>机器名:${groupinfo.hostname }</li>
				<li>Mac: </li>
			</ul>
		</li>
	</c:if>
		
		<li>
			<span>策略</span>
			<ul>
				<li>U盘日志：${policy.logudiskop == "T"? "开启" : "关闭" }</li>
				<li>打印日志：${policy.logprint == "T"? "开启" : "关闭" }</li>
				<li>使用黑名单：${policy.useblacklist == "T"? "开启" : "关闭" }</li>
				<li>需要离线加密狗：${policy.needkey == "T"? "开启" : "关闭" }</li>
				<li>允许离线时间：
				<c:choose>
					<c:when test="${policy.offlinetime ==null || policy.offlinetime ==0 }">
						无限
					</c:when>
					<c:when test="${policy.offlinetime == -1 }">
						在线模式（温和）
					</c:when>
					<c:when test="${policy.offlinetime == -2 }">
						在线模式(极进)
					</c:when>
				</c:choose>
				</li>
				<li>Explorer中需要预览的文件类型：${policy.previewspec }</li>
				<li>禁止打印：${policy.printcontroled == "T"? "开启" : "关闭" }</li>
				<li>U盘控制模型：${policy.usbcontrolmode }</li>
				<li>虚拟打印保护：${policy.spoolsv == "T"? "开启" : "关闭" }</li>
				<li>复制粘贴保护：${policy.clipboardcontroled == "T"? "开启" : "关闭" }</li>
				<li>拖放保护：${policy.dragdropcontroled == "T"? "开启" : "关闭" }</li>
				<li>抓屏保护：${policy.snapshotcontroled == "T"? "开启" : "关闭" }</li>
				<li>OLE插入保护：${policy.olecontroled == "T"? "开启" : "关闭" }</li>
				<li>加密文件加锁显示：${policy.overlayicon == "T"? "开启" : "关闭" }</li>
			</ul>
		</li>
		<li>
			<span>身份</span>
			<ul>
			<c:forEach items="${certs }" var="c">
				<li>${c.name }</li>
			</c:forEach>
			</ul>
		</li>
		<li>
			<span>接受者</span>
			<ul>
			<c:forEach items="${receive }" var="c">
				<li>${c.name }</li>
			</c:forEach>
			</ul>
		</li>
		<li>
			<span>受控软件</span>
			<ul>
				<li>File 4</li>
			</ul>
		</li>
		<li>
			<span>审批者</span>
			<ul>
			<c:forEach items="${vms }" var="c">
				<li>${c.virtualmanagername }</li>
			</c:forEach>
			</ul>
		</li>
	</ul>

</div>