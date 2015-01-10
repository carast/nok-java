package mx.com.nok.tipoempleado.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;
import mx.com.nok.tipoempleado.dao.TipoEmpleadoDAO;

public class TipoEmpleadoDAOImpl extends SqlMapClientDaoSupport implements TipoEmpleadoDAO {

	@Override
	public List<?> insertTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO)
			throws Exception {
		return this.getSqlMapClientTemplate().queryForList("insertTipoEmpleadoTest", tipoEmpleadoDTO);
	}

	@Override
	public boolean deleteTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO)
			throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<?> getTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
