<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
<script type="text/javascript" src="${basePath}/html/js/planAjax.js"></script>
<script type="text/javascript" src="${basePath}/html/js/jquery-1.4.2.min.js"></script>
</head>
<body>

<div class="page_title">客户开发计划 &gt; 制定计划</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('dev_execute.html');">执行计划</button>
	<button class="common_button" onclick="back();">返回</button>
</div>
	<table class="query_form_table">
		<tr>
			<th>编号</th>
			<td><s:property value="salChances.chcId"/></td>
			<th>机会来源</th>
			<td></td>
		</tr>
		<tr>
			<th>客户名称</th>
			<td><s:property value="salChances.chcCustName"/></td>
			<th>成功机率（%）</th>
			<td>&nbsp;</td>
		</tr>	
		<tr>
			<th>概要</th>
			<td colspan="3"><s:property value="salChances.chcTitle"/></td>
		</tr>
		<tr>
			<th>联系人</th>
			<td><s:property value="salChances.chcLinkman"/></td>
			<th>联系人电话</th>
			<td><s:property value="salChances.chcTel"/></td>
		</tr>
		<tr>
			<th>机会描述</th>
			<td colspan="3"><s:property value="salChances.chcDesc"/></td>
		</tr>
		<tr>
			<th>创建人</th>
			<td><s:property value="salChances.chcCreateBy"/></td>
			<th>创建时间</th>
			<td><s:property value="salChances.chcCreateDate"/></td>
		</tr>
		<tr>
			<th>指派给</th>
			<td><s:property value="salChances.chcDueTo"/></td>
			<th>指派时间</th>
			<td><s:property value="salChances.chcDueDate"/></td>
		</tr>
	</table>
<br />
	<table class="data_list_table" id="table1">
			<tr>
				<th width="150px">日期</th>
				<th height="31">计划项</th>
			</tr>
			<s:iterator var="salChances.salPlan" vaule="ss">
				<tr>
					<td class="list_data_text" height="24"><s:property value="#ss.plaDate"/></td>
					<td class="list_data_ltext" height="24">
						<input size="50" value="<s:property value="#ss.plaTodo"/>" id="to_do"/>
						<button class="common_button" onmousedown="ajaxPlan(<s:property value='#ss.plaId'/>)">保存</button>
						<button class="common_button" onclick="del('');">删除</button>
					</td>
				</tr>
			</s:iterator>
	</table>
	<div class="button_bar">
		<button class="common_button" onclick="add('dev_plan.html');">保存</button>
	</div>
	<table class="query_form_table" id="table2">
		<tr>
			<th>日期</th>
			<td><input /><span class="red_star">*</span></td>
			<th>计划项</th>
			<td><input size="50" name="T2" /><span class="red_star">*</span></td>
		</tr>
	</table>
</body>
</html>