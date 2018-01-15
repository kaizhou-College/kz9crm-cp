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
<form action="${basePath}html/basd_superselect" method="post">
<div class="page_title">产品查询</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<input type="submit" class="common_button" onclick="reload();" value="查询">
</div>
<table class="query_form_table">
	<tr>
		<th>产品</th>
		<td><input name="storage.stkProdId" value="<s:property value="storage.stkProdId"/>"/></td>
		<th>仓库</th>
		<td><input name="storage.stkWarehouse" value="<s:property value="storage.stkWarehouse"/>"/></td>
		<th>&nbsp;</th>
		<td>&nbsp;</td>
	</tr>
</table>
</form>
<br />
<table class="data_list_table">
	<tr>
		<th>序号</th>
		<th>产品</th>
		<th>仓库</th>
		<th>货位</th>
		<th>件数</th>
		<th>备注</th>
	</tr>
	<s:iterator var="listStorage" value="listStorage">
		<tr>
			<td class="list_data_number"><s:property value="#listStorage.stkId"/> </td>
			<td class="list_data_ltext"><s:property value="#listStorage.stkProdId"/></td>
			<td class="list_data_ltext"><s:property value="#listStorage.stkWarehouse"/></td>
			<td class="list_data_text"><s:property value="#listStorage.stkWare"/></td>
			<td class="list_data_number"><s:property value="#listStorage.stkCount"/></td>
			<td class="list_data_ltext"><s:property value="#listStorage.stkMemo"/>&nbsp;</td>		
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