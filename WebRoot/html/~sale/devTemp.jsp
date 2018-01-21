<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/comm/comm.jsp" %>
<s:iterator value="listSalChance" var="listSalChance">
		<tr>
			<td class="list_data_number"><s:property value="#listSalChance.chcId"/></td>
			<td class="list_data_text"><s:property value="#listSalChance.chcCustName"/></td>
			<td class="list_data_ltext"><s:property value="#listSalChance.chcTitle"/></td>
			<td class="list_data_text"><s:property value="#listSalChance.chcLinkman"/></td>
			<td class="list_data_text"><s:property value="#listSalChance.chcTel"/></td>
			<td class="list_data_text"><s:property value="#listSalChance.chcCreateDate"/></td>
			<td class="list_data_text">
				<s:if test="#listSalChance.chcStatus<4">
				开发中
			</s:if>
			<s:else>
				已结档
			</s:else>
			</td>
			<td class="list_data_op">
				<s:if test="#listSalChance.chcStatus<4">
				<img onclick="to('salPlan_planListShow?salChance.chcId=<s:property value='#listSalChance.chcId'/>');" title="制定计划" src="${basePath}/html/images/bt_plan.gif" class="op_button" />
				<img onclick="to('salPlan_planList?salChance.chcId=<s:property value='#listSalChance.chcId'/>');" title="执行计划" src="${basePath}/html/images/bt_feedback.gif" class="op_button" />
				<img onclick="to('salPlan_planSuccess?salChance.chcId=<s:property value='#listSalChance.chcId'/>')" title="开发成功" src="${basePath}/html/images/bt_yes.gif" class="op_button" />
			</s:if><s:else>
				<img onclick="to('salPlan_planListSuccess?salChance.chcId=<s:property value='#listSalChance.chcId'/>');" title="查看" src="${basePath}/html/images/bt_detail.gif" class="op_button" />
			</s:else>
			</td>
		</tr>
</s:iterator>	
	<tr>
		<th colspan="10" class="pager">
			<div class="pager" >
				<comcp:queryByPage count="${count}" pageIndex="${pageIndex}" pageSize="${pageSize}" pageMax="${pageMax}" pageUrl="${pageUrl}"></comcp:queryByPage>
			</div>
		</th>
	</tr>