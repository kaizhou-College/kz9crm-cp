<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp" %>
<html>
<head>
<title>客户关系管理系统</title>
</head>

<body style="border-bottom:solid 1px #666;">

<TABLE style="width:100%;">
<TR >
	<td ><img src="${basePath}/html/images/logo.gif"></td>
	<td style="font-family:黑体;font-size:33px;font-weight:bold;"> 客户关系管理系统</td>	
	<td width="25%" align="right" style="font-size:12px;" valign="bottom">当前用户：${loginUser.usrName}(${loginUser.sysRole.roleName})&nbsp;&nbsp; 退出系统 </td>
</tr>
</table>
</body>
</html>
