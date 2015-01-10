package mx.com.nok.equipo.dao.ibatis;

import java.util.List;

import mx.com.nok.equipo.dao.EquipoDAO;
import mx.com.nok.equipo.model.dto.EquipoDTO;
import mx.com.nok.equipo.model.dto.MarcaMotorDTO;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class EquipoDAOImpl   extends SqlMapClientDaoSupport implements EquipoDAO {

	
	public List<?> infoEquipo(EquipoDTO dto) throws Exception {
		return this.getSqlMapClientTemplate(). 
				queryForList("infoEquipo",dto);
	}

	
	public List<?> insertEquipo(EquipoDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().
				queryForList("insertEquipo",dto);
	}

	
	public EquipoDTO updateEquipo(EquipoDTO dto) throws Exception {
		return (EquipoDTO)this.getSqlMapClientTemplate().
				queryForObject("updateEquipo",dto);
	}

	
	public boolean deleteEquipo(EquipoDTO dto) throws Exception {
		return (Boolean)this.getSqlMapClientTemplate().
				queryForObject("deleteEquipo",dto);
	}

	
	public EquipoDTO updateEstatusEquipo(EquipoDTO dto) throws Exception {
		return (EquipoDTO)this.getSqlMapClientTemplate().
				queryForObject("updateEstatusEquipo",dto);
	}
	
	//Servicio que regresa la lista de marcas de motor
	public List<?> infoMarcasMotor(MarcaMotorDTO dto) throws Exception {
		return this.getSqlMapClientTemplate().queryForList("infoMarcaMotor", dto);
	}
	
}
