<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<script>
function SwitchDisplay(oid){
	var o = document.getElementById(oid);
	if (o){
		if (o.style.display == "none"){ o.style.display = "block"; } else {o.style.display = "none";}
	}
}
</script>
<%@page import="y2ssh.zhangcuishan.util.JbUtils"%>
<logic:iterate id="item" name="list">
<div class="goods_pic"><img src="${item.goodsPic}" title="${item.goodsDesc}" style="width:100px;border:dashed 1px green;"></img></div>
<div class="goods_info" style="border:solid 0px blue;">
	<strong>${item.goodsName}</strong><br />
	<span class="info_title">卖  &nbsp;   家</span>&nbsp;<em>${item.saler.userName}</em> <br />
	<span class="info_title">起 拍 价</span>&nbsp;<span style="color:green;">${item.goodsPrice}</span><br />
	<span class="info_title">起拍日期</span>&nbsp;${item.beginTimeString}<br />
	<span class="info_title">终止日期</span>&nbsp;${item.endTimeString}
	<logic:notEmpty name="user" scope="session">
	<logic:greaterEqual name="item" property="endTimeString" value="<%=JbUtils.now() %>">
		<logic:lessEqual name="item" property="beginTimeString" value="<%=JbUtils.now() %>">
			<logic:notEqual name="item" property="saler.userId" value="${sessionScope.user.userId}">
				<a class="a_button" href="goods.do?operate=doBid&goods_id=${item.goodsId}">出价</a>
			</logic:notEqual>
		</logic:lessEqual>
	</logic:greaterEqual>
	</logic:notEmpty>	
</div>
<logic:notEmpty name="item" property="bids">
	<div style="width:300px;padding-left:10px;">
	出价记录: [<span style="color:blue;cursor:hand;text-decoration: underline;" onclick="javascript:SwitchDisplay('div${item.goodsId}');">+/-</span>] <br />
	<div style="display:none;" id="div${item.goodsId}">
	<logic:iterate id="bid" name="item" property="bids">
		<em>${bid.buyer.userName}</em>
		<bean:write name="bid" property="bidTime" format="yyyy-MM-dd hh:mm" /> 
		<span style="color:green;font-weight:bold;">${bid.bidPrice}</span><br />
	</logic:iterate>
	</div>
	</div>
</logic:notEmpty>

<div style="padding-top:7px;padding-left:3px "><img style="width:333px;" src="images/hline3.gif"></div>
</logic:iterate>
<div class="page_info"></div>
	