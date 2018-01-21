<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
</head>
<body>
<form action="salchance_update" method="post">


<div class="page_title">销售机会管理&nbsp; &gt; 编辑销售机会</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" type="submit">保存</button>  
</div>
<table class="query_form_table">
<s:iterator var="salChance" value="salChance">
	<tr>
		<th>编号</th>
		<td>
		<input type="hidden" name="chcId"  value="<s:property value="#salChance.chcId"/>">
		<s:property value="#salChance.chcId"/></td>
		<th>机会来源</th>
		<td>
			<s:property value="#salChance.chcSource"/></td>
	</tr>
	<tr>
		<th>客户名称</th>
		<td><s:property value="#salChance.chcCustName" /><span class="red_star">*</span></td>
		<th>成功机率（%）</th>
		<td><s:property value="#salChance.chcRate"/><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>概要</th>
		<td colspan="3"><s:property value="#salChance.chcTitle"/><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>联系人</th>
		<td><s:property value="#salChance.chcLinkman" /></td>
		<th>联系人电话</th>
		<td><s:property value="#salChance.chcTel"/></td>
	</tr>
	<tr>
		<th>机会描述</th>
		<td colspan="3"><textarea rows="6" cols="50" name="chcDesc"><s:property value="#salChance.chcDesc" /></textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>创建人</th>
		<td><s:property value="#salChance.chcCreateId" /><span class="red_star">*</span></td>
		<th>创建时间</th>
		<td><s:property value="#salChance.chcCreateDate"/><span class="red_star">*</span></td>
	</tr>
</table>
<br />
<table disabled class="query_form_table" id="table1">
	<tr>
		<th>指派给</th>
		<td>
			<s:select list="#{'小明':'小明','旺财':'旺财','球球':'球球','孙小美':'孙小美','周洁轮':'周洁轮'}" name="chcDueTo" value="#salChance.chcDueTo"></s:select>
				<span class="red_star">*</span>
		</td>
		<th>指派时间</th>
		<td><s:property value="#salChance.chcDueDate"/><span class="red_star">*</span></td>
	</tr>
</table>
		</s:iterator>
		</form>
</body>
</html>