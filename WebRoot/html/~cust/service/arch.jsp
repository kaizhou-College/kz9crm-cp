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

<div class="page_title">客户服务管理 &gt; 服务归档</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload();">查询</button>  
</div>
<table class="query_form_table">
	<tr>
		<th height="28">客户</th>
		<td><input /></td>
		<th height="28">概要</th>
		<td><input /></td>
		<th height="28">服务类型</th>
		<td>
			<select name="D1">
				<option>全部</option>
				<option>咨询</option>
				<option>建议</option>
				<option>投诉</option>
			</select>
		</td>
	</tr>
	<tr>
		<th height="32">创建日期</th>
		<td colspan="3">
			<input name="T2" size="10" /> - <input name="T1" size="10" /></td>
		<th height="32">状态</th>
		<td>
			<select name="D1">
				<option>全部</option>
				<option>新创建</option>
				<option>已分配</option>
				<option>已处理</option>
				<option>已反馈</option>
				<option>已归档</option>
			</select>
		</td>
	</tr>
</table>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>客户</th>
		<th>概要</th>
		<th>服务类型</th>
		<th>创建人</th>
		<th>创建日期</th>
		<th>状态</th>
		<th>操作</th>
	</tr>
	<s:iterator value="cstServicelist" var="cstServicelist">
	<tr>
		<td class="list_data_number"><s:property value="#cstServicelist.svrId"/></td>
		<td class="list_data_text"><s:property value="#cstServicelist.svrCustName"/></td>
		<td class="list_data_ltext"><s:property value="#cstServicelist.svrTitle"/></td>
		<td class="list_data_text"><s:property value="#cstServicelist.svrType"/></td>
		<td class="list_data_text"><s:property value="#cstServicelist.svrCreateBy"/></td>
		<td class="list_data_text"><s:property value="#cstServicelist.svrCreateDate"/></td>
		<td class="list_data_text">已分配</td>
		<td class="list_data_op">
			<img onclick="to('${basePath}html/cstService_todetail3?svrId=<s:property value="#cstServicelist.svrId"/>');" title="查看" src="${basePath}/html/images/bt_detail.gif" class="op_button" /></td>
	</tr>
	</s:iterator>
	<tr>
		<th colspan="8" class="pager">
<div class="pager">
<comcp:queryByPage count="${listpage.count}" pageIndex="${listpage.pageIndex}" pageSize="${listpage.pageSize}" pageMax="${listpage.pageMax}" pageUrl="${listpage.pageUrl}"></comcp:queryByPage>
</div>
		</th>
	</tr>
</table>
</body>
</html>