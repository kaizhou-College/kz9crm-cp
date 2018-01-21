<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@include file="/comm/comm.jsp" %>
<%@ page language="java"%> 
<%@ page contentType="text/html; charset=utf-8"%> 
<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
</head>
<body>
<form action="${basePath}html/cstService_add" method="post">
<div class="page_title">客户服务管理 > 服务创建</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="add('add.html');">保存</button>  
</div>

			
<table class="query_form_table">
	<tr>
		<th>编号</th>
		<td><input disabled /></td>
		<th>服务类型</th>
		<td>
		<s:select name="svrType" list="{'请选择','咨询','投诉','建议'}"></s:select>
			</select><span class="red_star">*</span>
		</td>
	</tr>
	<tr>
		<th>概要</th>
		<td colspan="3"><input size="53" name="svrTitle"/><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>客户</th>
		<td><input name="svrCustName" size="20" /><span class="red_star">*</span></td>
		<th>状态</th>
		<td><input name="svrStatus" value="新创建" readonly="readonly"></td>
	</tr>	
	<tr>
		<th>服务请求</th>
		<td colspan="3"><textarea rows="6" cols="50" name="svrRequest"></textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>创建人</th>
		<td><input name="svrCreateBy" value="大哥" readonly size="20" /><span class="red_star">*</span></td>
		<th>创建时间</th>
		<% String datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()); //获取系统时间 %>
		<td><input id="t1" name="svrCreateDate" readonly size="20"  value="<%=datetime%>"/><span class="red_star">*</span></td>
	</tr>
	</table>
<br />
<table disabled class="query_form_table" id="table3">
	<tr>
		<th>分配给</th>
		<td>
		<s:select name="svrDueId" list="#{1:'小明',2:'旺财',3:'球球',4:'孙小美',5:'周洁伦'}" ></s:select>
			 <span class="red_star">*</span></td>
		<th>分配时间</th>
		<td><input id="t2" name="svrDueDate" readonly size="20" value="<%=datetime%>" /><span class="red_star">*</span></td>
	</tr>
</table>
<br />	
<table disabled class="query_form_table" id="table1">
	<tr>
		<th>服务处理</th>
		<td colspan="3"><textarea rows="6" cols="50" name="svrDeal"></textarea><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>处理人</th>
		<td><input name="svrDealBy" value="刘颖" readonly size="20" /><span class="red_star">*</span></td>
		<th>处理时间</th>
		<td><input id="t3" name="svrDealDate" readonly size="20" value="<%=datetime%>"/><span class="red_star">*</span></td>
	</tr>
</table>
<br />
<table disabled class="query_form_table" id="table2">
	<tr>
		<th>处理结果</th>
		<td><input name="svrResult" size="20" /><span class="red_star">*</span></td>
		<th>满意度</th>
		<td>
		<s:select name="svrSatisfy" list="#{0:'请选择..',1:'☆☆☆☆☆',2:'☆☆☆☆',3:'☆☆☆',4:'☆☆',5:'☆'}" value="%{cstCustomer.custSatisfy}"></s:select>
			<span class="red_star">*</span></td>
	</tr>
</table>
<script>
</script>
</form>
</body>
</html>