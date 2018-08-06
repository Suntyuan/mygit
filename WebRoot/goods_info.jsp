<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html>
  <head>
    <html:base />
    
    <title>添加商品</title>
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link rel="stylesheet" type="text/css" href="styles.css" />	
	<link type="text/css" rel="stylesheet" href="cal/calendar-system.css"/>
	<script type="text/javascript" src="cal/calendar.js"></script>
	<script type="text/javascript" src="cal/calendar-en.js"></script>
	<script language="JavaScript" src="cal/calShow.js" ></script>	
	<script src="validate.js" ></script>
	 <script>
  		function doSubmit(){
  			if (Validator.Validate(document.forms[0],3)) {
	  			document.forms[0].submit();
	  		}
		}
		function setGoodsPic(url){
			var oImg = document.getElementById("goodsPic");
			oImg.src = url;
//			oImg.style.width = "400px";
			oImg.style.height = "240px";
		}
	  </script>	
  </head>  	
  <body> 
  	<html:form action="/goods" method="post">
      <input type="hidden" name="operate" value="doAdd" />
      <html:hidden property="item.goodsStatus" value="1" />      
	  <div id="header" class="center">
	  	<img src="images/epai_logo.gif" style="width:110px;margin:10px;"></img>	
	  </div>
	  <div id="main" class="center">
		  <div id="left">
			  	<div id="search">
			  		<div class="dia_title">查找商品</div>
			  		<div class="dia_content" style="height:150px;">
			  			&nbsp;
			  		</div>
			  		<div class="dia_foot"></div>
			  	</div>
			  	<div id="menu">
					<div class="dia_title">正在热拍</div>
			  		<div class="dia_content2" style="height:359px;">
			  			<!-- div class="list_item">
			  				<img src="images/arr.gif">&nbsp; <a href="#" class="menu">Computers</a>
			  			</div -->
			  			
			  		</div>
			  		<div class="dia_foot2">&nbsp;</div>
			  	</div>
		  	</div>
		  	<div id="context">
		  		<div class="c_title">添加商品</div>
		  		<div class="c_content"> 		  		
	 <ul style="color:red;list-style-type:circle;">
	 	${msg}
	 </ul>
	 <table border="0">
        <tr>
          <th>商品名称</th>
          <td><html:text property="item.goodsName" /></td>
        </tr>
        <tr>
          <th>起拍价</th>
          <td><html:text property="item.goodsPrice" /></td>
        </tr>
        <tr>
          <th>图片</th>
          <td><html:text property="item.goodsPic" onblur="javascript:setGoodsPic(this.value);" /></td>
        </tr>
        <tr>
          <th>描述</th>
          <td><html:textarea property="item.goodsDesc" /></td>
        </tr>
        <tr>
          <th>开始拍卖时间</th>
          <td>
          	<html:text property="item.beginTimeString" 
          	readonly="true" onfocus="calShow('item.beginTimeString');" />
          </td>
        </tr>
        <tr>
          <th>截至时间</th>
          <td>
          	<html:text property="item.endTimeString" 
          	readonly="true" onfocus="calShow('item.endTimeString');" />         
          </td>
        </tr>
      </table>
		
			 			<div class="button_bar">
			 				<button onclick="javascript:doSubmit();">&nbsp;&nbsp;&nbsp;提  交&nbsp;&nbsp;&nbsp;</button>
          				</div>
          				<img id="goodsPic" src="images/preview.jpg" style="border:solid 1px green;" />
		  		</div>
		  		<div class="c_foot">&nbsp;</div>
		  	</div>
	  </div>
	  <div id="footer" class="center">
	  </div>
	  <script>
//	  	build_validate("item.userName","用户名不能为空","Limit","1","50");

	  </script>
    </html:form>
  </body>
</html:html>