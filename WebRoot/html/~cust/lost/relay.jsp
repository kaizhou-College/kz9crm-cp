<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
</head>
<body>
<form action="${basePath}html/cstLost_update2" method="post">
<div class="page_title">客户流失管理 &gt; 确认流失</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	
	<button class="common_button" onclick="back();">返回</button>
	<input class="common_button" type="button" onclick="to('${basePath}html/cstLost_toconfirm?lstId=<s:property value="cstLost.lstId"/>');" value="确认流失"/>
	<button class="common_button" onclick="save('list.html');">保存</button>
</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><input type="hidden" value="<s:property value="cstLost.lstId"/>" name="lstId">
		<s:property value="cstLost.lstId"/></td>
		<th>客户</th>
		<td><s:property value="cstLost.lstCustName"/></td>
	</tr>
	<tr>
		<th>客户经理</th>
		<td>
			<s:property value="cstLost.lstCustManagerName"/></td>
		<th>上次下单时间</th>
		<td>
			<s:property value="cstLost.lstLastOrderDate"/></td>
	</tr>	
	<tr>
		<th>暂缓措施</th>
		<td colspan="3">
			<s:property value="cstLost.lstDelay"/></td>
	</tr>
	<tr>
		<th>追加暂缓措施</th>
		<td colspan="3">
			<textarea rows="6" cols="50" name="lstDelay"><s:property value="cstLost.lstDelay"/></textarea><span class="red_star">*</span></td>
	</tr>
</table>
<br />
</form>
</body>
</html>