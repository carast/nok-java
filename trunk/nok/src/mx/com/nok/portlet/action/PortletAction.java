package mx.com.nok.portlet.action;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import mx.com.nok.portlet.model.dto.PortletDTO;
import mx.com.nok.portlet.model.dto.SeccionDTO;
import mx.com.nok.portlet.model.service.PortletService;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

import flex.messaging.io.ArrayList;

public class PortletAction extends ActionSupport implements ServletRequestAware, ServletResponseAware  {

	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(PortletAction.class);
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private PortletService portletService;
  
  
    
    
    
    
    public String portletTest()
    {
    	try {
    		System.out.println("Entrando..........");
    		System.out.println(portletService.getInfoProtletsAopSession().toString());
    		
    		PortletDTO _portletDTO = new PortletDTO();
    		
    		_portletDTO = (PortletDTO)portletService.getInfoProtletsAopSession();

					
    		portletService.updatePosicionPortletAopSession(_portletDTO);
    		
    		return SUCCESS;
			
		} catch (Exception e) {
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

	public PortletService getPortletService() {
		return portletService;
	}

	public void setPortletService(PortletService portletService) {
		this.portletService = portletService;
	}

	
	
	
}
