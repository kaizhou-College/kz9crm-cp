<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
<script type="text/javascript">



</script>

</head>
<body>

<s:debug></s:debug>


<form action="${basePath}html/salchance_superselect">


		
		

<div class="page_title">客户信息管理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload();">查询</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td><input /></td>
		<th>名称</th>
		<td><input /></td>
		<th>地区</th>
		<td>
			<select>
				<option>全部</option>
				<option>北京</option>
				<option>华北</option>
				<option>中南</option>
				<option>东北</option>
				<option>西部</option>
			</select>
		</td>
	</tr>
	<tr>
		<th>客户经理</th>
		<td><input /></td>
		<th>客户等级</th>
		<td>
			<select>
				<option>全部</option>
				<option>战略合作伙伴</option>
				<option>合作伙伴</option>
				<option>大客户</option>
				<option>普通客户</option>
			</select>
		</td>
		<th>　</th>
		<td>　</td>
	</tr>
</table>
<br />
<table class="data_list_table">
	<tr>
		<th>序号</th>
		<th>客户编号</th>
		<th>名称</th>
		<th>地区</th>
		<th>客户经理</th>
		<th>客户等级</th>
		<th>操作</th>
	</tr>
	<s:iterator value="cstCustomerlist" var="cstCustomerlist">
	<tr>
		<td class="list_data_number"><s:property value="#cstCustomerlist.custStatus"/></td>
		<td class="list_data_text"><s:property value="#cstCustomerlist.custNo"/></td>
		<td class="list_data_ltext"><s:property value="#cstCustomerlist.custManagerId"/></td>
		<td class="list_data_text"><s:property value="#cstCustomerlist.custRegion"/></td>
		<td class="list_data_text"><s:property value="#cstCustomerlist.custManagerName"/></td>
		<td class="list_data_text"><s:property value="#cstCustomerlist.custLevel"/></td>
		<td class="list_data_op">
			<img onclick="to('${basePath}html/cstCustomer_toupdate?custNo=<s:property value='#cstCustomerlist.custNo'/>');" title="编辑" src="${basePath}/html/images/bt_edit.gif" class="op_button" />
			<img onclick="to('${basePath}html/cstLinkman_select?custNo=<s:property value='#cstCustomerlist.custNo'/>');" title="联系人" src="${basePath}/html/images/bt_linkman.gif" class="op_button" />
			<img onclick="to('${basePath}html/cstActivity_select?custNo=<s:property value='#cstCustomerlist.custNo'/>');" title="交往记录" src="${basePath}/html/images/bt_acti.gif" class="op_button" />
			<img onclick="to('${basePath}html/orders_select');" title="历史订单" src="${basePath}/html/images/bt_orders.gif" class="op_button" />
			
			<img onclick="to('${basePath}html/cstCustomer_delete?custNo=<s:property value='#cstCustomerlist.custNo'/>');" title="删除" src="${basePath}/html/images/bt_del.gif" class="op_button" />
			
		</td>
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
</form>
</body>
</html>