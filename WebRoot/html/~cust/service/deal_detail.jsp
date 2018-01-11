<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@include file="/comm/comm.jsp" %>
<%@ page language="java"%> 
<%@ page contentType="text/html; charset=utf-8"%> 
<%@ page import="java.util.*"%> 
<%@ page import="java.text.*"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
</head>
<body>
<form action="${basePath}html/cstService_detailupdate?svrId=<s:property value='cstService.svrId'/>" method="post">
<div class="page_title">客户服务管理 &gt; 服务处理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button> 
	<button class="common_button" onclick="save('feedback.html');">保存</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><s:property value="cstService.svrId"/></td>
		<th>服务类型</th>
		<td>
			<s:property value="cstService.svrType"/></td>
	</tr>
	<tr>
		<th>概要</th>
		<td colspan="3"><s:property value="cstService.svrTitle"/></td>
	</tr>	
	<tr>
		<th>客户</th>
		<td><s:property value="cstService.svrCustName"/></td>
		<th>状态</th>
		<td><s:property value="cstService.svrStatus"/></td>
	</tr>	
	<tr>
		<th>服务请求</th>
		<td colspan="3"><s:property value="cstService.svrRequest"/><br>
　</td>
	</tr>
	<tr>
		<th>创建人</th>
		<td><s:property value="cstService.svrCreateBy"/></td>
		<th>创建时间</th>
		<td><s:property value="cstService.svrCreateDate"/></td>
	</tr>
	</table>
<br />
<table class="query_form_table" id="table3">
	<tr>
		<th>分配给</th>
		<td>
			<s:property value="cstService.svrDueTo"/></td>
		<th>分配时间</th>
		<td><s:property value="cstService.svrDueDate"/></td>
	</tr>
</table>
<br />	
<table class="query_form_table" id="table1">
	<tr>
		<th>服务处理</th>
		<td colspan="3"><textarea rows="6" cols="50" name="svrDeal" ><s:property value="cstService.svrDeal"/></textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>处理人</th>
		<td><input name="svrDueTo" value="刘颖" readonly size="20" /><span class="red_star">*</span></td>
		<th>处理时间</th>
		<td>
		<% String datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()); //获取系统时间 %>
		<input id="t3" name="svrDealDate" readonly size="20" value="<%=datetime%>" /><span class="red_star">*</span></td>
	</tr>
</table>
<br />
<table disabled class="query_form_table" id="table2">
	<tr>
		<th>处理结果</th>
		<td><input name="svrResult" size="20" <s:property value="cstService.svrResult"/> /><span class="red_star">*</span></td>
		<th>满意度</th>
		<td>
			<select name="svrSatisfy">
				<option value="0">请选择...</option>
				<option value="1">☆☆☆☆☆</option>
				<option value="2">☆☆☆☆</option>
				<option value="3">☆☆☆</option>
				<option value="4">☆☆</option>
				<option value="5">☆</option>
			</select><span class="red_star">*</span></td>
	</tr>
</table>
<script>
</script>
</form>
</body>
</html>