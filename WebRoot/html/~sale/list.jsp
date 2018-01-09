<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="/comm/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%--<script src="${basepath}/html/js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function(){
		$("#chance_del").click(function(){
			alter(1);
		});
	});

</script>
--%><html>
<head>
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
</head>
<body>
<form action="${basePath}html/salchance_superselect">
<div class="page_title">销售机会管理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('add.jsp');">新建</button>  
	<button class="common_button" type="submit">查询</button> 
	</div>
	
<table class="query_form_table">
	<tr>
		<th>客户名称</th>
		<td><input /></td>
		<th>概要</th>
		<td><input /></td>
		<th>联系人</th>
		<td>
			<input name="T1" size="20" />
		</td>
	</tr>
	</table>
	</form>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>客户名称</th>
		<th>概要</th>
		<th>联系人</th>
		<th>联系人电话</th>
		<th>创建时间</th>
		<th>操作</th>
	</tr>
	<s:iterator var="listsalChance" value="listsalChance">
	<tr>
		<td class="list_data_number"><s:property value="#listsalChance.chcId"/></td>
		<td class="list_data_text"><s:property value="#listsalChance.chcCustName"/></td>
		<td class="list_data_ltext"><s:property value="#listsalChance.chcTitle"/></td>
		<td class="list_data_text"><s:property value="#listsalChance.chcLinkman"/></td>
		<td class="list_data_text"><s:property value="#listsalChance.chcTel"/></td>
		<td class="list_data_text"><s:property value="#listsalChance.chcCreateDate"/></td>
		<td class="list_data_op">
<<<<<<< Updated upstream
			
			<img onclick="to('${basePath}html/salchance_toupdate');" title="编辑" src="${basePath}/html/images/bt_edit.gif" class="op_button" />

			<img onclick="to('${basePath}html/salchance_todispatch');" title="指派" src="${basePath}/html/images/bt_linkman.gif" class="op_button" />
			
			
			<img onclick="del('“这里应该是商品的ID”');" id="chance_del" title="删除" src="${basePath}/html/images/bt_del.gif" class="op_button" /
			
		</td>
	</tr>
	</s:iterator>
	<tr>
		<th colspan="7" class="pager">
<div class="pager">
	共59条记录 每页<input value="10" size="2" />条
	第<input value="1" size="2"/>页/共5页
	<a href="#">第一页</a>
	<a href="#">上一页</a>
	<a href="#">下一页</a>
	<a href="#">最后一页</a>
	转到<input value="1" size="2" />页
	<button width="20" onclick="reload();">GO</button>
</div>
		</th>
	
	<%--<comcp:queryByPage max="${max}" index="${index}" uri="salchance_bypage"></comcp:queryByPage>
	--%></tr>
</table>

</body>
</html>
