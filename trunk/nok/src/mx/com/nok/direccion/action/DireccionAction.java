package mx.com.nok.direccion.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.com.nok.direccion.model.dto.EntidadDTO;
import mx.com.nok.direccion.model.dto.LocalidadDTO;
import mx.com.nok.direccion.model.dto.MunicipioDTO;
import mx.com.nok.direccion.model.service.DireccionService;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import com.opensymphony.xwork2.ActionSupport;

public class DireccionAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {
	
	private static final long serialVersionUID = 1L; 
	private Logger log = Logger.getLogger(this.getClass());
    private HttpServletRequest servletRequest;
    private HttpServletResponse servletResponse;
    private DireccionService direccionService;
    
    public DireccionService getDireccionService() {
		return direccionService;
	}


	public void setDireccionService(DireccionService direccionService) {
		this.direccionService = direccionService;
	}


	public String direccionTest()
    {
    	try{
    		
    		System.out.println("Empezando Test dirección");
    		
//    		prueba retrieve
    		//EntidadDTO dto= new EntidadDTO();    		
//    		dto.setIdEntidad("");
//    		System.out.println("Retrieve Entidad :"+ direccionService.catEntidad(dto));
    		
    		
    		
//    		Prueba Insert
//    		dto.setIdEntidad("34");
//    		dto.setEntidad("Ejemplo3");
//    		dto.setSigla("E3");
//    		
//    		System.out.println("Insert Entidad :"+ direccionService.insertEntidad(dto));
//    		dto.setIdEntidad("");
//    		System.out.println("Retrieve Entidad :"+ direccionService.catEntidad(dto));
    		
//    		dto.setIdEntidad("34");
//    		dto.setEntidad("Ejemplo3xx");
//    		dto.setSigla("E8");
//    		
//    		System.out.println("Insert Entidad :"+ direccionService.updateEntidad(dto));
//    		dto.setIdEntidad("");
//    		System.out.println("Retrieve Entidad :"+ direccionService.catEntidad(dto));
    		
    		
    		
//    		dto.setIdEntidad("34");    		
//    		System.out.println("Insert Entidad :"+ direccionService.deleteEntidad(dto));
//    		dto.setIdEntidad("");
//    		System.out.println("Retrieve Entidad :"+ direccionService.catEntidad(dto));
    		
    		
    		
    		
//    		prueba retrieve 
//    		LocalidadDTO locdto=new LocalidadDTO();
//    		locdto.setIdEntidad("");
//    		locdto.setIdMunicipio("034");
//    		locdto.setIdLocalidad("0001");
//    		System.out.println("Retrieve Localidad :"+ direccionService.catLocalidad(locdto));
    		
    		
    		//prueba insert 
//    		locdto.setIdEntidad("08");
//    		locdto.setIdMunicipio("034");
//    		locdto.setIdLocalidad("9999");
//    		locdto.setLocalidad("Localidad Ejemplo");
//    		System.out.println("insert Localidad :"+ direccionService.insertLocalidad(locdto));
//    		
//    		
//    		
//    		locdto.setIdEntidad("");
//    		locdto.setIdMunicipio("034");
//    		locdto.setIdLocalidad("9999");
//    		System.out.println("Retrieve Localidad :"+ direccionService.catLocalidad(locdto));
    		
    		
//    		locdto.setIdEntidad("08");
//    		locdto.setIdMunicipio("034");
//    		locdto.setIdLocalidad("9999");
//    		locdto.setLocalidad("Localidad Ejemploxxxxxx");
//    		System.out.println("update Localidad :"+ direccionService.updateLocalidad(locdto));
//    		
//    		
//    		
//    		locdto.setIdEntidad("");
//    		locdto.setIdMunicipio("034");
//    		locdto.setIdLocalidad("9999");
//    		System.out.println("Retrieve Localidad :"+ direccionService.catLocalidad(locdto));
    		
    		
    		
    		
//    		locdto.setIdEntidad("08");
//    		locdto.setIdMunicipio("034");
//    		locdto.setIdLocalidad("9999");    		
//    		System.out.println("update Localidad :"+ direccionService.deleteLocalidad(locdto));
//    		
//    		
//    		
//    		locdto.setIdEntidad("");
//    		locdto.setIdMunicipio("034");
//    		locdto.setIdLocalidad("9999");
//    		System.out.println("Retrieve Localidad :"+ direccionService.catLocalidad(locdto));
    		
    		
    		
    		
    		
    		
    		
    		
//    		prueba retrieve
    		MunicipioDTO mundtoDto=new MunicipioDTO();
//    		mundtoDto.setIdEntidad("");
//    		mundtoDto.setIdMunicipio("");
//    		System.out.println("Retrieve Municipio:"+ direccionService.catMunicipio(mundtoDto));
//    		
    		
    		//prueba insert
//    		mundtoDto.setIdEntidad("08");
//    		mundtoDto.setIdMunicipio("571");
//    		mundtoDto.setMunicipio("municipio ejemplo");    		
//    		System.out.println("insert Municipio:"+ direccionService.insertMunicipio(mundtoDto));    		
//    		
//    		mundtoDto.setIdEntidad("");
//    		mundtoDto.setIdMunicipio("");
//    		System.out.println("Retrieve Municipio:"+ direccionService.catMunicipio(mundtoDto));

    		
    		//prueba update
//    		mundtoDto.setIdEntidad("08");
//    		mundtoDto.setIdMunicipio("571");
//    		mundtoDto.setMunicipio("municipio ejemploxxxxxxx");    		
//    		System.out.println("update Municipio:"+ direccionService.updateMunicipio(mundtoDto));    		
//    		
//    		mundtoDto.setIdEntidad("");
//    		mundtoDto.setIdMunicipio("");
//    		System.out.println("Retrieve Municipio:"+ direccionService.catMunicipio(mundtoDto));
    		
    		
    		
    		//prueba delete
    		mundtoDto.setIdEntidad("08");
    		mundtoDto.setIdMunicipio("571");
    		System.out.println("delete Municipio:"+ direccionService.deleteMunicipio(mundtoDto));    		
    		mundtoDto.setIdEntidad("");
    		mundtoDto.setIdMunicipio("");
    		System.out.println("Retrieve Municipio:"+ direccionService.catMunicipio(mundtoDto));
//    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		

    		
    		
    		
    		
    		
    		
    		
    		return SUCCESS;
    	}
    	catch (Exception e) {
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