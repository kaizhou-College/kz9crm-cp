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

<div class="page_title">客户流失管理</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="reload();">查询</button> 
	<script type="text/javascript" src="${basePath}/html/js/jquery-1.4.2.min.js"></script>
	<script type="text/javascript">
		function reload(){
		alert(1);
		alert($("#froms").serialize());
		$.ajax({
		type:"POST",
		url:"cstLost_supersel",
		data:$("#froms").serialize(),
		success:function(data){
			alert(data);
			$("#cstLost_list").html(data);
		},
		error:function(){
			alert("ajax错误");
		}
	});
}
	
	
	</script> 
</div>
<form id="froms">
	<table class="query_form_table">
			<tr>
				<th>客户</th>
				<td><input id="cstname" name="cstLostTemp.cstname"/></td>
				<th>客户经理</th>
				<td><input id="cstmangername" name="cstLostTemp.cstmangername"/></td>
				<th>状态</th>
				<td>
					<s:select list="#{'全部':'全部','预警':'预警','暂缓流失':'暂缓流失','确认流失':'确认流失'}" name="cstLostTemp.zt"  id="zt"></s:select>
					<!--<select>
						<option>全部</option>
						<option>预警</option>
						<option>暂缓流失</option>
						<option>确认流失</option>
					</select>
				-->
				</td>
			</tr>
	</table>
</form>
<br />
	<table class="data_list_table">
		<thead>
				<tr>
					<th>编号</th>
					<th>客户</th>
					<th>客户经理</th>
					<th>上次下单时间</th>
					<th>确认流失时间</th>
					<th>状态</th>
					<th>操作</th>
				</tr>
		</thead>
			<tbody id="cstLost_list">	
				<jsp:include page="listDim.jsp"></jsp:include>
			</tbody>
	</table>
	<script type="text/javascript">
		function fromKip(){
			var page=document.getElementById("pageIndex").value;
			location.href="'+${pageUrl}+'?pageIndex="+page;
		}
	</script>
</body>
</html>
