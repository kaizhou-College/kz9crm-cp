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
   		<div class="page_title">
			权限管理 > 用户管理 > 系统角色管理 > 编辑角色
		</div>
		<form action="sysRole_update" method="post">
			
			<%--<html:hidden property="o" value="editRole"/>
			--%>
		<div class="button_bar">
	   		<button class="common_button" onclick="help('');">帮助</button>
	   		<button class="common_button" onclick="back();">返回</button>
	   		<input type="submit" class="common_button" value="保存">
	   	</div>
	   	<table class="query_form_table">
		   	<s:iterator var="sysRole" value="sysRole">
		   		<tr>
		   			<th>编号</th>
		   			<td>
		   			<input type="hidden" value="<s:property value='#sysRole.roleId'/>" name="sysRole.roleId"/>
		   				<s:property value="#sysRole.roleId"/>
		   			</td>
		   			<th>角色名</th>
		   			<td>
		   				<s:property value="#sysRole.roleName"/>
		   			</td>
		   		</tr>
		   		<tr>
		   			<th>角色描述</th>
		   			<td>
		   				<s:property value="#sysRole.roleDesc"/>
		   			</td>
		   			<th>状态</th>
		   			<td>
		   				<s:select list="#{'1':'正常','2':'禁用'}" name="sysRole.roleFlag" value="#sysRole.roleFlag"></s:select>
		   			
		   			</td>
		   		</tr>
		   	</s:iterator>
	   	</table>
	   	<%--
	   	<script>
				build_validate("sysRole.roleName","角色名不能为空","Limit","1","50");
				build_validate("sysRole.roleDesc","角色描述不能为空","Limit","1","50");
		</script>--%>
	</form>
  </body>
</html>
