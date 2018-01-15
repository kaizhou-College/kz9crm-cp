<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@include file="/comm/comm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>jb-aptech毕业设计项目</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="${basePath}/html/css/style.css" rel="stylesheet" type="text/css">
<script src="${basePath}/html/js/jquery-1.4.2.min.js"></script>
<script src="${basePath}/html/script/common.js"></script>
<SCRIPT type="text/javascript"><%--
	$(function(){
		$(".pager").click(function(){
			
			alert(1);
		});
		
	})
--%></SCRIPT>
</head>
<body>

<div class="page_title">数据字典管理</div>

<form action="${basePath}html/basDict_superselect" method="post">
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<input type="button" class="common_button" onclick="to('${basePath}html/~basd/dict_add.jsp');" value="新建">
	<input class="common_button" type="submit" value="查询"/> 
</div>

<table class="query_form_table">
	<tr>
		<th>类别</th>
		<td><input name="basDict.dictType" value="<s:property value="basDict.dictType"/>"/></td>
		<th>条目</th>
		<td><input name="basDict.dictItem" value="<s:property value="basDict.dictItem"/>"/></td>
		<th>值</th>
		<td><input name="basDict.dictValue" value="<s:property value="basDict.dictValue"/>"/></td>
	</tr>
</table>
</form>

<br />
<table class="data_list_table">
	<tr>
		<th>编号</th>
		<th>类别</th>
		<th>条目</th>
		<th>值</th>
		<th>是否可编辑</th>
		<th>操作</th>
	</tr>
	<s:iterator var="basDictlist" value="basDictlist">
	<tr>
		<td class="list_data_number"><s:property value="#basDictlist.dictId"/></td>
		<td class="list_data_ltext"><s:property value="#basDictlist.dictType"/></td>
		<td class="list_data_text"><s:property value="#basDictlist.dictItem"/></td>
		<td class="list_data_text"><s:property value="#basDictlist.dictValue"/></td>
		<td class="list_data_text"><s:if test="#basDictlist.dictIsEditable!=1">否</s:if></td>
		<td class="list_data_op">
		<s:if test="#basDictlist.dictIsEditable==1">
			<img onclick="to('${basePath}html/basDict_toupdate?dictId=<s:property value="#basDictlist.dictId"/>');" title="编辑" src="${basePath}/html/images/bt_edit.gif" class="op_button" />
			<img onclick="to('${basePath}html/basDict_delete?dictId=<s:property value='#basDictlist.dictId'/>');" title="删除" src="${basePath}/html/images/bt_del.gif" class="op_button" />
		</s:if>
		</td>
	</tr>
	</s:iterator>
	<tr>
		<th colspan="6" class="pager">
<div class="pager" >
	<comcp:queryByPage  count="${listpage.count}" pageIndex="${listpage.pageIndex}"  
	pageSize="${listpage.pageSize}" pageMax="${listpage.pageMax}" pageUrl="${listpage.pageUrl}"></comcp:queryByPage>

</div>
		</th>
	</tr>
</table>
</body>
</html>
<s:debug></s:debug>