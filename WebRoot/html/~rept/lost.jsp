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
<form action="${basePath}html/rept_superselect" method="post">
<div class="page_title">客户流失分析</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<input class="common_button" type="submit" value="查询"/> 
	</div>
	<table class="query_form_table" border="0" cellPadding="3" cellSpacing="0">
			<tr>
					<th>客户名称</th>
						<td><input type="text" name="cstLost.lstCustName" value="<s:property value="cstLost.lstCustName"/>"></td>
					<th>客户经理</th>
						<td><input type="text" name="cstLost.lstCustManagerName" value="<s:property value="cstLost.lstCustManagerName"/>"></td>
			</tr>
	</table>
	</form>
		<br />
	<table class="data_list_table">
		<tr>
			<th height="28">编号</th>
			<th height="28">年份</th>
			<th height="28">客户</th>
			<th height="28">客户经理</th>
			<th height="28">流失原因</th>
		</tr>
		<s:iterator var="listcstLost" value="listcstLost">
			<tr align="center">
				<td class="list_data_number" height="27"><s:property value="#listcstLost.lstId"/> </td>
				<td class="list_data_text" height="27"><s:property value="#listcstLost.lstLostDate"/> </td>
				<td class="list_data_text" height="27"><s:property value="#listcstLost.lstCustName"/></td>
				<td class="list_data_text" height="27"><s:property value="#listcstLost.lstCustManagerName"/></td>
				<td class="list_data_ltext" height="27"><s:property value="#listcstLost.lstReason"/></td>
			</tr>
		</s:iterator>
		<tr>
			<th colspan="7" class="pager">
				<div class="pager">
					<comcp:queryByPage count="${listpage.count}" pageIndex="${listpage.pageIndex}" pageSize="${listpage.pageSize}" pageMax="${listpage.pageMax}" pageUrl="${listpage.pageUrl}"></comcp:queryByPage>
				</div>
			</th>
		</tr>
	</table>
</body>
</html>
<s:debug></s:debug>