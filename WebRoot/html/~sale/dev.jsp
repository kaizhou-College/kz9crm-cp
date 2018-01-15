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
<div class="page_title">客户开发计划</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload1();">查询</button> 
</div>
<form id="froms">
<table class="query_form_table">
		<tr>
				<th>客户名称</th>
				<td><input id="cname" name="salPlanTemp.cname" /></td>
				<th>概要</th>
				<td><input id="cdesc" name="salPlanTemp.cdesc" /></td>
				<th>联系人</th>
				<td>
					<input id="lxr" name="salPlanTemp.lxr" size="20" />
				</td>
		</tr>
</table>
</form>
<br />
<table class="data_list_table">
	<thead>
		<tr>
			<th>编号</th>
			<th>客户名称</th>
			<th>概要</th>
			<th>联系人</th>
			<th>联系人电话</th>
			<th>创建时间</th>
			<th>状态</th>
			<th>操作</th>
		</tr>
	</thead>
	
		<tbody id="plan_list">	
			<jsp:include page="devTemp.jsp"></jsp:include>
		</tbody>
</table>
	<script type="text/javascript">
		function formSkip(){
			var page=document.getElementById("pageIndex").value;
			location.href="'+${pageUrl}+'?pageIndex="+page;
		}
		
	</script>
</body>
</html>