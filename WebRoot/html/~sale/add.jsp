<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp" %>

<%@ page language="java"%> 
<%@ page contentType="text/html; charset=utf-8"%> 
<%@ page import="java.util.*"%> 
<%@ page import="java.text.*"%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
</head>
<body>
<form action="${basePath}html/salchance_save" method="post">
<div class="page_title">销售机会管理&nbsp; &gt; 新建销售机会</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" type="submit">保存</button>  
</div>
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><input readonly /></td>
		<th>机会来源</th>
		<td>
			<input name="chcSource" size="20" /></td>
	</tr>
	<tr>
		<th>客户名称</th>
		<td><input name="chcCustName"/><span class="red_star">*</span></td>
		<th>成功机率</th>
		<td><input name="chcRate"/><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>概要</th>
		<td colspan="3"><input name="chcTitle" size="52" /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>联系人</th>
		<td><input name="chcLinkman" size="20" /></td>
		<th>联系人电话</th>
		<td><input name="chcTel" size="20" /></td>
	</tr>
	<tr>
		<th>机会描述</th>
		<td colspan="3"><textarea rows="6" cols="50" name="chcDesc"></textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>创建人</th>
		<td><input name="chcCreateBy" value="五条杠大队长" readonly size="20" /><span class="red_star">*</span></td>
		<th>创建时间</th>
		<% String datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()); //获取系统时间 %>
		<td><input name="chcCreateDate" name="T15" readonly size="20" value="<%=datetime%>" /><span class="red_star">*</span></td>
	</tr>
</table>
<br />
<table disabled class="query_form_table" id="table1">
	<tr>
		<th>指派给</th>
		<td>
			<select name="chcDueTo">
				<option value=null>请选择...</option>
				<option value="小明">小明</option>
				<option value="旺财">旺财</option>
				<option value="球球">球球</option>
				<option value="孙小美">孙小美</option>
				<option value="周洁伦">周洁轮</option>
			</select> <span class="red_star">*</span></td>
		<th>指派时间</th>
		<td>
		
			
			<input name="chcDueDate" name="T20" readonly size="20"  value="<%=datetime%>"/><span class="red_star">*</span></td>
	</tr>
</table>
<script>
	setCurTime('t1');
	setCurTime('t2');
</script>
</form>
</body>
</html>