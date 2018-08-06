<%@ page language="java" pageEncoding="GBK"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>用户协议</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="styles.css" />
  </head>  	
  <body>
  <script>
  	function iagree()
  	{
  		document.forms[0].submit();
  	}
  	function unagree()
  	{
  		history.go(-1);
  	}
  </script>
    <html:form action="/user" method="post" >
      <input type="hidden" name="operate" value="toAdd" />
      <input type="hidden" name="agree" value="true" />
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
		  		<div class="c_title">服务条款</div>
		  		<div class="c_content"> 		  		
					 	<textarea style="border-width:0px;color:#6C6C6C;padding-right:4px;" readonly="true" rows="28" cols="72" type="_moz">    欢迎您到e拍网注册，所有资料请如实填写，以便我们为您提供更好的服务。请您先阅读我们的法律声明，如果同意，请进行用户注册。
　　1．e拍网服务条款的确认和接纳
　　e拍网各项服务的所有权和运作权归JB信息科技有限公司。
　　2．用户必须：
　　(1)自行配备上网的所需设备， 包括个人电脑、调制解调器或其他必备上网装置。
　　(2)自行负担个人上网所支付的与此服务有关的电话费用、 网络费用。
　　3． 有关个人资料
　　　　用户同意：
　　(1) 提供及时、详尽及准确的个人资料。
　　(2) 不断更新注册资料，符合及时、详尽准确的要求。所有原始键入的资料将引用为注册资料。
　　e拍网不公开用户的姓名、地址、电子邮箱和笔名，以下情况除外：
　　(1)用户授权e拍网透露这些信息。
　　(2)相应的法律及程序要求e拍网提供用户的个人资料。如果用户提供的资料包含有不正确的信息，e拍网保留结束用户使用e拍网信息服务资格的权利。
　　4． 服务条款的修改
　　e拍网有权在必要时修改服务条款，e拍网服务条款一旦发生变动，将会在重要页面上提示修改内容。如果不同意所改动的内容，用户可以主动取消获得的e拍网信息服务。如果用户继续享用e拍网信息服务，则视为接受服务条款的变动。e拍网保留随时修改或中断服务而不需通知用户的权利。e拍网行使修改或中断服务的权利，不需对用户或第三方负责。
　　5． 用户隐私制度
　　尊重用户个人隐私是e拍网的一项基本政策。所以，作为对以上对个人注册资料分析的补充，e拍网一定不会在未经合法用户授权时公开、编辑或透露其注册资料以及保存在e拍网中的非公开内容，除非有法律许可要求或e拍网在诚信的基础上认为透露这些信息在以下四种情况是必要的：
　　(1) 遵守有关法律规定，遵从e拍网合法服务程序。
　　(2) 保持维护e拍网的商标所有权。
　　(3) 在紧急情况下竭力维护用户个人和社会大众的隐私安全。
　　(4)符合其他相关的要求。
　　e拍网保留发布会员分析咨询的权利。
　　6．用户的帐号、密码和安全性
　　您一旦注册成功成为e拍网用户，您将拥有一个数字ID和会员帐号，并有对应的密码。如果您不保管好自己的帐号和密码安全，将自负全部责任。另外，每个用户都要对其帐户中的所有活动和事件负全责。您可随时根据指示改变您的密码，也可以结束旧的帐号重开一个新帐户。用户同意若发现任何非法使用用户帐号或安全漏洞的情况，将立即通知e拍网。
　　7． 拒绝提供担保
　　用户明确同意信息服务的使用由用户个人承担风险。
　　e拍网不担保服务不会受中断，对服务的及时性，安全性，出错发生都不作担保，但会在能力范围内避免出错。
　　8．有限责任
　　e拍网对任何直接、间接、偶然、特殊及续起的损害不负责任，这些损害来自：不正当使用e拍网服务，或用户传送的信息不符合规定等。这些行为都有可能导致e拍网形象受损，所以e拍网事先提出这种损害的可能性，同时会尽量避免这种损害的发生。
　　9．信息的储存及限制
　　e拍网有判定用户的行为是否符合e拍网服务条款的要求和精神的权利，如果用户违背e拍网服务条款的规定，e拍网有权中断其服务的帐号。如果用户在连续360天时间内没有登录、查看或使用，e拍网将视为用户自行放弃该帐号的使用权，e拍网将保留中断对其提供服务的权利。
　　10．用户管理
　　　　用户必须遵循：
　　(1) 从中国境内向外传输技术性资料时必须符合中国有关法规。
　　(2) 使用信息服务不作非法用途。
　　(3) 不干扰或混乱网络服务。
　　(4) 遵守所有使用服务的网络协议、规定、程序和惯例。用户的行为准则是以因特网法规，政策、程序和惯例为根据的。
　　11．保障
　　用户同意保障和维护e拍网全体成员的利益，负责支付由用户使用超出服务范围引起的律师费用，违反服务条款的损害补偿费用，其它人使用用户的电脑、帐号和其它知识产权的追索费。
　　12．结束服务
　　用户或e拍网可随时根据实际情况中断一项或多项服务。e拍网不需对任何个人或第三方负责而随时中断服务。用户若反对任何服务条款的建议或对后来的条款修改有异议，或对e拍网服务不满，用户可以行使如下权利：
　　(1) 不再使用e拍网信息服务。
　　(2) 通知e拍网停止对该用户的服务。
　　结束用户服务后，用户使用e拍网服务的权利马上中止。从那时起，用户没有权利，e拍网也没有义务传送任何未处理的信息或未完成的服务给用户或第三方。
　　13．通告
　　所有发给用户的通告都可通过重要页面的公告或电子邮件或常规的信件传送。服务条款的修改、服务变更、或其它重要事件的通告都会以此形式进行。
　　14．信息内容的所有权
　　e拍网定义的信息内容包括：文字、软件、声音、相片、录像、图表；在广告中的全部内容；e拍网为用户提供的其它信息。所有这些内容受版权、商标、标签和其它财产所有权法律的保护。所以，用户只能在e拍网和广告商授权下才能使用这些内容，而不能擅自复制、再造这些内容或创造与内容有关的派生产品。
　　15．法律
　　e拍网信息服务条款要与中华人民共和国的法律解释一致。用户和e拍网一致同意服从JB信息科技有限公司所在地有管辖权的法院管辖。如发生e拍网服务条款与中华人民共和国法律相抵触时，则这些条款将完全按法律规定重新解释，而其它条款则依旧保持对用户的约束力。
					 	</textarea>
			 			<div class="button_bar">
			 				<button onclick="javascript:unagree();">不同意</button>&nbsp;&nbsp;&nbsp;
			 				<button onclick="javascript:iagree();">我同意以上服务条款</button>
          				</div>
		  		</div>
		  		<div class="c_foot">&nbsp;</div>
		  	</div>
	  </div>
	  <div id="footer" class="center">
	  </div>
	  
     
    </html:form>
  </body>
</html:html>
