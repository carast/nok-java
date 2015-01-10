package mx.com.nok.portlet.dao.ibatis;

import java.util.List;


import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;



import mx.com.nok.core.usuario.model.dto.UsuarioDTO;
import mx.com.nok.portlet.dao.PortletDAO;
import mx.com.nok.portlet.model.dto.ConfigPanelDTO;
import mx.com.nok.portlet.model.dto.PortletDTO;


public class PortletDAOImpl extends SqlMapClientDaoSupport implements PortletDAO{

	
	public List<?> getInfoPortlets(ConfigPanelDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
				queryForList("infoPortlet",dto);}
	

	
	public Boolean updatePosicionPortlet(PortletDTO dto) throws Exception {
		 return (Boolean)this.getSqlMapClientTemplate().queryForObject("updateInfoPortlet",dto);
	}

	
	public List<?> getInfoSeccion(UsuarioDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
				queryForList("infoSeccion",dto);
	}

	
	
	

	

	


	
	  
		

	
	
	
	
	
	
	
	

}
