package mx.com.nok.requisicion.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.requisicion.dao.RequisicionDAO;
import mx.com.nok.requisicion.model.dto.RequisicionDTO;
import mx.com.nok.requisicion.model.dto.RequisicionDetalleDTO;

public class RequisicionDAOImpl extends SqlMapClientDaoSupport implements RequisicionDAO {

	
	public List<?> infoRequisicionDetalle(RequisicionDetalleDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoRequisicionDetalle",dto);
	}
	
	public RequisicionDetalleDTO insertRequisicionDetalle(RequisicionDetalleDTO dto)
			throws Exception {
		return (RequisicionDetalleDTO)this.getSqlMapClientTemplate().
		queryForObject("insertRequisicionDetalle",dto);
	}

	
	public RequisicionDetalleDTO updateRequisicionDetalle(RequisicionDetalleDTO dto)
			throws Exception {
		return (RequisicionDetalleDTO)this.getSqlMapClientTemplate().
		queryForObject("updateRequisicionDetalle",dto);
	}

	
	public boolean deleteRequisicionDetalle(RequisicionDetalleDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteRequisicionDetalle",dto);
	}
	
	public List<?> infoRequisicion(RequisicionDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoRequisicion",dto);
	}
	
	public RequisicionDTO insertRequisicion(RequisicionDTO dto)
			throws Exception {
		return (RequisicionDTO)this.getSqlMapClientTemplate().
		queryForObject("insertRequisicione",dto);
	}

	
	public RequisicionDTO updateRequisicion(RequisicionDTO dto)
			throws Exception {
		return (RequisicionDTO)this.getSqlMapClientTemplate().
		queryForObject("updateRequisicion",dto);
	}

	
	public boolean deleteRequisicion(RequisicionDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteRequisicion",dto);
	}

	

	

	

}
