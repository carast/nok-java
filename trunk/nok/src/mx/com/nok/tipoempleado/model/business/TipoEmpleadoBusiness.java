package mx.com.nok.tipoempleado.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.empleado.model.dto.TipoEmpleadoDTO;
import mx.com.nok.tipoempleado.dao.TipoEmpleadoDAO;
import mx.com.nok.tipoempleado.model.service.TipoEmpleadoService;

public class TipoEmpleadoBusiness implements Serializable, TipoEmpleadoService {

	private TipoEmpleadoDAO tipoEmpleadoDAO;
	
	public TipoEmpleadoDAO getTipoEmpleadoDAO() {
		return tipoEmpleadoDAO;
	}

	public void setTipoEmpleadoDAO(TipoEmpleadoDAO tipoEmpleadoDAO) {
		this.tipoEmpleadoDAO = tipoEmpleadoDAO;
	}

	@Override
	public List<?> insertTipoEmpleadoAopSession(TipoEmpleadoDTO tipoEmpleadoDTO) {
		List<?> list = new ArrayList<TipoEmpleadoDTO>();
		try {
			list = tipoEmpleadoDAO.insertTipoEmpleado(tipoEmpleadoDTO);
		} catch (Exception e) {
			// TODO: handle exception
			list = null;
		}
		
		return list;
	}
	
	public String test()
	{
		return "Hola ";
	}

	@Override
	public boolean deleteTipoEmpleadoAopSession(TipoEmpleadoDTO tipoEmpleadoDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<?> getTipoEmpleadoAopSession(TipoEmpleadoDTO tipoEmpleadoDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
