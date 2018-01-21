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

<div class="page_title">客户信息管理 > 客户信息 > 历史订单 </div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>  
	<button class="common_button" onclick="back();">返回</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td>KH071202001</td>
		<th>客户名称</th>
		<td>聪海信息科技有限公司</td>
	</tr>
	</table>
<br />
<table class="data_list_table">
	<tr>
		<th>订单编号</th>
		<th>日期</th>
		<th>送货地址</th>
		<th>状态</th>
		<th>操作</th>
	</tr>
	<s:iterator value="orderslist" var="orderslist">
	<tr>
		<td class="list_data_text"><s:property value="#orderslist.odrId"/></td>
		<td class="list_data_text"><s:property value="#orderslist.odrDate"/></td>
		<td class="list_data_text"><s:property value="#orderslist.odrAddr"/></td>
		<td class="list_data_text"><s:property value="#orderslist.odrStatus"/></td>
		<td class="list_data_op">
			<img onclick="to('${basePath}html/~cust/cust/orders_detail.html');" title="查看明细" src="${basePath}/html/images/bt_detail.gif" class="op_button" /></td>
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
<s:debug></s:debug>
</html>

