package mx.com.nok.obra.model.business;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mx.com.nok.obra.dao.ObraDAO;
import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.obra.model.dto.ObraRecursoMaquneDTO;
import mx.com.nok.obra.model.service.ObraService;

public class ObraBusiness implements Serializable, ObraService{

	
	
	private ObraDAO obraDAO;
	private static final long serialVersionUID = 1L;
	
	
	public List<?> infoObra(ObraDTO dto) {
		List <?> list= new ArrayList<ObraDTO>();
		try {			
			
			list=obraDAO.infoObra(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	
	
	public ObraDTO insertObra(ObraDTO dto) {
		try {
			return obraDAO.insertObra(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public ObraDTO updateObra(ObraDTO dto) {
	try {
			
			return obraDAO.updateObra(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	public boolean deleteObra(ObraDTO dto) {
		try {
			return (Boolean)obraDAO.deleteObra(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	public ObraDAO getObraDAO() {
		return obraDAO;
	}

	public void setObraDAO(ObraDAO obraDAO) {
		this.obraDAO = obraDAO;
	}



	
	

	
	public List<?> infoObraRecursoMaqune(ObraRecursoMaquneDTO dto) {
		List <?> list= new ArrayList<ObraRecursoMaquneDTO>();
		try {			
			
			list=obraDAO.infoObraRecursoMaqune(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}



	
	public ObraRecursoMaquneDTO insertObraRecursoMaqune(ObraRecursoMaquneDTO dto) {
		try {
			return obraDAO.insertObraRecursoMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}



	
	public ObraRecursoMaquneDTO updateObraRecursoMaqune(ObraRecursoMaquneDTO dto) {
		try {
			return obraDAO.updateObraRecursoMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	public boolean deleteObraRecursoMaqune(ObraRecursoMaquneDTO dto) {
		try {
			return (Boolean)obraDAO.deleteObraRecursoMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
//--------------------------------------------------------------

	
	
	public List<?> infoObraAopSession(ObraDTO dto) {
		List <?> list= new ArrayList<ObraDTO>();
		try {			
			
			list=obraDAO.infoObra(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}
	
	
	
	public ObraDTO insertObraAopSession(ObraDTO dto) {
		try {
			return obraDAO.insertObra(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}

	
	public ObraDTO updateObraAopSession(ObraDTO dto) {
	try {
			
			return obraDAO.updateObra(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	public boolean deleteObraAopSession(ObraDTO dto) {
		try {
			return (Boolean)obraDAO.deleteObra(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}

	
	
	public List<?> infoObraRecursoMaquneAopSession(ObraRecursoMaquneDTO dto) {
		List <?> list= new ArrayList<ObraRecursoMaquneDTO>();
		try {			
			
			list=obraDAO.infoObraRecursoMaqune(dto);	
			
			 
		} catch (Exception e) {			
			e.printStackTrace();
			 list=null;
		}
		
		return list;
	}



	
	public ObraRecursoMaquneDTO insertObraRecursoMaquneAopSession(ObraRecursoMaquneDTO dto) {
		try {
			return obraDAO.insertObraRecursoMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}		
	}



	
	public ObraRecursoMaquneDTO updateObraRecursoMaquneAopSession(ObraRecursoMaquneDTO dto) {
		try {
			return obraDAO.updateObraRecursoMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return null;
		}
	}

	
	public boolean deleteObraRecursoMaquneAopSession(ObraRecursoMaquneDTO dto) {
		try {
			return (Boolean)obraDAO.deleteObraRecursoMaqune(dto);
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
	}
	
}
