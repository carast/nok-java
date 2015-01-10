package mx.com.nok.empleado.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.articulo.model.service.ArticuloService;
import mx.com.nok.core.usuario.model.dto.PerfilDTO;
import mx.com.nok.core.usuario.model.dto.UsuarioDTO;
import mx.com.nok.empleado.model.dto.EmpleadoDTO;
import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;
import mx.com.nok.empleado.model.service.EmpleadoService;
import mx.com.nok.menu.model.dto.MenuDTO;
import mx.com.nok.portlet.action.PortletAction;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class EmpleadoAction extends ActionSupport implements ServletRequestAware, ServletResponseAware{
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(PortletAction.class);
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private EmpleadoService empleadoService;
    
    
    
    public String empleadoTest()
    {
    	try {
    		
/*    		
 * //Prueba retrieve tipoEmpleado
    		// TipoEmpleadoDTO tpedto = new TipoEmpleadoDTO();
//    		tpedto.setIdTipoEmpleado("");
//    		System.out.println(empleadoService.catTipoEmpleado(tpedto).toString());
//    		
//    		//Prueba de insercion de Tipo empleado
//    		tpedto = new TipoEmpleadoDTO();
//    		tpedto.setTipoEmpleado("Tipo Empleado 1");
//    		System.out.println("Se inserta : "+empleadoService.insertTipoEmpleado(tpedto).toString());
//    		tpedto.setIdTipoEmpleado("");
//    		System.out.println(empleadoService.catTipoEmpleado(tpedto).toString());
//    		
//    		
//    		//Prueba update tipo Empleado
//    		tpedto = new TipoEmpleadoDTO();
//    		tpedto.setTipoEmpleado("Tipo xxxxxx Empleado 1");
//    		tpedto.setIdTipoEmpleado("2");
//    		tpedto.setEstatus(true);
//    		System.out.println("Se modifica : "+empleadoService.updateTipoEmpleado(tpedto).toString());
//    		tpedto.setIdTipoEmpleado("");
//    		System.out.println(empleadoService.catTipoEmpleado(tpedto).toString());
//    		
//    		//Prueba update estatus tipo empleado
//    		tpedto = new TipoEmpleadoDTO();    	
//    		tpedto.setIdTipoEmpleado("2");
//    		tpedto.setEstatus(false);
//    		System.out.println("Se modifica : "+empleadoService.updateEstatusTipoEmpleado(tpedto).toString());
//    		tpedto.setIdTipoEmpleado("");
//    		System.out.println(empleadoService.catTipoEmpleado(tpedto).toString());
//    		
    		
    		//Prueba delete tipo empleado
//    		tpedto = new TipoEmpleadoDTO();    	
//    		tpedto.setIdTipoEmpleado("2");    		
//    		System.out.println("Se borra : "+empleadoService.deleteTipoEmpleado(tpedto));
//    		tpedto.setIdTipoEmpleado("");
//    		System.out.println(empleadoService.catTipoEmpleado(tpedto).toString());
    		
    		
    		
    		
    		
    		//Prueba usuario retrieve
//    		UsuarioDTO usrdto = new UsuarioDTO();
//    		usrdto.setIdUsuario("");  
//    		usrdto.setIdEmpleado("");
//    		System.out.println(empleadoService.infoUsuario(usrdto).toString());
    		
    		
    		//Prueba Insert Usuario.
//    		usrdto = new UsuarioDTO();
//    		//usrdto.setIdUsuario("");  
//    		usrdto.setIdEmpleado("4");
//    		usrdto.setPass("admin");
//    		usrdto.setIdPerfil("1");    		
//    		System.out.println("Se inserta usuario : " + empleadoService.insertUsuario(usrdto).toString());
//    		usrdto.setIdUsuario("");  
//    		usrdto.setIdEmpleado("");
//    		System.out.println(empleadoService.infoUsuario(usrdto).toString());
    		
    		
    		//Prueba update usuario 
//    		usrdto = new UsuarioDTO();
//    		usrdto.setIdUsuario("2");  
//    		usrdto.setIdEmpleado("4");
//    		usrdto.setPass("adminzzzzz");
//    		usrdto.setIdPerfil("1"); 
//    		usrdto.setStatus(true);
//    		System.out.println("Se modifico usuario : " + empleadoService.updateUsuario(usrdto).toString());
//    		usrdto.setIdUsuario("");  
//    		usrdto.setIdEmpleado("");
//    		System.out.println(empleadoService.infoUsuario(usrdto).toString());
//    		
    		
    		//Prueba update estatus usuario 
//    		usrdto = new UsuarioDTO();
//    		usrdto.setIdUsuario("2");  
//    		usrdto.setStatus(false);
//    		System.out.println("Se modifico estatus usuario : " + empleadoService.updateEstatusUsuario(usrdto).toString());
//    		usrdto.setIdUsuario("");  
//    		usrdto.setIdEmpleado("");
//    		System.out.println(empleadoService.infoUsuario(usrdto).toString());
//    		
    		
    		//Prueba borrado de usuario 
//    		usrdto = new UsuarioDTO();
//    		usrdto.setIdUsuario("2");  
//    		usrdto.setStatus(false);
//    		System.out.println("Se borra usuario : " + empleadoService.deleteUsuario(usrdto));
//    		usrdto.setIdUsuario("");  
//    		usrdto.setIdEmpleado("");
//    		System.out.println(empleadoService.infoUsuario(usrdto).toString());
//    		
    		
    		
    		
    		
//    		PerfilDTO perfdto = new PerfilDTO();
//    		perfdto.setIdPerfil("");    		
//    		System.out.println(empleadoService.infoPerfil(perfdto).toString());
    		
    		
    		//Prueba insercion perfil
//    		perfdto = new PerfilDTO();
//    		perfdto.setDescripcion("Perfil 1");
//     		System.out.println("Se inserta perfil "+ empleadoService.insertPerfil(perfdto).toString());
//     		perfdto.setIdPerfil("");  
//     		System.out.println(empleadoService.infoPerfil(perfdto).toString());
     		
    		
    		//Prueba update Perfil
//    		perfdto = new PerfilDTO();
//    		perfdto.setIdPerfil("2");
//    		perfdto.setDescripcion("Perfixxxxxl 1");
//    		perfdto.setEstatus(true);
//     		System.out.println("Se modifica perfil "+ empleadoService.updatePerfil(perfdto).toString());
//     		perfdto.setIdPerfil("");  
//     		System.out.println(empleadoService.infoPerfil(perfdto).toString());
     		
     		
    		
    		//prueba update estatus
//     		perfdto = new PerfilDTO();
//    		perfdto.setIdPerfil("2");
//    		
//    		perfdto.setEstatus(false);
//     		System.out.println("Se modifica estatus perfil "+ empleadoService.updateEstatusPerfil(perfdto).toString());
//     		perfdto.setIdPerfil("");  
//     		System.out.println(empleadoService.infoPerfil(perfdto).toString());
//     		
     		
    		//Prueba borrado de perfil
//    		perfdto = new PerfilDTO();
//    		perfdto.setIdPerfil("2");
//    		
//    		perfdto.setEstatus(false);
//     		System.out.println("Se borra perfil "+ empleadoService.deletePerfil(perfdto));
//     		perfdto.setIdPerfil("");  
//     		System.out.println(empleadoService.infoPerfil(perfdto).toString());
//     		
     		
     		
    		
    		
    		//Prueba Retrieve Empleado
//    		EmpleadoDTO dto=new EmpleadoDTO();
//    		dto.setRfcEmpleado("");
//    		dto.setIdEmpleado("");
//    		dto.setFilterEstatusEmpleado("");
//    		System.out.println("");
//    		System.out.println(empleadoService.infoEmpleado(dto).toString());
    		
    		
    		
//    		dto=new EmpleadoDTO();
//    		dto.setRfcEmpleado("00000BBBBBCCD");
//    		dto.setNombre("nombre 1");
//    		dto.setPaterno("paterno 1");
//    		dto.setMaterno("materno 1");
//    		dto.setTelefono("55555555");
//    		dto.setCelular("0445555555555");
//    		dto.setIdLocalidad("0001");
//    		dto.setIdMunicipio("048");
//    		dto.setIdEntidad("13");
//    		dto.setCp("09000");
//    		dto.setNumExterior("A1-C");
//    		dto.setNumInterior("A1CC-2");
//    		dto.setIdTipoEmpleado("1");
//    		dto.setFechaAlta("2013-03-20 00:00:00");
//    		dto.setDomicilio("domicilio 1");
//    		dto.setColonia("colonia 1");    		
//    		
//    		
//    		System.out.println("Se inserto "+ empleadoService.insertEmpleado(dto).toString());
//    		
//    		dto.setRfcEmpleado("");
//    		dto.setIdEmpleado("");
//    		dto.setFilterEstatusEmpleado("");
//    		System.out.println("");	
//   				
//  		
//    		System.out.println(empleadoService.infoEmpleado(dto).toString());
   		
    		
    		//Prueba de Modificacion
//    		dto=new EmpleadoDTO();
//    		dto.setIdEmpleado("27");
//    		
//    		dto.setRfcEmpleado("00000BBBBBCCD");
//    		dto.setNombre("nombre 1xx");
//    		dto.setPaterno("paterno 1xx");
//    		dto.setMaterno("materno 1xx");
//    		dto.setTelefono("5555xx555");
//    		dto.setCelular("045xx555555");
//    		dto.setIdLocalidad("0001");
//    		dto.setIdMunicipio("048");
//    		dto.setIdEntidad("13");
//    		dto.setCp("09000");
//    		dto.setNumExterior("a1-xxc");
//    		dto.setNumInterior("a1cc-xx2");
//    		dto.setIdTipoEmpleado("1");
//    		dto.setFechaAlta("2013-03-20 00:00:00");
//    		dto.setDomicilio("domicilio 1");
//    		dto.setColonia("colonia 1");    		
//    		dto.setEstatus(true);
//    		
//    		System.out.println("se modifico "+ empleadoService.updateEmpleado(dto).toString());
//    		
//    		dto.setRfcEmpleado("");
//    		dto.setFilterEstatusEmpleado("");
//    		System.out.println("");	
//   				
//  		
//    		System.out.println(empleadoService.infoEmpleado(dto).toString());
//    		
//    		
    		
    		//Prueba actualizar estatus
//    		dto=new EmpleadoDTO();
//    		dto.setIdEmpleado("27");
//    		dto.setRfcEmpleado("00000BBBBBCCD");
//    		dto.setEstatus(false);
//    		
//    		System.out.println("Se modifico estatus"+ empleadoService.updateEstatusEmpleado(dto).toString());
//    		dto.setIdEmpleado("");
//    		dto.setRfcEmpleado("");
//    		dto.setFilterEstatusEmpleado("");
//    		System.out.println("");	   				
//  		System.out.println(empleadoService.infoEmpleado(dto).toString());
    		
    		
    		
    		//Prueba Borrado de empleado
//    		dto=new EmpleadoDTO();
//    		dto.setIdEmpleado("27");
//    		dto.setRfcEmpleado("00000BBBBBCCD");
//    		
//    		
//    		System.out.println("Se borro registro "+ empleadoService.deleteEmpleado(dto));    		
//    		dto.setRfcEmpleado("");
//    		dto.setFilterEstatusEmpleado("");
//    		System.out.println("");	   				
//  	    System.out.println(empleadoService.infoEmpleado(dto).toString());
    		
 */   		
    		return SUCCESS;
			
		} catch (Exception e) {
		 e.printStackTrace();
			return ERROR;
		}
		
		
    	

}

    public Logger getLog() {
		return log;
	}
	public void setLog(Logger log) {
		this.log = log;
	}
	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}
	public HttpServletResponse getServletResponse() {
		return servletResponse;
	}
	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}
	public EmpleadoService getEmpleadoService() {
		return empleadoService;
	}
	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
    
    
}



	
	
