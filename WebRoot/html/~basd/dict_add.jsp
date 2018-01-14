<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
</head>
<body>
<form action="basDict_add" method="post">
<div class="page_title">数据字典管理 > 增加数据字典条目</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="save('dict.html');">保存</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td>
		</td>
		<th>类别</th>
		<td><input name="dictType" /><span class="red_star">*</span><br /></td>
	</tr>
	<tr>
		<th>条目</th>
		<td><input name="dictItem"  /><span class="red_star">*</span></td>
		<th>值</th>
		<td><input name="dictValue" /><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>是否可编辑</th>
		<td>
		<input type=checkbox name="bll" value="true" checked><br>
		</td>
		<th>&nbsp;</th>
		<td>&nbsp;</td>
	</tr>
</table>
</form>
</body>
</html>
<s:debug></s:debug>