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
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    
    <title>MAQZAR : Management Mechanical Workshop</title>

    <!-- Bootstrap core CSS -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="navbar-fixed-top.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  <script type="text/javascript" src="/js/nokmenu.js?dev=<%=(int)(Math.random()*100)%>"></script>

  </head>
  
<body onload="doRecargar();javascript:relocation(); document.getElementById('usuario').focus();">

 <!-- Fixed navbar -->
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">MAQZAR : Management Mechanical Workshop</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
           
          </ul>
         
        </div><!--/.nav-collapse -->
      </div>
    </nav>


	<div width="100%" id="container" align="center">
		<div style="position: relative; BORDER: #d6d6d6 1px solid; MARGIN: auto;width: 755px;height: 570px;" align="center" id="divprincipal">
			<div style="position: absolute;width: 100%;FLOAT: left;">
				<div style="position: relative;BACKGROUND: url(/images/logoempresatt.jpg) no-repeat 0px 0px;width: 300px;height: 55px;FLOAT: left;left: 5px; top: 40px;">
				&nbsp;
				</div>
				
			</div>
			<div style="position: absolute;width: 100%;FLOAT: left;top:100px;">
				
					<form  action="<%=request.getContextPath()%>/login/login.action" id="loginform" method="POST">
						<table>	
							<tr>
								<td class="labellogin">
									Usuario:<br>
									<input id="usuario" name="usuario" value="ADMIN" size="20" maxlength="15" onkeypress="javascript:validalogin(event);" autocomplete="off">
								</td>
								<td colspan="2 ">
									
								</td>
							</tr>
							<tr><br>
								<td class="labellogin">
									Password:<br>
									<input type="password" id="password" name="password" valud="ADMIN" size="20" maxlength="10" onkeypress="javascript:validalogin(event);" autocomplete="off">
								
								</td>
							
								<td align= "right" colspan="2">
									</td>
							</tr>
							<tr>	
								<td align="left">
								<br>
									<input type="button" id="Aceptar" name="Aceptar" value="Aceptar" class="btn btn-sm btn-primary" onclick="javascript:validalogin2();"/>
									&nbsp;
									<input type="button" id="Cancelar" name="Cancelar" value="Limpiar" class ="btn btn-sm btn-default" onclick="limpiaLogin();"/>
								</td>
							</tr>
						</table>
						<input type="hidden" name="__RequestVerificationToken" value=""/>						
					</form>		
			</div>
		<!-- 
			<div style="position: relative; top:420px">
				<jsp:include page="/jsp/amfootergenerico.jsp"></jsp:include>
			</div>-->
		</div><!-- fin div principal-->
	</div><!-- fin div container -->




 <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="bootstrap/js/jquery.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
</body>
</html>