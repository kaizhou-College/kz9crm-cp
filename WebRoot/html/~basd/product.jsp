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

<div class="page_title">产品查询</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload();">查询</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>名称</th>
		<td><input /></td>
		<th>型号</th>
		<td><input /></td>
		<th>批次</th>
		<td><input /></td>
	</tr>
</table>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>名称</th>
		<th>型号</th>
		<th>等级/批次</th>
		<th>单位</th>
		<th>单价（元）</th>
		<th>备注</th>
	</tr>
	<s:iterator var="listProduct" value="listProduct">
	<tr>
		<td class="list_data_number"><s:property value="#listProduct.prodId"/> </td>
		<td class="list_data_ltext"><s:property value="#listProduct.prodName"/></td>
		<td class="list_data_text"><s:property value="#listProduct.prodType"/></td>
		<td class="list_data_text"><s:property value="#listProduct.prodBatch"/></td>
		<td class="list_data_text"><s:property value="#listProduct.prodUnit"/></td>
		<td class="list_data_number"><s:property value="#listProduct.prodPrice"/></td>
		<td class="list_data_ltext"><s:property value="#listProduct.prodMemo"/>&nbsp;</td>		
	</tr>
	</s:iterator>
	<tr>
		<th colspan="100" class="pager">
			<div class="pager">
			<comcp:queryByPage count="${listpage.count}" pageIndex="${listpage.pageIndex}" pageSize="${listpage.pageSize}" pageMax="${listpage.pageMax}" pageUrl="${listpage.pageUrl}"></comcp:queryByPage>
			</div>
		</th>
	</tr>
</table>
</body>
</html>