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
<form action="${basePath}html/cstCustomer_update" method="post">
<s:iterator value="cstCustomer" var="cstCustomer">

<div class="page_title">客户信息管理 > 客户信息</div>
<div class="button_bar">
	<button class="common_button" onclick="help('');">帮助</button>
	<button class="common_button" onclick="to('linkman.html');">联系人</button>
	<button class="common_button" onclick="to('activities.html');">交往记录</button>
	<button class="common_button" onclick="to('orders.html');">历史订单</button>
	
	<button class="common_button" onclick="back();">返回</button>
	<button class="common_button" onclick="save('dict.html');">保存</button>
</div>
<table class="query_form_table">
	<tr>
		<th>客户编号</th>
		<td><input name="custNo" value="<s:property value="cstCustomer.custNo" />" readonly="readonly"></td>
		<th>名称</th>
		<td><input name="custName" value="<s:property value="cstCustomer.custName"/>" /><span class="red_star">*</span></td>
		
	</tr>
	<tr>
		<th>地区</th>
		<td>
		<s:select name="custRegion" list="#{'北京':'北京','华北':'华北','中南':'中南','东北':'东北','西部':'西部'}" value="%{cstCustomer.custRegion}"></s:select>
		
			<span class="red_star">*</span></td>
		<th>客户经理</th>
		<td>
			<s:select name="custManagerId" list="#{1:'小明',2:'旺财',3:'球球',4:'孙小美',5:'周洁伦'}" value="%{cstCustomer.custManagerId}"></s:select>
		
			<span class="red_star">*</span>
			
		</td>
	</tr>	
	<tr>
		<th>客户等级</th>
		<td>
		<s:select name="custLevel" list="#{1:'战略合作伙伴',2:'合作伙伴',3:'大客户',4:'重点开发客户',5:'普通客户'}" value="%{cstCustomer.custLevel}"></s:select>
		
		<span class="red_star">*</span>
		</td>
		<th>　</th>
		<td>　</td>
	</tr>
	<tr>
		<th>客户满意度</th>
		<td>
		<s:select name="custSatisfy" list="#{1:'☆☆☆☆☆',2:'☆☆☆☆',3:'☆☆☆',4:'☆☆',5:'☆'}" value="%{cstCustomer.custSatisfy}"></s:select>
					<span class="red_star">*</span>
		</td>
		<th>客户信用度</th>
		<td>
		<s:select name="custCredit" list="#{1:'☆☆☆☆☆',2:'☆☆☆☆',3:'☆☆☆',4:'☆☆',5:'☆'}" value="%{cstCustomer.custCredit}"></s:select>	
		<span class="red_star">*</span>
		</td>
	</tr>
</table>
<br />
<table class="query_form_table" id="table1">
	<tr>
		<th>地址</th>
		<td><input name="custAddr" value="<s:property value="cstCustomer.custAddr"/>" /><span class="red_star">*</span>
		</td>
		<th>邮政编码</th>
		<td><input  value="<s:property value="cstCustomer.custZip"/>" name="custZip" size="20" /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>电话</th>
		<td>
			<input value="<s:property value="cstCustomer.custTel"/>" name="custTel" size="20"  /><span class="red_star">*</span></td>
		<th>传真</th>
		<td>
			<input value="<s:property value="cstCustomer.custFax"/>" name="custFax" size="20"  /><span class="red_star">*</span>
		</td>
	</tr>	
	<tr>
		<th>网址</th>
		<td>
			<input value="<s:property value="cstCustomer.custWebsite"/>" name="custWebsite" size="20"  /><span class="red_star">*</span>
		</td>
		<th>　</th>
		<td>　</td>
	</tr>
</table>
<br />
<table class="query_form_table" id="table2">
	<tr>
		<th>营业执照注册号</th>
		<td><input value="<s:property value="cstCustomer.custLicenceNo"/>" name="custLicenceNo" size="20" /></td>
		<th>法人</th>
		<td><input value="<s:property value="cstCustomer.custChieftain"/>" name="custChieftain" size="20" /><span class="red_star">*</span>
		</td>
	</tr>
	<tr>
		<th>注册资金（万元）</th>
		<td>
			<input value="<s:property value="cstCustomer.custBankroll"/>" name="custBankroll" size="20" /> </td>
		<th>年营业额</th>
		<td>
			<input value="<s:property value="cstCustomer.custTurnover"/>" name="custTurnover" size="20" />
		</td>
	</tr>	
	<tr>
		<th>开户银行</th>
		<td>
			<input value="<s:property value="cstCustomer.custBank"/>" name="custBank" size="20" /><span class="red_star">*</span>
		</td>
		<th>银行帐号</th>
		<td><input value="<s:property value="cstCustomer.custBankAccount"/>" name="custBankAccount" size="20" /><span class="red_star">*</span></td>
	</tr>
	<tr>
		<th>地税登记号</th>
		<td>
			<input value="<s:property value="cstCustomer.custLocalTaxNo"/>" name="custLocalTaxNo" size="20" /></td>
		<th>国税登记号</th>
		<td><input value="<s:property value="cstCustomer.custNationalTaxNo"/>" name="custNationalTaxNo" size="20" /></td>
	</tr>
</table>
<p>　</p>
</s:iterator>
</form>
</body>
</html>
<s:debug></s:debug>