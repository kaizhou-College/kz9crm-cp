<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/comm/comm.jsp" %>
<s:iterator value="ListsalChance" var="ListsalChance">
		<tr>
			<td class="list_data_number"><s:property value="#ListsalChance.chcId"/></td>
			<td class="list_data_text"><s:property value="#ListsalChance.chcCustName"/></td>
			<td class="list_data_ltext"><s:property value="#ListsalChance.chcTitle"/></td>
			<td class="list_data_text"><s:property value="#ListsalChance.chcLinkman"/></td>
			<td class="list_data_text"><s:property value="#ListsalChance.chcTel"/></td>
			<td class="list_data_text"><s:property value="#ListsalChance.chcCreateDate"/></td>
			<td class="list_data_text">
				<s:if test="#ListsalChance.salChance.chcStatus<4">
					开发中
				</s:if><s:else>
					已结档
				</s:else>
			</td>
			<td class="list_data_op">
				<s:if test="#ListsalChance.chcStatus<4">
					<img onclick="to('salPlan_planList?salChance.chcId=<s:property value='#ListsalChance.chcId'/>');" title="制定计划" src="${basePath}/html/images/bt_plan.gif" class="op_button" />
					<img onclick="to('~sale/dev_execute.html');" title="执行计划" src="${basePath}/html/images/bt_feedback.gif" class="op_button" />
					<img onclick="alert('用户开发成功，已添加新客户记录。');" title="开发成功" src="${basePath}/html/images/bt_yes.gif" class="op_button" />
				</s:if><s:else>
					<img onclick="to('salPlan_planListSuccess?salChance.chcId=<s:property value='#ListsalChance.chcId'/>');" title="查看" src="${basePath}/html/images/bt_detail.gif" class="op_button" />
				</s:else>
			</td>
		</tr>
</s:iterator>	
	<tr>
		<th colspan="10" class="pager">
			<div class="pager" >
				<comcp:queryByPage count="${listpage.count}" pageIndex="${listpage.pageIndex}" pageSize="${listpage.pageSize}" pageMax="${listpage.pageMax}" pageUrl="${listpage.pageUrl}"></comcp:queryByPage>
			</div>
		</th>
	</tr>