package mx.com.nok.portlet.model.service;

import java.util.List;

import mx.com.nok.core.usuario.model.dto.UsuarioDTO;
import mx.com.nok.portlet.model.dto.PortletDTO;

public interface PortletService{

	public List<?> getInfoPortletsAopSession();
	public  Boolean updatePosicionPortletAopSession(PortletDTO portletDTO);
	
}
