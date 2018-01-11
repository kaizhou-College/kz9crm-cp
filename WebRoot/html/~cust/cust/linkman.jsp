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

<div class="page_title">客户信息管理 > 客户信息 > 联系人 </div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('${basePath}html/cstLinkman_toadd?custNo=<s:property value='custNo'/>');">新建</button>  
	<button class="common_button" onclick="back();">返回</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td><s:property value="custNo"/>
		</td>
		<th>客户名称</th>
		<td><s:property value="cstCustomer.custName"/></td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th>姓名</th>
		<th>性别</th>
		<th>职位</th>
		<th>办公电话</th>
		<th>手机</th>
		<th>备注</th>
		<th>操作</th>
	</tr>
	<s:iterator value="cstLinkmanlist" var="cstLinkmanlist">
	<tr>
		<td class="list_data_text"><s:property value="#cstLinkmanlist.lkmName" /></td>
		<td class="list_data_ltext"><s:property value="#cstLinkmanlist.lkmSex" /></td>
		<td class="list_data_text"><s:property value="#cstLinkmanlist.lkmPostion" /></td>
		<td class="list_data_text"><s:property value="#cstLinkmanlist.lkmTel" /></td>
		<td class="list_data_text"><s:property value="#cstLinkmanlist.lkmMobile" /></td>
		<td class="list_data_text"><s:property value="#cstLinkmanlist.lkmMemo" /></td>
		<td class="list_data_op">
			<img onclick="to('${basePath}html/cstLinkman_toupdate?lkmId='+<s:property value='#cstLinkmanlist.lkmId'/>);" title="编辑" src="${basePath}/html/images/bt_edit.gif" class="op_button" />
			<img onclick="to('${basePath}html/cstLinkman_delete?lkmId='+<s:property value='#cstLinkmanlist.lkmId'/>);" title="删除" src="${basePath}/html/images/bt_del.gif" class="op_button" />
			
		</td>
	</tr>
	</s:iterator>
	</table>
</body>
</html>

<s:debug></s:debug>