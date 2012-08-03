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
				<li>IP地址：${groupinfo. }</li>
				<li>机器名:</li>
				<li>Mac: </li>
			</ul>
		</li>
	</c:if>

		
		<li>
			<span>策略</span>
			<ul>
				<li>U盘日志：</li>
				<li>打印日志：</li>
				<li>使用黑名单：</li>
				<li>需要离线加密狗：</li>
				<li>允许离线时间：</li>
				<li>Explorer中需要预览的文件类型：</li>
				<li>禁止打印：</li>
				<li>U盘控制模型：</li>
				<li>虚拟打印保护：</li>
				<li>复制粘贴保护：</li>
				<li>拖放保护：</li>
				<li>抓屏保护：</li>
				<li>OLE插入保护：</li>
				<li>加密文件加锁显示：</li>
			</ul>
		</li>
		<li>
			<span>身份</span>
			<ul>
				<li>File 4</li>
			</ul>
		</li>
		<li>
			<span>接受者</span>
			<ul>
				<li>File 4</li>
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
				<li>File 4</li>
			</ul>
		</li>
	</ul>

</div>