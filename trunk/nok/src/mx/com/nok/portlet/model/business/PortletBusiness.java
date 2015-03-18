package mx.com.nok.portlet.model.business;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import flex.messaging.FlexContext;

import mx.com.nok.core.usuario.model.dto.UsuarioDTO;
import mx.com.nok.portlet.dao.PortletDAO;
import mx.com.nok.portlet.model.dto.ConfigPanelDTO;
import mx.com.nok.portlet.model.dto.PortletDTO;
import mx.com.nok.portlet.model.dto.SeccionDTO;
import mx.com.nok.portlet.model.service.PortletService;


public class PortletBusiness implements Serializable,PortletService{	
	
	
	private PortletDAO portletDAO;
	private static final long serialVersionUID = 1L;
	
	public PortletDAO getPortletDAO() {
		return portletDAO;
	}


	public void setPortletDAO(PortletDAO portletDAO) {
		this.portletDAO = portletDAO;
	}


	//----------------------------------------------------------------------------


	

	/**
	 * Guarda la informaci�n de los portlets en caso de que el 
	 * portlet sea un portlet nuevo se guardara su configuraci�n
	 * asignando el idConfig una vez que se haya insertado en 
	 * la tabla
	 *   
	 */
	public Boolean updatePosicionPortletAopSession(PortletDTO portletDTO) {		
		try {
			
			UsuarioDTO dto=(UsuarioDTO)FlexContext.getHttpRequest().getSession().
					 getAttribute("usrNok");
			if(dto.getUsuario() != ""){
					//Preparamos el DTO para setear los valores
					portletDTO.setId_usuario(dto.getIdUsuario());
					return portletDAO.updatePosicionPortlet(portletDTO);
			}
			else{
				return false;		
					}
			} catch (Exception e) {
				e.printStackTrace();
				return false;

		}		
	}
	
	
	/**
	 * Esta funcion es para obtener informacion de 
	 * la configuracion de los portles del usuario.
	 */
	public List<?> getInfoPortletsAopSession() {
		
		
		//Solicita datos de la session
		UsuarioDTO dto=(UsuarioDTO)FlexContext.getHttpRequest().getSession().
		getAttribute("usrNok");
		
		
		//TODO Borrar estos println solo es para verdatos del usuario que se logueo
		System.out.println("Usuario : "+dto.getUsuario());
		System.out.println("Rfc_Usuario : "+dto.getRfcUsuario());
		System.out.println("P_acceso : "+dto.getPass());
		System.out.println("Perfil"+dto.getPerfil());
		System.out.println("Id_Perfil"+dto.getIdPerfil());
		System.out.println("Status "+dto.getStatus());
		System.out.println("idUsuario "+dto.getStatus());		
		 
		
		List <?> list= new ArrayList<SeccionDTO>();		
		try {
			//Obtenemos la informaci�n de las secciones
			list = portletDAO.getInfoSeccion(dto);		

			for(Object obj :  list){
				SeccionDTO seccion=(SeccionDTO)obj;
				
				//Seteamos valores para preparar el DTO
				ConfigPanelDTO confdto=new ConfigPanelDTO();				
				confdto.setIdMenu(String.valueOf(seccion.getId_menu()));
				confdto.setIdUsuario(dto.getIdUsuario());
				
				//Solicitamos la informacion de los portles de acuerdo
				//a la secci�n
				seccion.setLisPortlet(portletDAO.getInfoPortlets(confdto)) ;
			}

		}catch (Exception e) {
			e.printStackTrace();
			list=null;
		}		
		
		
		return list;
	}	

	



	
	
	
	
}
