package mx.com.nok.requisicion.model.service;

import java.util.List;


import mx.com.nok.requisicion.model.dto.RequisicionDTO;
import mx.com.nok.requisicion.model.dto.RequisicionDetalleDTO;

public interface RequisicionService {

	
	public List<?> infoRequisicion(RequisicionDTO dto);
	public RequisicionDTO insertRequisicion(RequisicionDTO dto);
	public RequisicionDTO updateRequisicion(RequisicionDTO dto);	
	public boolean deleteRequisicion(RequisicionDTO dto);
	
	
	public List<?> infoRequisicionDetalle(RequisicionDetalleDTO dto);
	public RequisicionDetalleDTO insertRequisicionDetalle(RequisicionDetalleDTO dto);
	public RequisicionDetalleDTO updateRequisicionDetalle(RequisicionDetalleDTO dto);	
	public boolean deleteRequisicionDetalle(RequisicionDetalleDTO dto);
	
	
	public List<?> infoRequisicionAopSession(RequisicionDTO dto);
	public RequisicionDTO insertRequisicionAopSession(RequisicionDTO dto);
	public RequisicionDTO updateRequisicionAopSession(RequisicionDTO dto);	
	public boolean deleteRequisicionAopSession(RequisicionDTO dto);
	
	
	public List<?> infoRequisicionDetalleAopSession(RequisicionDetalleDTO dto);
	public RequisicionDetalleDTO insertRequisicionDetalleAopSession(RequisicionDetalleDTO dto);
	public RequisicionDetalleDTO updateRequisicionDetalleAopSession(RequisicionDetalleDTO dto);	
	public boolean deleteRequisicionDetalleAopSession(RequisicionDetalleDTO dto);
	
	
}
