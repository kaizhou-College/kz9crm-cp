<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/comm/comm.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>jb-aptech毕业设计项目</title>
		<link href="${basePath}html/css/style.css" rel="stylesheet"
			type="text/css">
		<script src="${basePath}html/script/common.js">
</script>
		<script src="${basePath}html/script/validate.js">
</script>
	</head>

	<body>
		<div class="page_title">
			权限管理 > 用户管理 > 系统角色管理
		</div>
		<html:form action="/role" method="post">
			<html:hidden property="o" value="toRoleList" />
			<div class="button_bar">
				<button class="common_button" onclick="help('');">
					帮助
				</button>
				<button class="common_button"
					onclick="to('${basePath}html/~right/role/add.jsp');">
					新建
				</button>
				<button class="common_button" onclick="add();">
					查询
				</button>
			</div>
			<table class="query_form_table">
				<tr>
					<th>
						角色名
					</th>
					<td>
						<html:text property="sysRole.roleName" size="20"></html:text>
					</td>
					<th>
						角色描述
					</th>
					<td>
						<html:text property="sysRole.roleDesc" size="20"></html:text>
					</td>
					<th>
						是否禁用
					</th>
					<td>
						<html:select property="sysRole.roleFlag">
							<html:option value="0">全部</html:option>
							<html:option value="1">正常</html:option>
							<html:option value="2">禁用</html:option>
						</html:select>
					</td>
				</tr>
			</table>
			<br />
			<table class="data_list_table">
				<tr>
					<th>
						编号
					</th>
					<th>
						角色名
					</th>
					<th>
						角色描述
					</th>
					<%--
					<th>
						状态
					</th>
					--%>
					<th>
						操作
					</th>
				</tr>
				<s:iterator var="listSysRole" value="listSysRole">
					<tr>
						<td class="list_data_text">
							<s:property value="#listSysRole.roleId" />
						</td>
						<td class="list_data_text">
							<s:property value="#listSysRole.roleName" />
						</td>
						<td>
							<s:property value="#listSysRole.roleDesc" />
						</td>
						<%--
						<td class="list_data_text">
							<c:if test="${listSysRole.roleFlag==1}">
	   							正常
	   						</c:if>
							<c:if test="${listSysRole.roleFlag==2}">
	   							禁用
	   						</c:if>
						</td>
						--%>
						<td class="list_data_op">
								
							<img 
								onclick="to('${basePath}sysRole_toupdate?sysRole.roleId='+<s:property 
								value="#listSysRole.roleId"/>);" title="编辑" src="${basePath}html/images/bt_edit.gif"
								class="op_button"  />
							<img
								onclick="to('role.do?o=toDispatchRight&roleId=${sysRole.roleId }')"
								title="分配权限" src="${basePath}html/images/bt_linkman.gif"
								class="op_button" />
							<img
								onclick="to('${basePath}sysRole_select?sysRole.roleId='+<s:property 
								value="#listSysRole.roleId"/>);"
								title="查看" src="${basePath}html/images/bt_deal.gif"
								class="op_button" />
							<img
								onclick="del('${sysRole.roleName}','role.do?o=toDeleteSysRole&roleId=${sysRole.roleId }');"
								title="删除" src="${basePath}html/images/bt_del.gif"
								class="op_button" />
						</td>
					</tr>
				</s:iterator>
				<tr>
					<th colspan="7" class="pager">
						<div class="pager">
							<comcp:queryByPage count="${listpage.count}"
								pageIndex="${listpage.pageIndex}"
								pageSize="${listpage.pageSize}" pageMax="${listpage.pageMax}"
								pageUrl="${listpage.pageUrl}"></comcp:queryByPage>
					</div>
				</th>
			</tr>
	</body>
</html>
${msg}

