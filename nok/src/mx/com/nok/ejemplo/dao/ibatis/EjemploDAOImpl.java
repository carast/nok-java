package mx.com.nok.ejemplo.dao.ibatis;


import java.util.List;

import mx.com.nok.ejemplo.dao.EjemploDAO;
import mx.com.nok.empleado.model.dto.EmpleadoDTO;
import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class EjemploDAOImpl extends SqlMapClientDaoSupport implements EjemploDAO{

	@Override
	public boolean deleteEmpleado(EmpleadoDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
		queryForObject("deleteEmpleado",dto);
	}

	@Override
	public List<?> infoEmpleado(EmpleadoDTO dto) throws Exception {
		return this.getSqlMapClientTemplate(). 
		queryForList("infoEmpleado",dto);
	}

	@Override
	public EmpleadoDTO insertEmpleado(EmpleadoDTO dto) throws Exception {
		 return (EmpleadoDTO)this.getSqlMapClientTemplate().
			queryForObject("insertEmpleado",dto);
	}

	@Override
	public EmpleadoDTO updateEmpleado(EmpleadoDTO dto) throws Exception {
		 return (EmpleadoDTO)this.getSqlMapClientTemplate().
			queryForObject("updateEmpleado",dto);
	}

	
	public EmpleadoDTO updateEstatusEmpleado(EmpleadoDTO dto) throws Exception {
		 return (EmpleadoDTO)this.getSqlMapClientTemplate().
			queryForObject("updateEstatusEmpleado",dto);
	}
	
public boolean deleteTipoEmpleado(TipoEmpleadoDTO dto) throws Exception {
		
		return (Boolean)this.getSqlMapClientTemplate().
			queryForObject("deleteTipoEmpleado",dto);
	}

	
	public List<?> infoTipoEmpleado(TipoEmpleadoDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
		queryForList("infoTipoEmpleado",dto);
	}

	
	
	public TipoEmpleadoDTO insertTipoEmpleado(TipoEmpleadoDTO dto) throws Exception {
		return (TipoEmpleadoDTO)this.getSqlMapClientTemplate().
		queryForObject("insertTipoEmpleado",dto);
	}

	
	public TipoEmpleadoDTO updateEstatusTipoEmpleado(TipoEmpleadoDTO dto) throws Exception {
		return (TipoEmpleadoDTO)this.getSqlMapClientTemplate().
		queryForObject("updateEstatusTipoEmpleado",dto);
	}

	
	public TipoEmpleadoDTO updateTipoEmpleado(TipoEmpleadoDTO dto) throws Exception {
		 return (TipoEmpleadoDTO)this.getSqlMapClientTemplate().
			queryForObject("updateTipoEmpleado",dto);
	}
	

}
