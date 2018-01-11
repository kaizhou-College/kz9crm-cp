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
<form action="${basePath}html/cstActivity_add" method="post">
<div class="page_title">客户信息管理 &gt; 客户信息 &gt; 交往记录 &gt; 编辑交往记录</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" type="submit">保存</button>  
</div>
<table class="query_form_table" id="table1">
	<tr>
		<th>时间</th>
		<td>
		<input type="hidden" value="<s:property value="custNo"/>" name="custNo">
		<input name="atvDate"  size="20"  /><span class="red_star">*</span></td>
		<th>地点</th>
		<td>
			<input name="atvPlace"  size="20" /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>概要</th>
		<td><input name="atvTitle"  size="20" /><span class="red_star">*</span></td>
		<th>备注</th>
		<td><input name="atvCustName"  size="20" /></td>
	</tr>	
	<tr>
		<th>详细信息</th>
		<td colspan="3">
			<textarea cols="50" rows="6" name="atvDesc"></textarea>
		</td>
	</tr>
</table>
</form>
</body>
</html>