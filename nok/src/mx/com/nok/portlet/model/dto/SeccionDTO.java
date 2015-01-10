package mx.com.nok.portlet.model.dto;

import java.io.Serializable;
import java.util.List;

public class SeccionDTO implements Serializable{
	
	
	
	    private static final long serialVersionUID = 1L;	
		private int id_menu;
		private String menu;			
		private String nombreCortoMenu;		
		private List <?> lisPortlet;		
		
		public int getId_menu() {
			return id_menu;
		}
		public void setId_menu(int id_menu) {
			this.id_menu = id_menu;
		}
		public String getMenu() {
			return menu;
		}
		public void setMenu(String menu) {
			this.menu = menu;
		}
		public List<?> getLisPortlet() {
			return lisPortlet;
		}
		public void setLisPortlet(List<?> lisPortlet) {
			this.lisPortlet = lisPortlet;
		}		
	
		public String getNombreCortoMenu() {
			return nombreCortoMenu;
		}
		public void setNombreCortoMenu(String nombreCortoMenu) {
			this.nombreCortoMenu = nombreCortoMenu;
		}
		
		
		
		
		
		
		
		
		
		

}
