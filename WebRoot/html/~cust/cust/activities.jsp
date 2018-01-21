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


<div class="page_title">客户信息管理 &gt; 客户信息 &gt; 交往记录</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('${basePath}html/cstActivity_toadd?custNo=<s:property value='custNo'/>');">新建</button>  
	<button class="common_button" onclick="back();">返回</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td><s:property value="custNo"/></td>
		<th>客户名称</th>
		<td><s:property value="cstCustomer.custName"/></td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th width="232">时间</th>
		<th>地点</th>
		<th>概要</th>
		<th>详细信息</th>
		<th>备注</th>
		<th>操作</th>
	</tr>
	<s:iterator value="cstActivitylist" var="cstActivitylist">
	<tr>
		<td class="list_data_text" width="230"><s:property value="#cstActivitylist.atvDate"/></td>
		<td class="list_data_text"><s:property value="#cstActivitylist.atvPlace"/></td>
		<td class="list_data_ltext"><s:property value="#cstActivitylist.atvTitle"/></td>
		<td class="list_data_ltext"><s:property value="#cstActivitylist.atvDesc"/></td>
		<td class="list_data_op">
			　</td>
		<td class="list_data_op">
			<img onclick="to('${basePath}html/cstActivity_toupdate?atvId='+<s:property value='#cstActivitylist.atvId'/>);" title="编辑" src="${basePath}/html/images/bt_edit.gif" class="op_button" />
			<img onclick="to('${basePath}html/cstActivity_delete?atvId='+<s:property value='#cstActivitylist.atvId'/>);" title="删除" src="${basePath}/html/images/bt_del.gif" class="op_button" />
		</td>
	</tr>
	</s:iterator>
	
	</table>
</body>
</html>
<s:debug></s:debug>