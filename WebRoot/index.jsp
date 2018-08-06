<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<logic:present name="msg">
<script>
	alert('${msg}');
</script>
<%
	session.removeAttribute("msg");
 %>
</logic:present>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>e拍</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="styles.css">
<script >
var xmlHttpRequest;
var curUserName;
function createXmlHttpRequest(){
	if(window.ActiveXObject){
		return new ActiveXObject("Microsoft.XMLHTTP");
	}else if(window.XMLHttpRequest){
		return new XMLHttpRequest();
	}
}
function doLogin(){
	var usr  = document.getElementById("usr");
	var pwd  = document.getElementById("pwd");
	if (usr.value==""){
		alert("用户名不能为空");
		usr.focus();
		return ;
	}
	if (pwd.value==""){
		alert("密码不能为空");
		pwd.focus();
		return ;
	}
	curUserName = usr.value;
	var url = "user.do?operate=doLogin&username=" + usr.value + "&password=" + pwd.value;
	xmlHttpRequest = createXmlHttpRequest();
	xmlHttpRequest.onreadystatechange = haoLeJiaoWo;	    
    xmlHttpRequest.open("GET",url,true);
    xmlHttpRequest.send(null);
}
function haoLeJiaoWo(){
	if(xmlHttpRequest.readyState == 4){     
         if(xmlHttpRequest.status == 200){
            var str = xmlHttpRequest.responseText;
            alert(str);
			if ("登录成功"==str){
            	document.getElementById("spUsername").innerText = curUserName;
            	document.getElementById("dvLogin").style.display = "none";
            	document.getElementById("dvOnline").style.display = "block";
            }
         }
     }
}
</script>
  </head>
  
  <body>

 	<div id="header" class="center">
	  	<img src="images/logo.gif" style="width:638px;text-align:left;"></img>	
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
					<div class="dia_title">最新添加</div>
			  		<div class="dia_content2" style="height:359px;">
			  			<!-- div class="list_item">
			  				<img src="images/arr.gif">&nbsp; <a href="#" class="menu">Computers</a>
			  			</div -->
			  			
			  		</div>
			  		<div class="dia_foot2">&nbsp;</div>
			  	</div> <!-- end of menu -->
		  	</div> <!-- end of left --> 
		  	<div id="middle">
			  		<div class="m_title">
			  		</div>
			  		<div class="bar"></div>
			  		<div class="m_content" style="height:369px;width:340px;overflow-y:scroll;">
						<bean:include id="t" page="/goods.do?operate=toOnSaleGoodsList"/>						
						<bean:write name="t" filter="false" />
			  		</div>
			  		<div class="m_foot">
			  		</div>
		  	</div>
		  	 <div id="right">
			  	<div id="search">
			  		<div class="dia_title">我的e拍</div>
			  		<div class="dia_content" style="height:150px;padding:12px 2px 0 15px;">
			  		
						<div id="dvOnline" style="display:none;height:137px;background:url(images/myepai.gif)  no-repeat;">
				  			<span id="spUsername" style="font-weight:bold;"></span>   大驾光临
				  			<ul style="color:#0c0c0c;list-style-type:circle;margin:8px 16px;">
							 	<li><a href="goods.do?operate=toAdd">发布商品</a></li>
							 	<li>我的宝贝</li>
							 </ul>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							 <a href="user.do?operate=doLogout" class="a_button">注销</a> 
			  			</div>
						<div id="dvLogin">
			  			用户名：<input type="text" name="username" id="usr" style="width:60px;" /> <br />
			  			密&nbsp;&nbsp;码：<input type="password" name="password" id="pwd" style="width:60px;" /> 
			  			<br />
			  			<a href="user.do?operate=toAdd" class="a_button">用户注册</a>&nbsp;
			  			<button class="button" onclick="javascript:doLogin();" style="width:40px;">登录</button> <br />  
			  			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			  			<img src="images/login.gif" style="width:75px;"></img>
			  			</div>

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
			  	</div> <!-- end of menu -->
		  	</div> <!-- end of right --> 
      </div> <!-- end of main -->
	  <div id="footer" class="center">
	  </div>
  
    
  </body>
</html>
