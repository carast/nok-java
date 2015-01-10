package mx.com.nok.tipoempleado.model.service;

import java.util.List;

import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;

public interface TipoEmpleadoService {
	public List<?> insertTipoEmpleadoAopSession(TipoEmpleadoDTO tipoEmpleadoDTO);
	public boolean deleteTipoEmpleadoAopSession(TipoEmpleadoDTO tipoEmpleadoDTO);
	public List<?> getTipoEmpleadoAopSession(TipoEmpleadoDTO tipoEmpleadoDTO);
	public String test();
}
