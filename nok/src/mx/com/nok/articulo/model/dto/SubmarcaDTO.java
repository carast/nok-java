package mx.com.nok.articulo.model.dto;

import java.io.Serializable;
import java.util.List;

public class SubmarcaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String idMarca;
	private String idSubmarca;
	private String idSubcategoria;
	private String submarca;
	private String marca;
	private String subcategoria;
	private String filterEstatusSubmarca="";
	private String filterEstatusArticulo="";
	private boolean estatus;
	private List<?> listSubmarca;
	private List<?> listAtriculo;
	
	public String getMarca() {
		return marca;
	}






	public void setMarca(String marca) {
		this.marca = marca;
	}






	public String getIdSubcategoria() {
		return idSubcategoria;
	}






	public void setIdSubcategoria(String idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}






	public String getSubcategoria() {
		return subcategoria;
	}






	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}

	
	public String toString()
	{
		return "\n[ idMarca = "+idMarca +
			 	"\n idSubmarca = "+idSubmarca +
				"\n submarca = "+submarca +
				"\n estatus = "+estatus+ 
				"\n listSubmarca = " +listSubmarca+"]";	
	}
	
	
	
	
	
	
	public String getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(String idMarca) {
		this.idMarca = idMarca;
	}
	public String getIdSubmarca() {
		return idSubmarca;
	}
	public void setIdSubmarca(String idSubmarca) {
		this.idSubmarca = idSubmarca;
	}
	public String getSubmarca() {
		return submarca;
	}
	public void setSubmarca(String submarca) {
		this.submarca = submarca;
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






	public String getFilterEstatusSubmarca() {
		return filterEstatusSubmarca;
	}






	public void setFilterEstatus(String filterEstatusSubmarca) {
		this.filterEstatusSubmarca = filterEstatusSubmarca;
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






	/**
	 * @return the listAtriculo
	 */
	public List<?> getListAtriculo() {
		return listAtriculo;
	}






	/**
	 * @param listAtriculo the listAtriculo to set
	 */
	public void setListAtriculo(List<?> listAtriculo) {
		this.listAtriculo = listAtriculo;
	}






	/**
	 * @param filterEstatusSubmarca the filterEstatusSubmarca to set
	 */
	public void setFilterEstatusSubmarca(String filterEstatusSubmarca) {
		this.filterEstatusSubmarca = filterEstatusSubmarca;
	}
}
