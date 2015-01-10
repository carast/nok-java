package mx.com.nok.requisicion.model.dto;

import java.io.Serializable;

public class RequisicionDetalleDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String folioReq;
	private int numArticulo;
	private int cantidad;
	private String  idArticulo;
	
	
	public String  toString(){
		

		 return  "\n[folioReq "+ folioReq +
				"\n numArticulo " + numArticulo +
				"\n cantidad " + cantidad +
				"\n idArticulo " + idArticulo + "]";
		
	}
	
	
	public String getFolioReq() {
		return folioReq;
	}
	public void setFolioReq(String folioReq) {
		this.folioReq = folioReq;
	}
	public int getNumArticulo() {
		return numArticulo;
	}
	public void setNumArticulo(int numArticulo) {
		this.numArticulo = numArticulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(String idArticulo) {
		this.idArticulo = idArticulo;
	} 

}
