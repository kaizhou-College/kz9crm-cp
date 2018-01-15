<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
<%--<script type="text/javascript" src="${basePath}/html/js/planAjax.js"></script>
--%><script type="text/javascript" src="${basePath}/html/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript">
	function ajaxPlan(id){
		$.ajax({
		type:"POST",
		url:"salPlan_ajaxPlan",
		data:{"salplan.plaId":id,"salplan.plaTodo":$("#to_do").val()},
		error:function(){
			alert("ajaxPlan");
		}
	});
}


</script>
</head>
<body>

<div class="page_title">客户开发计划 &gt; 制定计划</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('${basePath}/html/~sale/dev_execute.jsp');">执行计划</button>
	<button class="common_button" onclick="back();">返回</button>
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
				<th width="150px">日期</th>
				<th height="31">计划项</th>
			</tr>
			<s:iterator var="chancePlanList.salPlan" value="ss">
				<tr>
					<td class="list_data_text" height="24"><s:property value="#ss.plaDate"/></td>
					<td class="list_data_ltext" height="24">
						<input size="50" value="<s:property value="#ss.plaTodo"/>" id="to_do"/>
						<button class="common_button" onmousedown="ajaxPlan(<s:property value='#ss.plaId'/>)">保存</button>
						<button class="common_button" onmousedown="salPlanDel('${ss.plaId}','${chancePlanList.chcId}')">删除</button>
					</td>
				</tr>
			</s:iterator>
	</table>
	<div class="button_bar">
		<button class="common_button" onmousedown="Add('${chancePlanList.chcId}')">保存</button>
	</div>
	<table class="query_form_table" id="table2">
		<tr>
			<th>日期</th>
			<td><input name="salPlanDate" id="salPlanDate"/><span class="red_star">*</span></td>
			<th>计划项</th>
			<td><input size="50" name="T2" id="T2" /><span class="red_star">*</span>
			<button class="common_button" onmousedown="Add('${chancePlanList.chcId}')">保存</span></td>
		</tr>
	</table>
<script type="text/javascript">
	setCurTime('plaDate');
	function Add(id){
		location.href="salPlan_salPlanAdd?salChance.chcId="+id+"&salplan.plaDate="+$('#salPlanDate').val()+"&salplan.plaTodo="+$('#T2').val();
	}
	function salPlanDel((id,id1){
		location.href="salPlan_salPlanDel?salplan.plaId="+id+"&salChance.chcId="+id1;
	}
</script>
</body>
</html>