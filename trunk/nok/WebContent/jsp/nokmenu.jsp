<%
/**
*   @Objetivo           : jsp de menu principal
*   @Autor              : Ricardo Zaragoza Solís.
*   @Objeto             : index.jsp
*   @Fecha Creacion     : 01 de Enero del 2014
*   @Versión            : 1.0.0 
 */
%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.Properties" %>
<%
	Properties props = new Properties();
	response.addHeader("Pragma", "no-cache");
	response.setHeader("Cache-Control",
			"no-cache,no-store,must-revalidate");
	response.addHeader("Cache-Control", "pre-check=0,post-check=0");
	response.setDateHeader("Expires", 0);

	String user = null;
	
	/*if (request.getSession(false) != null){
		props = (Properties)request.getSession(false).getAttribute("propsURL");
		if(props == null)
			props = new Properties();
		AMClsUsuarioSesionDTO usuario = (AMClsUsuarioSesionDTO) request.getSession(false).getAttribute("usuariodto");
		if(usuario != null){
			user = usuario.getUsuario();
		}else{
			user = "";
		}
	}*/
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
    <link href="/nok/jsp/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
   <style type="text/css">
   body {
  min-height: 2000px;
}

.navbar-static-top {
  margin-bottom: 19px;
}
html{
    /* This image will be displayed fullscreen */
    background:url('/nok/jsp/bootstrap/img/taller1.jpg') no-repeat center center;

    /* Ensure the html element always takes up the full height of the browser window */
    min-height:100%;

    /* The Magic */
    background-size:cover;
}

body{
    /* Workaround for some mobile browsers */
    min-height:100%;
}
   </style>

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  <script type="text/javascript" src="/js/nokmenu.js?dev=<%=(int)(Math.random()*100)%>"></script>

  </head>
  
<body>
<input type="hidden" id="user" value="<%=user%>"/>
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
          <a class="navbar-brand" href="#">MMW</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">Escritorio</a></li>
       
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">C&aacute;talogos <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/cliente/cliente.action?titpant=index.datogral','Clientes','cliente',1024,900,1,1);">Clientes </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/empleado/empleado.action?titpant=index.datogral','','empleado',1024,900,1,1);">Empleados </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/proveedor/proveedor.action?titpant=index.datogral','','proveedor',1024,900,1,1);">Proveedores </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/falla/falla.action?titpant=index.datogral','','falla',1024,900,1,1);">Fallas </a></li>
				<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/categoria/categoria.action?titpant=index.datogral','Categorias','categorias',1024,900,1,1);">Categorías </a></li>
						
               
                <li class="divider"></li>
                <li class="dropdown-header">Adicionales</li>
                <li><a href="#">Catalogo 1</a></li>
                <li><a href="#">Catalogo 2</a></li>
              </ul>
            </li>
            
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Taller<span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/cliente/cliente.action?titpant=index.datogral','Clientes','cliente',1024,900,1,1);">Clientes </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/empleado/empleado.action?titpant=index.datogral','','empleado',1024,900,1,1);">Empleados </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/proveedor/proveedor.action?titpant=index.datogral','','proveedor',1024,900,1,1);">Proveedores </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/falla/falla.action?titpant=index.datogral','','falla',1024,900,1,1);">Fallas </a></li>
				<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/categoria/categoria.action?titpant=index.datogral','Categorias','categorias',1024,900,1,1);">Categorías </a></li>
						
                <li class="divider"></li>
                <li class="dropdown-header">Adicionales</li>
                <li><a href="#">Catalogo 1</a></li>
                <li><a href="#">Catalogo 2</a></li>
              </ul>
            </li>
            
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Obras <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/cliente/cliente.action?titpant=index.datogral','Clientes','cliente',1024,900,1,1);">Clientes </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/empleado/empleado.action?titpant=index.datogral','','empleado',1024,900,1,1);">Empleados </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/proveedor/proveedor.action?titpant=index.datogral','','proveedor',1024,900,1,1);">Proveedores </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/falla/falla.action?titpant=index.datogral','','falla',1024,900,1,1);">Fallas </a></li>
				<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/categoria/categoria.action?titpant=index.datogral','Categorias','categorias',1024,900,1,1);">Categorías </a></li>
						
                <li class="divider"></li>
                <li class="dropdown-header">Adicionales</li>
                <li><a href="#">Catalogo 1</a></li>
                <li><a href="#">Catalogo 2</a></li>
              </ul>
            </li>
            
            
            
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Maquinaria <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/cliente/cliente.action?titpant=index.datogral','Clientes','cliente',1024,900,1,1);">Clientes </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/empleado/empleado.action?titpant=index.datogral','','empleado',1024,900,1,1);">Empleados </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/proveedor/proveedor.action?titpant=index.datogral','','proveedor',1024,900,1,1);">Proveedores </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/falla/falla.action?titpant=index.datogral','','falla',1024,900,1,1);">Fallas </a></li>
				<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/categoria/categoria.action?titpant=index.datogral','Categorias','categorias',1024,900,1,1);">Categorías </a></li>
						
                 <li class="divider"></li>
                <li class="dropdown-header">Adicionales</li>
                <li><a href="#">Catalogo 1</a></li>
                <li><a href="#">Catalogo 2</a></li>
              </ul>
            </li>
            
            
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Almacen <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/cliente/cliente.action?titpant=index.datogral','Clientes','cliente',1024,900,1,1);">Clientes </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/empleado/empleado.action?titpant=index.datogral','','empleado',1024,900,1,1);">Empleados </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/proveedor/proveedor.action?titpant=index.datogral','','proveedor',1024,900,1,1);">Proveedores </a></li>
                <li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/falla/falla.action?titpant=index.datogral','','falla',1024,900,1,1);">Fallas </a></li>
				<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/categoria/categoria.action?titpant=index.datogral','Categorias','categorias',1024,900,1,1);">Categorías </a></li>
						
                 <li class="divider"></li>
                <li class="dropdown-header">Adicionales</li>
                <li><a href="#">Catalogo 1</a></li>
                <li><a href="#">Catalogo 2</a></li>
              </ul>
            </li>
            
            
            
          </ul>
          <ul class="nav navbar-nav navbar-right">
           
            <li class="active"><a href="#" onclick="cerrarVentanas();">Salir<span class="sr-only">(current)</span></a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
    
    






 <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="/nok/jsp/bootstrap/js/jquery.min.js"></script>
    <script src="/nok/jsp/bootstrap/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    
    
</body>
</html>

