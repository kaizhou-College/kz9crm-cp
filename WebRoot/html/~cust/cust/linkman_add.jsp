<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
</head>
<body>
<form action="${basePath}html/cstLinkman_add" method="post">
<div class="page_title">客户信息管理 > 客户信息 > 联系人 > 新建联系人</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="save('linkman.html');">保存</button>  
</div>
<table class="query_form_table" id="table1">
	<tr>
		<th>姓名</th>
		<td>
		<input type="hidden" value="<s:property value="custNo"/>" name="custNo">
		<input type="hidden"  name="lkmId" value="">
		<input  name="lkmName"  size="20"  /><span class="red_star">*</span></td>
		<th>性别</th>
		<td>
		<s:radio list="{'男','女'}" name="lkmSex" />
		</td>
	</tr>
	<tr>
		<th>职位</th>
		<td><input name="lkmPostion"  size="20" /><span class="red_star">*</span></td>
		<th>办公电话</th>
		<td><input name="lkmTel"  size="20" /><span class="red_star">*</span></td>
	</tr>	
	<tr>
		<th>手机</th>
		<td><input name="lkmMobile"  size="20" /></td>
		<th>备注</th>
		<td><input name="lkmMemo" size="20"  /></td>
	</tr>
</table>
</form>
</body>
</html>
<s:debug></s:debug>