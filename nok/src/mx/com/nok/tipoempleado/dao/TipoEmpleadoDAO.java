package mx.com.nok.tipoempleado.dao;

import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;

import java.util.List;

public interface TipoEmpleadoDAO {
	public List<?> insertTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO) throws Exception;
	public boolean deleteTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO) throws Exception;
	public List<?> getTipoEmpleado(TipoEmpleadoDTO tipoEmpleadoDTO) throws Exception;
}
