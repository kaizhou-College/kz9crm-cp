<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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

<div class="page_title">客户服务管理 &gt; 服务处理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>  
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
		<td colspan="3"><s:property value="cstService.svrDeal"/><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>处理人</th>
		<td><s:property value="cstService.svrCreateBy"/><span class="red_star">*</span></td>
		<th>处理时间</th>
		<td>
		<s:property value="cstService.svrDealDate"/>
		<span class="red_star">*</span></td>
	</tr>
</table>
<br />
<table disabled class="query_form_table" id="table2">
	<tr>
		<th>处理结果</th>
		<td><s:property value="cstService.svrResult"/><span class="red_star">*</span></td>
		<th>满意度</th>
		<td>
		<s:property value="cstService.svrSatisfy"/>
			<span class="red_star">*</span></td>
	</tr>
</table>
</body>
</html>