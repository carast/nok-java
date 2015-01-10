package mx.com.nok.portlet.model.dto;

import java.io.Serializable;

public class ConfigPanelDTO implements Serializable{
	
	
	
	 private static final long serialVersionUID = 1L;
	 private String idConfig;
	 private String idUsuario;	
	 private String	idComponente;
	 private String	descripcion;
	 private String componente; 
	 private String nombreCortoComponente;
	 private String nombreSubmenu;
	 private String mainPosicion;
	 private String idMenu;
	 private int	posicion; 
	 private String dateLastPosicion;
	 
	 
	 public String toString(){	 
		 
		  return "[ idConfig = " +idConfig +
					"idUsuario = " + idUsuario +
					"idComponente = " + idComponente +
					"descripcion = " +descripcion +
					"componente = " + componente +
					"nombreCortoComponente = " + nombreCortoComponente +
					"nombreSubmenu = " + nombreSubmenu +
					"mainPosicion = " + mainPosicion +
					"posicion = " + posicion +
					"dateLastPosicion = " + dateLastPosicion +" ]";
	 }
	 
	 
	 
	public String getIdConfig() {
		return idConfig;
	}
	public void setIdConfig(String idConfig) {
		this.idConfig = idConfig;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getIdComponente() {
		return idComponente;
	}
	public void setIdComponente(String idComponente) {
		this.idComponente = idComponente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getComponente() {
		return componente;
	}
	public void setComponente(String componente) {
		this.componente = componente;
	}
	public String getNombreCortoComponente() {
		return nombreCortoComponente;
	}
	public void setNombreCortoComponente(String nombreCortoComponente) {
		this.nombreCortoComponente = nombreCortoComponente;
	}
	public String getNombreSubmenu() {
		return nombreSubmenu;
	}
	public void setNombreSubmenu(String nombreSubmenu) {
		this.nombreSubmenu = nombreSubmenu;
	}
	public String getMainPosicion() {
		return mainPosicion;
	}
	public void setMainPosicion(String mainPosicion) {
		this.mainPosicion = mainPosicion;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public String getDateLastPosicion() {
		return dateLastPosicion;
	}
	public void setDateLastPosicion(String dateLastPosicion) {
		this.dateLastPosicion = dateLastPosicion;
	}



	public String getIdMenu() {
		return idMenu;
	}



	public void setIdMenu(String idMenu) {
		this.idMenu = idMenu;
	} 

}
