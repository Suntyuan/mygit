<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>用户注册</title>
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link rel="stylesheet" type="text/css" href="styles.css" />
  </head>  	
  <body> 
  	<html:form action="/user" method="post">
      <input type="hidden" name="operate" value="doAdd" />
      <html:hidden property="item.userStatus" value="1" />      
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
		  		<div class="c_title">系统消息</div>
		  		<div class="c_content"> 		  		
					 <ul style="color:red;list-style-type:circle;">
					 	${msg}
					 </ul>
					 点<a href="${backurl}" style="color:red;">这里</a>返回${backname}。
	 	  		</div>
		  		<div class="c_foot">&nbsp;</div>
		  	</div>
	  </div>
	  <div id="footer" class="center">
	  </div>
    </html:form>
  </body>
</html:html>