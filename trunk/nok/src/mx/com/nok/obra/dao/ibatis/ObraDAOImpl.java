package mx.com.nok.obra.dao.ibatis;

import java.util.List;

import mx.com.nok.obra.dao.ObraDAO;
import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.obra.model.dto.ObraRecursoMaquneDTO;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ObraDAOImpl extends SqlMapClientDaoSupport implements ObraDAO {

	public List<?> infoObra(ObraDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
				queryForList("infoObra",dto);
	}
	
	public ObraDTO insertObra(ObraDTO dto) throws Exception {
		
		return (ObraDTO)this.getSqlMapClientTemplate().
				queryForObject("insertObra",dto);
	}

	
	public ObraDTO updateObra(ObraDTO dto) throws Exception {
		return (ObraDTO)this.getSqlMapClientTemplate().
				queryForObject("updateObra",dto);
	}
	
	public boolean deleteObra(ObraDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteObra",dto);
	}
	
	
	public List<?> infoObraRecursoMaqune(ObraRecursoMaquneDTO dto)
			throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoObraRecursoMaqune",dto);
	}

	
	public ObraRecursoMaquneDTO insertObraRecursoMaqune(ObraRecursoMaquneDTO dto)
			throws Exception {
		return (ObraRecursoMaquneDTO)this.getSqlMapClientTemplate().
		queryForObject("insertObraRecursoMaqune",dto);
	}
	
	public ObraRecursoMaquneDTO updateObraRecursoMaqune(ObraRecursoMaquneDTO dto)
			throws Exception {
		return (ObraRecursoMaquneDTO)this.getSqlMapClientTemplate().
		queryForObject("updateObraRecursoMaqune",dto);
	}
	
	public boolean deleteObraRecursoMaqune(ObraRecursoMaquneDTO dto)
	throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteObraRecursoMaqune",dto);
	}
	
	

}
