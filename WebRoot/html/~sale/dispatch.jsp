<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@include file="/comm/comm.jsp" %>

<%@ page language="java"%> 
<%@ page contentType="text/html; charset=utf-8"%> 
<%@ page import="java.util.*"%> //获取系统时间必须导入的 
<%@ page import="java.text.*"%> //获取系统时间必须导入的 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
</head>
<body>

<div class="page_title">销售机会管理&nbsp; &gt; 指派销售机会</div>
<form action="${basePath}html/salchance_dispatch" method="post">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" type="submit">保存</button>  
</div>
<table class="query_form_table">
<s:iterator value="salChance" var="salChance">
	<tr>
		<th>编号</th>
		<td><s:property value="salChance.chcId"/>
		<input type="hidden" value="<s:property value="salChance.chcId"/>" name="chcId">
		</td>
		<th>机会来源</th>
		<td>
		<s:property value="salChance.chcSource"/>
			　</td>
	</tr>
	<tr>
		<th>客户名称</th>
		<td><s:property value="salChance.chcCustName"/></td>
		<th>成功机率（%）</th>
		<td>&nbsp;<s:property value="salChance.chcRate"/></td>
	</tr>	
	<tr>
		<th>概要</th>
		<td colspan="3"><s:property value="salChance.chcTitle"/></td>
	</tr>
	<tr>
		<th>联系人</th>
		<td><s:property value="salChance.chcLinkman"/></td>
		<th>联系人电话</th>
		<td><s:property value="salChance.chcTel"/></td>
	</tr>
	<tr>
		<th>机会描述</th>
		<td colspan="3"><s:property value="salChance.chcDesc"/></td>
	</tr>
	<tr>
		<th>创建人</th>
		<td><s:property value="salChance.chcCreateId"/></td>
		<th>创建时间</th>
		<td><s:property value="salChance.chcCreateDate"/></td>
	</tr>
</table>
<br />
<table class="query_form_table" id="table1">
	<tr>
		<th>指派给</th>
		<td>
			<select name="chcCreateId">
				<option value="0">请选择...</option>
				<option value="1">小明</option>
				<option value="2">旺财</option>
				<option value="3">球球</option>
				<option value="4">孙小美</option>
				<option value="5">周洁轮</option>
			</select> <span class="red_star">*</span></td>
		<th>指派时间</th>
		<td>
			<% String datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()); //获取系统时间 %>
			
			<input value="<%=datetime%>" name="chcDueDate" readonly size="20">
			</td>
	</tr>
	</s:iterator>
</table>
<script>
</script>
</form>
</body>
</html>
<s:debug></s:debug>