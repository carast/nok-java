package mx.com.nok.ejemplo.dao;

import java.util.List;

import mx.com.nok.empleado.model.dto.EmpleadoDTO;
import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;
import mx.com.nok.menu.model.dto.MenuDTO;

public interface EjemploDAO {
	
	public List<?> infoEmpleado(EmpleadoDTO dto) throws Exception;	
	public EmpleadoDTO insertEmpleado(EmpleadoDTO dto)throws Exception;
	public EmpleadoDTO updateEmpleado(EmpleadoDTO dto) throws Exception;
	public boolean deleteEmpleado(EmpleadoDTO dto) throws Exception;
	public EmpleadoDTO updateEstatusEmpleado(EmpleadoDTO dto)throws Exception;
	
	public List<?> infoTipoEmpleado(TipoEmpleadoDTO dto) throws Exception;
	public TipoEmpleadoDTO insertTipoEmpleado(TipoEmpleadoDTO dto) throws Exception;
	public TipoEmpleadoDTO updateTipoEmpleado(TipoEmpleadoDTO dto)throws Exception;
	public boolean deleteTipoEmpleado(TipoEmpleadoDTO dto) throws Exception;
	public TipoEmpleadoDTO updateEstatusTipoEmpleado(TipoEmpleadoDTO dto)throws Exception;

}
