<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />    
    <title>�û�ע��</title>
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<link rel="stylesheet" type="text/css" href="styles.css" />
	<script src="validate.js" ></script>
	 <script>
  		function doSubmit(){
  			if (Validator.Validate(document.forms[0],3)) {
	  			document.forms[0].submit();
	  		}
		}
	  </script>
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
			  		<div class="dia_title">������Ʒ</div>
			  		<div class="dia_content" style="height:150px;">
			  			&nbsp;
			  		</div>
			  		<div class="dia_foot"></div>
			  	</div>
			  	<div id="menu">
					<div class="dia_title">��������</div>
			  		<div class="dia_content2" style="height:359px;">
			  			<!-- div class="list_item">
			  				<img src="images/arr.gif">&nbsp; <a href="#" class="menu">Computers</a>
			  			</div -->
			  			
			  		</div>
			  		<div class="dia_foot2">&nbsp;</div>
			  	</div>
		  	</div>
		  	<div id="context">
		  		<div class="c_title">�û�ע����Ϣ</div>
		  		<div class="c_content"> 		  		
	 <ul style="color:red;list-style-type:circle;">
	 	${msg}
	 </ul>
	 <table border="0">
        <tr>
          <th>�û���</th>
          <td><html:text property="item.userName" /></td>
        </tr>
        <tr>
          <th>����</th>
          <td><html:password property="item.userPassword" /></td>
        </tr>
        <tr>
          <th>����һ������</th>
          <td><input type="password" name="item.userPassword2" /></td>
        </tr>
        <tr>
          <th>���֤����</th>
          <td><html:text property="item.userIdCode" /></td>
        </tr>
        <tr>
          <th>�绰</th>
          <td><html:text property="item.userTel" /></td>
        </tr>
        <tr>
          <th>��ַ</th>
          <td><html:text property="item.userAddr" /></td>
        </tr>
        <tr>
          <th>�ʱ�</th>
          <td><html:text property="item.userZip" /></td>
        </tr>
      </table>
					 	
			 			<div class="button_bar">
			 				<button onclick="javascript:doSubmit();">&nbsp;&nbsp;&nbsp;��  ��&nbsp;&nbsp;&nbsp;</button>
          				</div>
		  		</div>
		  		<div class="c_foot">&nbsp;</div>
		  	</div>
	  </div>
	  <div id="footer" class="center">
	  </div>
	  <script>
	  	build_validate("item.userName","�û�������Ϊ��","Limit","1","50");
	  	build_validate("item.userPassword","���벻��Ϊ��","Limit","1","50");
	  	build_validate("item.userTel","�绰����Ϊ��","Limit","1","50");
	  	build_validate("item.userAddr","��ַ����Ϊ��","Limit","1","300");
	  	build_validate("item.userIdCode","���֤���벻��ȷ","Limit","15","18");
	  	build_validate_compare("item.userPassword2","������������벻һ��","item.userPassword");
	  	build_validate("item.userZip","���������ʽ����ȷ","Limit","6","6");
	  </script>
    </html:form>
  </body>
</html:html>