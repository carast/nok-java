package mx.com.nok.requisicion.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.falla.model.dto.FallaDTO;
import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.requisicion.dao.RequisicionDAO;
import mx.com.nok.requisicion.model.dto.RequisicionDTO;
import mx.com.nok.requisicion.model.dto.RequisicionDetalleDTO;
import mx.com.nok.requisicion.model.service.RequisicionService;
import mx.com.nok.salida.dao.SalidaDAO;

public class RequisicionBusiness implements Serializable,RequisicionService {

	
		
	private RequisicionDAO requisicionDAO;
	private static final long serialVersionUID = 1L;
	
	
	
	public List<?> infoRequisicionDetalle(RequisicionDetalleDTO dto) {
		List <?> list= new ArrayList<RequisicionDetalleDTO>();
		try {			
			
			list=requisicionDAO.infoRequisicionDetalle(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public RequisicionDetalleDTO insertRequisicionDetalle(RequisicionDetalleDTO dto) {
		try {
			return requisicionDAO.insertRequisicionDetalle(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}

	
	public RequisicionDetalleDTO updateRequisicionDetalle(RequisicionDetalleDTO dto) {
		try {
			return requisicionDAO.updateRequisicionDetalle(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}
	
	
	public boolean deleteRequisicionDetalle(RequisicionDetalleDTO dto) {
		try {
			return (Boolean)requisicionDAO.deleteRequisicionDetalle(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	
	
	public List<?> infoRequisicion(RequisicionDTO dto) {
		List <?> list= new ArrayList<RequisicionDTO>();
		try {			
			
			list=requisicionDAO.infoRequisicion(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public RequisicionDTO insertRequisicion(RequisicionDTO dto) {
		try {
			return requisicionDAO.insertRequisicion(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}

	
	public RequisicionDTO updateRequisicion(RequisicionDTO dto) {
		try {
			return requisicionDAO.updateRequisicion(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}
	
	
	public boolean deleteRequisicion(RequisicionDTO dto) {
		try {
			return (Boolean)requisicionDAO.deleteRequisicion(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}


	public RequisicionDAO getRequisicionDAO() {
		return requisicionDAO;
	}

	public void setRequisicionDAO(RequisicionDAO requisicionDAO) {
		this.requisicionDAO = requisicionDAO;
	}
	//---------------------------------------------------------------------------------
	
	
	public List<?> infoRequisicionDetalleAopSession(RequisicionDetalleDTO dto) {
		List <?> list= new ArrayList<RequisicionDetalleDTO>();
		try {			
			
			list=requisicionDAO.infoRequisicionDetalle(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public RequisicionDetalleDTO insertRequisicionDetalleAopSession(RequisicionDetalleDTO dto) {
		try {
			return requisicionDAO.insertRequisicionDetalle(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}

	
	public RequisicionDetalleDTO updateRequisicionDetalleAopSession(RequisicionDetalleDTO dto) {
		try {
			return requisicionDAO.updateRequisicionDetalle(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}
	
	
	public boolean deleteRequisicionDetalleAopSession(RequisicionDetalleDTO dto) {
		try {
			return (Boolean)requisicionDAO.deleteRequisicionDetalle(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	
	
	public List<?> infoRequisicionAopSession(RequisicionDTO dto) {
		List <?> list= new ArrayList<RequisicionDTO>();
		try {			
			
			list=requisicionDAO.infoRequisicion(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}

	
	public RequisicionDTO insertRequisicionAopSession(RequisicionDTO dto) {
		try {
			return requisicionDAO.insertRequisicion(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}

	
	public RequisicionDTO updateRequisicionAopSession(RequisicionDTO dto) {
		try {
			return requisicionDAO.updateRequisicion(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}	
	}
	
	
	public boolean deleteRequisicionAopSession(RequisicionDTO dto) {
		try {
			return (Boolean)requisicionDAO.deleteRequisicion(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	
}
