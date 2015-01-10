package mx.com.nok.portlet.dao;

import java.util.List;

import mx.com.nok.core.usuario.model.dto.UsuarioDTO;
import mx.com.nok.portlet.model.dto.ConfigPanelDTO;
import mx.com.nok.portlet.model.dto.PortletDTO;
import mx.com.nok.portlet.model.dto.SeccionDTO;

public interface PortletDAO {	
	public List<?> getInfoPortlets(ConfigPanelDTO dto)  throws Exception;	
	//public  ConfigPanelDTO updatePosicionPortlet(ConfigPanelDTO dto) throws Exception;
	public  Boolean updatePosicionPortlet(PortletDTO dto) throws Exception;
	public List<?>  getInfoSeccion(UsuarioDTO dto)throws Exception;
}
