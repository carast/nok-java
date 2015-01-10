package mx.com.nok.articulo.model.dto;

import java.io.Serializable;
import java.util.List;

public class MarcaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String idMarca;
	private String marca;
	private String filterEstatusMarca="";
	private String filterEstatusSubmarca="";
	private String filterEstatusArticulo="";
	private boolean estatus;	
	private List<?> listSubmarca;
	private List<?> listMarca;	
	private String subcategoria;
	private String idSubcategoria;
	
	public String toString()
	{
		return 
				"\n\t [ idMarca = " +idMarca+
				"\n\t marca = " +marca+
				"\n\t estatus = " +estatus+
				"\n\t listMarca = " +listMarca+ 
				"\n\t  listSubmarca = " +listSubmarca+"]";
				
		
	}


	public String getSubcategoria() {
		return subcategoria;
	}


	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}
		
	
	public String getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(String idMarca) {
		this.idMarca = idMarca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean getEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}


	public List<?> getListSubmarca() {
		return listSubmarca;
	}


	public void setListSubmarca(List<?> listSubmarca) {
		this.listSubmarca = listSubmarca;
	}


	public List<?> getListMarca() {
		return listMarca;
	}


	public void setListMarca(List<?> listMarca) {
		this.listMarca = listMarca;
	}
	/**
	 * @return the filterEstatusSubmarca
	 */
	public String getFilterEstatusSubmarca() {
		return filterEstatusSubmarca;
	}


	/**
	 * @param filterEstatusSubmarca the filterEstatusSubmarca to set
	 */
	public void setFilterEstatusSubmarca(String filterEstatusSubmarca) {
		this.filterEstatusSubmarca = filterEstatusSubmarca;
	}


	/**
	 * @return the filterEstatusMarca
	 */
	public String getFilterEstatusMarca() {
		return filterEstatusMarca;
	}


	/**
	 * @param filterEstatusMarca the filterEstatusMarca to set
	 */
	public void setFilterEstatusMarca(String filterEstatusMarca) {
		this.filterEstatusMarca = filterEstatusMarca;
	}


	/**
	 * @return the filterEstatusArticulo
	 */
	public String getFilterEstatusArticulo() {
		return filterEstatusArticulo;
	}


	/**
	 * @param filterEstatusArticulo the filterEstatusArticulo to set
	 */
	public void setFilterEstatusArticulo(String filterEstatusArticulo) {
		this.filterEstatusArticulo = filterEstatusArticulo;
	}


	public String getIdSubcategoria() {
		return idSubcategoria;
	}


	public void setIdSubcategoria(String idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}

	
}
