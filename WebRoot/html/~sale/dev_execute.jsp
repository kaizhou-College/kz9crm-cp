<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
</head>
<body>

<div class="page_title">客户开发计划 &gt; 执行计划</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="alert('开发失败，已归档。');window.location.href='${basePath}/html/~sale/dev.jsp';">终止开发</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="to('dev_plan.jsp');">制定计划</button>
	<button class="common_button" onclick="alert('用户开发成功，已添加新客户记录。');window.location.href='${basePath}/html/~sale/dev.jsp';">开发成功</button>

	</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><s:property value="chancePlanList.chcId"/></td>
		<th>机会来源</th>
		<td></td>
	</tr>
	<tr>
		<th>客户名称</th>
		<td><s:property value="chancePlanList.chcCustName"/></td>
		<th>成功机率（%）</th>
		<td>&nbsp;</td>
	</tr>	
	<tr>
		<th>概要</th>
		<td colspan="3"><s:property value="chancePlanListchcTitle"/></td>
	</tr>
	<tr>
		<th>联系人</th>
		<td><s:property value="chancePlanList.chcLinkman"/></td>
		<th>联系人电话</th>
		<td><s:property value="chancePlanList.chcTel"/></td>
	</tr>
	<tr>
		<th>机会描述</th>
		<td colspan="3"><s:property value="chancePlanList.chcDesc"/></td>
	</tr>
	<tr>
		<th>创建人</th>
		<td><s:property value="chancePlanList.chcCreateBy"/></td>
		<th>创建时间</th>
		<td><s:property value="chancePlanList.chcCreateDate"/></td>
	</tr>
	<tr>
		<th>指派给</th>
		<td><s:property value="chancePlanList.chcDueTo"/></td>
		<th>指派时间</th>
		<td><s:property value="chancePlanList.chcDueDate"/></td>
	</tr>
</table>
<br />
<table class="data_list_table" id="table1">
	<tr>
		<th>日期</th>
		<th>计划</th>
		<th>执行效果</th>
	</tr>
	<s:iterator var="chancePlanList.salPlan" value="cpl">
	<form action="salPlan_salPlanResult" method="post">
			<input name="salChance.chcId" value="${chancePlanList.chcId}" type="hidden">
			<input name="salplan.plaId" value="${cpl.plaId}" type="hidden">
		<tr>
			<td class="list_data_text"><s:property value="#cpl.plaDate"/></td>
			<td class="list_data_ltext"><s:property value="#cpl.plaTodo"/></td>
			<td class="list_data_ltext">
				<input name="salplan.salPlanResult"  value="<s:property value='#cpl.plaResult'/>
				<input type="submit"  class="common_button"  value="保存" >
			</td>
		</tr>
		</form>
	</s:iterator>
	</table>
</body>
</html>