<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
</head>
<body>
<form action="">
<div class="page_title">客户贡献分析</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<input class="common_button" type="submit" value="查询"/> 
	</div>
<table class="query_form_table">
	<tr>
		<th>客户名称</th>
		<td><input name=""/></td>
		<th>年份</th>
		<td>
		<s:select list="{'2005','2006','2007','2008','2009','2010'}" name=""></s:select>
		</td>
	</tr>
	</table>
	</form>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>客户名称</th>
		<th>订单金额（元）</th>
	</tr>
	<s:iterator var="listordersLine" value="listordersLine">
		<tr align="center">
			<td class="list_data_number"><s:property value="#listordersLine.oddId"/> </td>
			<td class="list_data_ltext"><s:property value="cname"/></td>
			<td class="list_data_number"><s:property value="#listordersLine.oddPrice"/></td>
		</tr>
	</s:iterator>
</table>
</body>
</html>