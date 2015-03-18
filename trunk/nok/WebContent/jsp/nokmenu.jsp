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
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<!-- SmartMenus 6 config and script core files -->
<link rel="stylesheet" type="text/css" href="/css/jquery.hrzAccordion.defaults.css">
<LINK REL="stylesheet" type="text/css" HREF="/css/amestilologin.css">
<LINK REL="stylesheet" type="text/css" HREF="/css/splashscreen.css">
<LINK rel="stylesheet" type="text/css" href="/css/template.css">
<LINK rel="stylesheet" type="text/css"href="/css/homepage.css">
<LINK rel="stylesheet" type="text/css"href="/css/table.css">

<script type="text/javascript" src="/lib/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="/lib/jquery-ui-1.8.6.custom.min.js"></script>
<script type="text/javascript" src="/lib/jquery.effects.core.js"></script>
<script type="text/javascript" src="/lib/efectos.js"></script>
<script type="text/javascript" src="/js/c_config.js"></script>
<script type="text/javascript" src="/js/c_smartmenus.js"></script>
<script type="text/javascript" src="/js/liqHttpRequest.js"></script>
<script type="text/javascript" src="/js/nokmenu.js?dev=<%=(int)(Math.random()*100)%>"></script>
<script type="text/javascript" src="/js/c_addon_fx_reveal.js"></script>
<script type="text/javascript" src="/js/c_addon_fx_shadow.js"></script>
<!-- SmartMenus 6 Advanced Keyboard Navigation add-on -->
<script type="text/javascript" src="/js/c_addon_keyboard.js"></script>
<script language="JavaScript" src="/js/swfobject.js"></script>
<script type="text/javascript" src="/js/FusionCharts.js"></script>

<title></title>
<style type="text/css">

</style>
</head>
<body >
<input type="hidden" id="user" value="<%=user%>"/>

<div id="AppTitleContainer">
    <div id="topNav">
      <div class="topLeft_NavContainer">&nbsp;</div>
        <div class="topRight_NavContainer">&nbsp;</div>
          <div class="topCenter_NavContainer">

				<div style="float: left; text-align: left; width: 235px; height: 50px; padding-bottom: -10px;" align="left">
					<img style="position: relative; top: 10px; left: 0px;"src="/images/logoempresa.jpg" border="0" />
				</div>
					
				<div style="float:right;width:180px; height:60px;" > </div>
						
						<div class="middleContainer">
							 <!-- MENU -->
                          <div style="position:absolute; padding-left:10px;padding-bottom:0px;"  align="left">                             
                                <ul id="Menu1" class="MM">                                 	

                                  	<li><a href="#">Cat&aacute;logos</a>
	                                    <ul>
	                                    	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/cliente/cliente.action?titpant=index.datogral','Clientes','cliente',1024,900,1,1);">Clientes </a></li>
	                                     	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/empleado/empleado.action?titpant=index.datogral','','empleado',1024,900,1,1);">Empleados </a></li>
	                                     	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/proveedor/proveedor.action?titpant=index.datogral','','proveedor',1024,900,1,1);">Proveedores </a></li>
	                                     	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/falla/falla.action?titpant=index.datogral','','falla',1024,900,1,1);">Fallas </a></li>
											<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/categoria/categoria.action?titpant=index.datogral','Categorias','categorias',1024,900,1,1);">Categorías </a></li>
	                                        <li><a href="#" onclick="">Categorias </a>										
												<ul>
												
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemplo.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a></li>		
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/articulo/articulo.action?titpant=index.datogral','','articulo',1024,750,1,1);">Artículos </a></li>												
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemplo.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a>																													
																<ul>														
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemplo.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemplo.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemplo.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>																	
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemplo.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a>																													
																				<ul>														
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4</a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>																	
																				</ul>															
																	</li>	
																</ul>															
														</li>	
												</ul>
													
													
											</li>	
	                                 	</ul>
                                 	</li>
                                 	
                                 	
                                 	<li><a href="#">Taller</a>
	                                    <ul>
	                                     	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 1 </a></li>
											<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 1 </a></li>
	                                        <li><a href="#" onclick="">Nivel 1 </a>										
												<ul>
												
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a></li>		
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a></li>												
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a>																													
																<ul>														
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>																	
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a>																													
																				<ul>														
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4</a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>																	
																				</ul>															
																	</li>	
																</ul>															
														</li>	
												</ul>
													
													
											</li>	
	                                 	</ul>
                                 	</li>
                                 	
                                 	
                                 	<li><a href="#">Obra</a>
	                                    <ul>
	                                     	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/contrato/contrato.action?titpant=index.datogral','','contrato',1024,750,1,1);">Contratos</a></li>
											<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 1 </a></li>
	                                        <li><a href="#" onclick="">Nivel 1 </a>										
												<ul>
												
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a></li>		
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a></li>												
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a>																													
																<ul>														
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>																	
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a>																													
																				<ul>														
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4</a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>																	
																				</ul>															
																	</li>	
																</ul>															
														</li>	
												</ul>
													
													
											</li>	
	                                 	</ul>
                                 	</li>
                                 	
                                 	
                                 	
                                 	
                                 	<li><a href="#">Maquinaria</a>
	                                    <ul>
	                                     	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 1 </a></li>
											<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 1 </a></li>
	                                        <li><a href="#" onclick="">Nivel 1 </a>										
												<ul>
												
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a></li>		
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a></li>												
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a>																													
																<ul>														
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>																	
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a>																													
																				<ul>														
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4</a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>																	
																				</ul>															
																	</li>	
																</ul>															
														</li>	
												</ul>
													
													
											</li>	
	                                 	</ul>
                                 	</li>
                                 	
                                 	
                                 	<li><a href="#">Almacen</a>
	                                    <ul>
	                                     	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 1 </a></li>
											<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 1 </a></li>
	                                        <li><a href="#" onclick="">Nivel 1 </a>										
												<ul>
												
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a></li>		
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a></li>												
														<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 2 </a>																													
																<ul>														
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a></li>																	
																	<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 3 </a>																													
																				<ul>														
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4</a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>
																					<li><a href="#" onclick="openPopUp('<%=request.getContextPath()%>/ejemplo/ejemploTest.action?titpant=index.datogral','','ejemplo',1024,750,1,1);">Nivel 4 </a></li>																	
																				</ul>															
																	</li>	
																</ul>															
														</li>	
												</ul>
													
													
											</li>	
	                                 	</ul>
                                 	</li>
                                 	
                                 	<li><a href="#" onclick="cerrarVentanas();">Logout</a></li>
							
	                        </div>
							<!-- MENU --> 
                          <div class="middleLeft_MainNavContainer">&nbsp;</div>
                          <div class="middleRight_MainNavContainer">&nbsp;</div>
                          <div class="middleCenter_MainNavContainer">&nbsp;</div>
           			 </div>
        </div>
   </div>
	<div id="middleContainer" style="padding-left:-0px;" align="center"   style="width: 270px; height: 500px">
	<div id="alignmentContainer"   style="width: 270px; height: 500px" align="center">
    <table  border="1"  width="500" heigth="500">
    <tr>
    <td>
    Página Contenido
    </td>
    </tr>
    
    
    </table>
    </div><!--  middleContainer-->
</div> <!--  AppTitleContainer -->

<br class="clearfloat" />

<div style="position:relative;left: 10px;">
	<jsp:include page="/jsp/amfootergenerico.jsp"></jsp:include>
</div>
</body>
</html>

