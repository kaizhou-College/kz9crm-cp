<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/comm/comm.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <base href="<%=basePath%>">
<title>jb-aptech毕业设计项目</title>
<link href="html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}html/script/common.js"></script>
<script src="${basePath}html/script/validate.js"></script>
</head>
  
  <body>
    <div class="page_title">权限管理 > 角色管理 > 角色管理 > 查看角色</div>
    <html:form action="/role" method="post">
    	<html:hidden property="o" value="toLookSysRole"/>
    	<div class="button_bar">
	   		<button class="common_button" onclick="help('');">帮助</button>
	   		<button class="common_button" onclick="back();">返回</button>
	   	</div>
	   	<br/>
	   	<table class="query_form_table">
	   	 	<s:iterator var="sysRole" value="sysRole">
	   		<tr>
	   			<th>
	   				编号
	   			</th>
	   			<td>
	   				<s:property value="#sysRole.roleId"/>
	   			</td>
	   			<th>
	   				角色名
	   			</th>
	   			<td><s:property value="#sysRole.roleName"/></td>
	   		</tr>
	   		<tr>
	   			<th>
	   				角色描述
	   			</th>
	   			<td>
	   				<s:property value="#sysRole.roleDesc"/>
	   			</td>
	   			<th>状态</th>
	   			<td>
	   				<s:property value="#sysRole.roleFlag"/>
	   			</td>
	   		</tr>
	   		</s:iterator>
	   	</table>
    </html:form>
  </body>
</html>
