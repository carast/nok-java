package mx.com.nok.requisicion.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.mantenimiento.model.service.MantenimientoService;
import mx.com.nok.requisicion.model.dto.RequisicionDTO;
import mx.com.nok.requisicion.model.dto.RequisicionDetalleDTO;
import mx.com.nok.requisicion.model.service.RequisicionService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class RequisicionAction  extends ActionSupport implements ServletRequestAware, ServletResponseAware  {
	
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private RequisicionService requisicionService;
    
    
    

    
    public String requisicionTest()
    {
    	try {
    		System.out.println("Entrando a TEST.....");
    		RequisicionDetalleDTO dto= new RequisicionDetalleDTO();
    		
    		//insert 
//    		dto.setFolioReq("5");
//    		dto.setNumArticulo(5);
//    		dto.setCantidad(5);
//    		dto.setIdArticulo("6");
//    		
//    		System.out.println("insert: " + requisicionService.insertRequisicionDetalle(dto).toString());
//     		dto.setFolioReq("");    		
//    		dto.setIdArticulo("");
//     		System.out.println("Retrieve: " + requisicionService.infoRequisicionDetalle(dto));
//    		
//     		
//     		//update
//     		dto.setFolioReq("5");
//    		dto.setNumArticulo(5);
//    		dto.setCantidad(5);
//    		dto.setIdArticulo("6");
//    		
//    		System.out.println("update: " + requisicionService.updateRequisicionDetalle(dto).toString());
//     		dto.setFolioReq("");    		
//    		dto.setIdArticulo("");
//     		System.out.println("Retrieve: " + requisicionService.infoRequisicionDetalle(dto));
    		
     		//delete
     		
     		dto.setFolioReq("5");    		
    		dto.setIdArticulo("6");
     		System.out.println("insert: " + requisicionService.deleteRequisicionDetalle(dto));
     		dto.setFolioReq("");    		
    		dto.setIdArticulo("");
     		System.out.println("Retrieve: " + requisicionService.infoRequisicionDetalle(dto));
     		
     		
     		
     		
     		
    		//insert
  		//RequisicionDTO dto = new RequisicionDTO();
//    		dto.setFolioReq("9");
//    		dto.setEmpleadoSolicitante("2");
//    		dto.setEmpleadoResponsable("2");
//    		dto.setIdProveedor("1");
//    		dto.setFolioFactura("1");
//    		dto.setFechaReq("2010-01-01");
//    		
//    		System.out.println("insert: " + requisicionService.insertRequisicion(dto).toString());
//     		dto.setFolioReq("");
//    		dto.setEmpleadoSolicitante("");
//    		dto.setEmpleadoResponsable("");
//    		dto.setIdProveedor("");
//     		System.out.println("Retrieve: " + requisicionService.infoRequisicion(dto));
     		
     		
     		//update 
     		
//     		dto.setFolioReq("9");
//    		dto.setEmpleadoSolicitante("2");
//    		dto.setEmpleadoResponsable("2");
//    		dto.setIdProveedor("1");
//    		dto.setFolioFactura("1");
//    		dto.setFechaReq("2015-12-12");
//    		
//    		System.out.println("update : " + requisicionService.updateRequisicion(dto).toString());
//     		dto.setFolioReq("");
//    		dto.setEmpleadoSolicitante("");
//    		dto.setEmpleadoResponsable("");
//    		dto.setIdProveedor("");
//     		System.out.println("Retrieve: " + requisicionService.infoRequisicion(dto));
     		
     		
     		
//     		dto.setFolioReq("9");
//    		dto.setEmpleadoSolicitante("2");
//    		dto.setEmpleadoResponsable("2");
//    		dto.setIdProveedor("1");
//    		dto.setFolioFactura("1");
//    	
//    		System.out.println("delete : " + requisicionService.deleteRequisicion(dto));
//     		dto.setFolioReq("");
//    		dto.setEmpleadoSolicitante("");
//    		dto.setEmpleadoResponsable("");
//    		dto.setIdProveedor("");
//     		System.out.println("Retrieve: " + requisicionService.infoRequisicion(dto));
     		
    		
    		
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

	public RequisicionService getRequisicionService() {
		return requisicionService;
	}

	public void setRequisicionService(RequisicionService requisicionService) {
		this.requisicionService = requisicionService;
	}

}
