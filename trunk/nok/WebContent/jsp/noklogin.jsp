<%
/**
*   @Objetivo           : jsp de login
*   @Autor              : Roberto C. Trejo .
*   @Objeto             : amlogin.jsp
*   @Fecha Creacion     : 13 Octubre 20014

*/
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%
  /*  response.addHeader("Pragma","no-cache");
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate,pre-check=0,post-check=0");
    response.setDateHeader("Expires",0); 
    request.setCharacterEncoding("ISO-8859-1");
	response.setContentType("text/html; charset=ISO-8859-1");*/
    %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NOK : Login</title>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<LINK REL="stylesheet" type="text/css" HREF="/css/amestilologin.css">
<LINK href="/css/template.css" type="text/css" rel="stylesheet">
<LINK href="/css/homepage.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="/js/nokmenu.js?dev=<%=(int)(Math.random()*100)%>"></script>
<style type="text/css">

</style>
</head>
<body onload="doRecargar();javascript:relocation(); document.getElementById('usuario').focus();">

	<div width="100%" id="container" align="center">
		<div style="position: relative; BORDER: #d6d6d6 1px solid; MARGIN: auto;width: 755px;height: 570px;" align="center" id="divprincipal">
			<div style="position: absolute;width: 100%;FLOAT: left;">
				<div style="position: relative;BACKGROUND: url(/images/logoempresatt.jpg) no-repeat 0px 0px;width: 300px;height: 55px;FLOAT: left;left: 5px; top: 40px;">
				&nbsp;
				</div>
				
			</div>
			<div style="position: absolute;width: 100%;FLOAT: left;top:100px;">
				<div style="position: relative;background: url(/images/xxx.jpg) no-repeat 0px 0px; background-position: center;width: 100%;height: 380px; float: left;">
					<form  action="<%=request.getContextPath()%>/login/login.action" id="loginform" method="POST">
						<table border="0" style="position: relative; top:180px;" >	
							<tr>
								<td align= "left" class="labellogin">
									Usuario
								</td>
								<td align= "left" colspan="2">
									<input id="usuario" name="usuario" value="ZAOC810304NM0" size="20" maxlength="15" onkeypress="javascript:validalogin(event);" autocomplete="off">
								</td>
							</tr>
							<tr>
								<td align= "left" class="labellogin">
									Password
								</td>
								<td align= "right">
									<input type="password" id="password" name="password" size="20" maxlength="10" onkeypress="javascript:validalogin(event);" autocomplete="off">
								</td>
								<td align="right">
									<input type="button" id="Aceptar" name="Aceptar" value="Aceptar" class="boton" onclick="javascript:validalogin2();"/>
									&nbsp;
									<input type="button" id="Cancelar" name="Cancelar" value="Limpiar" class ="boton" onclick="limpiaLogin();"/>
								</td>
							</tr>
						</table>
						<input type="hidden" name="__RequestVerificationToken" value=""/>						
					</form>		
				</div>
			</div>
		<!-- 
			<div style="position: relative; top:420px">
				<jsp:include page="/jsp/amfootergenerico.jsp"></jsp:include>
			</div>-->
		</div><!-- fin div principal-->
	</div><!-- fin div container -->





</body>
</html>