<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/comm/comm.jsp" %>
	<s:iterator var="listcstLost" value="listcstLost">
	<tr>
		<td class="list_data_number"><s:property value="#listcstLost.lstId"/></td>
		<td class="list_data_text"><s:property value="#listcstLost.lstCustName"/></td>
		<td class="list_data_ltext"><s:property value="#listcstLost.lstCustManagerName"/></td>
		<td class="list_data_text"><s:property value="#listcstLost.lstLastOrderDate"/></td>
		<td class="list_data_text"><s:property value="#listcstLost.lstLostDate"/></td>
		<td class="list_data_text">暂缓流失</td>
		<td class="list_data_op">
			<img onclick="to('confirm.html');" title="确认流失" src="${basePath}/html/images/bt_confirm.gif" class="op_button" />
			<img onclick="to('relay.html');" title="暂缓流失" src="${basePath}/html/images/bt_relay.gif" class="op_button" />
			
		</td>
	</tr>
	</s:iterator>
	<tr>
		<th colspan="7" class="pager">
			<comcp:queryByPage count="${listpage.count}" pageIndex="${listpage.pageIndex}" pageSize="${listpage.pageSize}" pageMax="${listpage.pageMax}" pageUrl="${listpage.pageUrl}"></comcp:queryByPage>
		</th>
	</tr>
