package mx.com.nok.portlet.model.dto;

import java.io.Serializable;

public class PortletDTO implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	private Integer id_config;
	private Integer id_componente;
	private String componente_class;
	
	private String nombreCortoComponente;
	private String nombre_submenu;
	
	private String main_posicion;
	private Integer posicion; 	
	private Integer id_menu; 	
	private String nombreCortoMenu;
	private String id_usuario;
	


	public String toString(){		
		
		return "[\n id_config = " +id_config +		
		"\n main_posicion = " + main_posicion +
		"\n posicion = " +posicion +		
		"\n id_componente = " + id_componente +
		"\n componente_class = " + componente_class +
		"\n nombre_submenu = " + nombre_submenu +	
		"\n id_menu = " + id_menu +
		"\n nombreCortoMenu = " + nombreCortoMenu +
		"\n nombreCortoMenu = " + nombreCortoComponente +" ]";		
	}	
	
	public Integer getId_config() {
		return id_config;
	}
	public void setId_config(Integer id_config) {
		this.id_config = id_config;
	}
	
	public String getMain_posicion() {
		return main_posicion;
	}
	public void setMain_posicion(String main_posicion) {
		this.main_posicion = main_posicion;
	}
	public Integer getPosicion() {
		return posicion;
	}
	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}
	
	public Integer getId_componente() {
		return id_componente;
	}
	public void setId_componente(Integer id_componente) {
		this.id_componente = id_componente;
	}

	public String getNombre_submenu() {
		return nombre_submenu;
	}
	public void setNombre_submenu(String nombre_submenu) {
		this.nombre_submenu = nombre_submenu;
	}
	
	public Integer getId_menu() {
		return id_menu;
	}
	public void setId_menu(Integer id_menu) {
		this.id_menu = id_menu;
	}
	public String getComponente_class() {
		return componente_class;
	}

	public void setComponente_class(String componente_class) {
		this.componente_class = componente_class;
	}
	
	public String getNombreCortoMenu() {
		return nombreCortoMenu;
	}
	public void setNombreCortoMenu(String nombreCortoMenu) {
		this.nombreCortoMenu = nombreCortoMenu;
	}

	public String getNombreCortoComponente() {
		return nombreCortoComponente;
	}

	public void setNombreCortoComponente(String nombreCortoComponente) {
		this.nombreCortoComponente = nombreCortoComponente;
	}

	public String getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}




	

}
