package mx.com.nok.obra.model.service;

import java.util.List;

import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.obra.model.dto.ObraRecursoMaquneDTO;

public interface ObraService {

	
	public ObraDTO insertObra(ObraDTO dto);
	public ObraDTO updateObra(ObraDTO dto);
	public List<?> infoObra(ObraDTO dto);
	public boolean deleteObra(ObraDTO dto);
	
	
	public ObraRecursoMaquneDTO insertObraRecursoMaqune(ObraRecursoMaquneDTO dto);
	public ObraRecursoMaquneDTO updateObraRecursoMaqune(ObraRecursoMaquneDTO dto);
	public List<?> infoObraRecursoMaqune(ObraRecursoMaquneDTO dto);
	public boolean deleteObraRecursoMaqune(ObraRecursoMaquneDTO dto);
	
		
	public ObraDTO insertObraAopSession(ObraDTO dto);
	public ObraDTO updateObraAopSession(ObraDTO dto);
	public List<?> infoObraAopSession(ObraDTO dto);
	public boolean deleteObraAopSession(ObraDTO dto);
	
	
	public ObraRecursoMaquneDTO insertObraRecursoMaquneAopSession(ObraRecursoMaquneDTO dto);
	public ObraRecursoMaquneDTO updateObraRecursoMaquneAopSession(ObraRecursoMaquneDTO dto);
	public List<?> infoObraRecursoMaquneAopSession(ObraRecursoMaquneDTO dto);
	public boolean deleteObraRecursoMaquneAopSession(ObraRecursoMaquneDTO dto);
	
	
	
}
