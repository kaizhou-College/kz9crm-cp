<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@include file="/comm/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/script/common.js"></script>
</head>
<body>

<form action="${basePath}html/cstService_superselect3" method="post">
<div class="page_title">客户服务管理 > 服务反馈</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<input type="submit" class="common_button"  value="查询">
</div>
<table class="query_form_table" height="53">
	<tr>
		<th height="28">客户</th>
		<td><input name="cstService.svrCustName" value="<s:property value="cstService.svrCustName"/>"/></td>
		<th height="28">概要</th>
		<td><input name="cstService.svrTitle" value="<s:property value="cstService.svrTitle"/>"/></td>
		<th height="28">服务类型</th>
		<td>
		<s:select list="#{'':'全部','咨询':'咨询','建议':'建议','投诉':'投诉'}" name="cstService.svrType" value="<s:property value='cstService.svrType'/>"></s:select>
		</td>
	</tr>
	<tr>
		<th height="22">创建日期</th>
		<td colspan="3">
			<input name="date1" size="10" value="<s:property value='date1'/>"/> - <input name="date2" size="10" value="<s:property value='date2'/>" /></td>
		<th height="22">状态</th>
		<td>
		<s:select list="#{'':'全部','新创建':'新创建','已归档':'已归档'}" name="cstService.svrStatus" value="<s:property value='cstService.svrStatus'/>"></s:select>
		</td>
	</tr>
</table>
<br />
</form>
<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>客户</th>
		<th>概要</th>
		<th>服务类型</th>
		<th>创建人</th>
		<th>创建日期</th>
		<th>操作</th>
	</tr>
	<s:iterator value="cstServicelist" var="cstServicelist">
	<tr>
		<td class="list_data_number"><s:property value="#cstServicelist.svrId"/></td>
		<td class="list_data_text"><s:property value="#cstServicelist.svrCustName"/></td>
		<td class="list_data_ltext"><s:property value="#cstServicelist.svrTitle"/></td>
		<td class="list_data_text"><s:property value="#cstServicelist.svrType"/></td>
		<td class="list_data_text"><s:property value="#cstServicelist.svrCreateBy"/></td>
		<td class="list_data_text"><s:property value="#cstServicelist.svrCreateDate"/></td>
		<td class="list_data_op">
						
			<img onclick="to('${basePath}html/cstService_todetail2?svrId=<s:property value="#cstServicelist.svrId"/>');" title="处理" src="${basePath}/html/images/bt_feedback.gif" class="op_button" />  
			
		</td>
	</tr>
	</s:iterator>
	<tr>
		<th colspan="7" class="pager">
<div class="pager">
<comcp:queryByPage count="${listpage.count}" pageIndex="${listpage.pageIndex}" pageSize="${listpage.pageSize}" pageMax="${listpage.pageMax}" pageUrl="${listpage.pageUrl}"></comcp:queryByPage>
</div>
		</th>
	</tr>
</table>
</body>
</html>
<s:debug></s:debug>