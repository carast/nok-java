package mx.com.nok.obra.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.maqune.model.dto.MaquneDTO;
import mx.com.nok.maqune.model.service.MaquneService;
import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.obra.model.dto.ObraRecursoMaquneDTO;
import mx.com.nok.obra.model.service.ObraService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class ObraAction  extends ActionSupport implements ServletRequestAware, ServletResponseAware {
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private ObraService obraService;
    
    
    
    
    public ObraService getObraService() {
		return obraService;
	}

	public void setObraService(ObraService obraService) {
		this.obraService = obraService;
	}

	public String obraTest()
    {
    	try {
    		System.out.println("Entrando a TEST.....");
    	
    		//insert 
    		
//    		ObraRecursoMaquneDTO dto=new ObraRecursoMaquneDTO();
//    		dto.setIdMaqune("1");
//    		dto.setIdObra("1");
//    		dto.setFechaAsignacion("2016-05-05");
//    		
//    		
//     		
//     		System.out.println("insert: " + obraService.insertObraRecursoMaqune(dto));
//     		dto.setIdMaqune("");
//    		dto.setIdObra("");
//     		System.out.println("Retrieve: " + obraService.infoObraRecursoMaqune(dto));
//     		
//     		//update 
//     		dto=new ObraRecursoMaquneDTO();
//    		dto.setIdMaqune("1");
//    		dto.setIdObra("1");
//    		dto.setFechaAsignacion("2019-05-05");
//    		
//    		
//     		
//     		System.out.println("update: " + obraService.updateObraRecursoMaqune(dto));
//     		dto.setIdMaqune("");
//    		dto.setIdObra("");
//     		System.out.println("Retrieve: " + obraService.infoObraRecursoMaqune(dto));
//     		
//     		
//     		
//     		//delete 
//     		dto=new ObraRecursoMaquneDTO();
//    		dto.setIdMaqune("1");
//    		dto.setIdObra("1");
//    		dto.setFechaAsignacion("2019-05-05");
//    		
//    		
//     		
//     		System.out.println("update: " + obraService.deleteObraRecursoMaqune(dto));
//     		dto.setIdMaqune("");
//    		dto.setIdObra("");
//     		System.out.println("Retrieve: " + obraService.infoObraRecursoMaqune(dto));
    		
    		
    	ObraDTO dto = new ObraDTO();
    		
//    		//prueba insert obra
//    		dto =new ObraDTO();
//    		dto.setIdObra("");
//    		dto.setClaveObra("clave_obra");
//    		dto.setNombre("nombre");
//    		dto.setLat("lat");
//    		dto.setLng("lng");
//    		dto.setIdEmpleado("2");  		
//    		dto.setPresupuestoEstimado(556.32);
//    		dto.setStatus("A");
//    		dto.setFechaInicio("2013-05-05");
//    		dto.setFechaTermina("2013-06-06");
//    		
//    		
//    		
//    		System.out.println("Resultado de retrieve obra: "+obraService.insertObra(dto).toString());
//    		dto.setIdObra("");
//    		dto.setIdEmpleado("");    		  
//    		System.out.println("Resultado de retrieve maqune: "+obraService.infoObra(dto).toString());
//    		
//    		
    		//Prueba update Obra
//    		dto =new ObraDTO();
//    		dto.setIdObra("1");
//    		dto.setClaveObra("clave_obra");
//    		dto.setNombre("nomxxxbre");
//    		dto.setLat("lat");
//    		dto.setLng("lng");
//    		dto.setIdEmpleado("2");  		
//    		dto.setPresupuestoEstimado(556.32);
//    		dto.setStatus("A");
//    		dto.setFechaInicio("2013-05-05");
//    		dto.setFechaTermina("2013-06-06");
//    		
//    		
//    		
//    		System.out.println("Resultado de update obra: "+obraService.updateObra(dto).toString());
//    		dto.setIdObra("");
//    		dto.setIdEmpleado("");    		  
//    		System.out.println("Resultado de retrieve maqune: "+obraService.infoObra(dto).toString());
    		
    		
    		
    		//prueba delete obra
    		
    		
//    		dto =new ObraDTO();
//    		dto.setIdObra("11");
//    		dto.setIdEmpleado("2");  		
//    		
//    		
//    		
//    		System.out.println("Resultado de delete obra: "+obraService.deleteObra(dto));
//    		dto.setIdObra("");
//    		dto.setIdEmpleado("");    		  
//    		System.out.println("Resultado de retrieve maqune: "+obraService.infoObra(dto).toString());
//    		
    		
    		
    		
    		
    		
    		 
    		
    		return SUCCESS;
    	}
    		
    	catch (Exception e){
    		e.printStackTrace();
    		return ERROR;
    	}
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
	
}
