package mx.com.nok.obra.dao;

import java.util.List;

import mx.com.nok.maqune.model.dto.MaquneDTO;
import mx.com.nok.obra.model.dto.ObraDTO;
import mx.com.nok.obra.model.dto.ObraRecursoMaquneDTO;

public interface ObraDAO {
	
	public ObraDTO insertObra(ObraDTO dto)throws Exception;
	public ObraDTO updateObra(ObraDTO dto) throws Exception;
	public List<?> infoObra(ObraDTO dto) throws Exception;
	public boolean deleteObra(ObraDTO dto) throws Exception;
		
	
	public ObraRecursoMaquneDTO insertObraRecursoMaqune(ObraRecursoMaquneDTO dto)throws Exception;
	public ObraRecursoMaquneDTO updateObraRecursoMaqune(ObraRecursoMaquneDTO dto)throws Exception;
	public List<?> infoObraRecursoMaqune(ObraRecursoMaquneDTO dto)throws Exception;
	public boolean deleteObraRecursoMaqune(ObraRecursoMaquneDTO dto)throws Exception;
	

}
