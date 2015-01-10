package mx.com.nok.equipo.model.service;

import java.util.List;

import mx.com.nok.equipo.model.dto.EquipoDTO;
import mx.com.nok.equipo.model.dto.MarcaMotorDTO;

public interface EquipoService {

	public List<?> insertEquipoAopSession(EquipoDTO dto);
	public EquipoDTO updateEquipoAopSession(EquipoDTO dto);
	public List<?> infoEquipoAopSession(EquipoDTO dto);
	public boolean deleteEquipoAopSession(EquipoDTO dto);
	public EquipoDTO updateEstatusEquipoAopSession(EquipoDTO dto);	
	
	//Servicio para obtener las marcas de motor
	public List<?> infoMarcasMotorAopSession(MarcaMotorDTO dto);
}
