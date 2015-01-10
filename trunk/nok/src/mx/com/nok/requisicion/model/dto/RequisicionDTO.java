package mx.com.nok.requisicion.model.dto;

import java.io.Serializable;

public class RequisicionDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String folioReq;
	private String empleadoSolicitante;
	private String empleadoResponsable;
	private String idProveedor;
	private String folioFactura;
	private String fechaReq;
	
	public String  toString(){
		

		 return  "\n[folioReq "+ folioReq +
				"\n empleadoSolicitante " + empleadoSolicitante +
				"\n empleadoResponsable " + empleadoResponsable +
				"\n idProveedor " + idProveedor +
				"\n folioFactura " + folioFactura +
				"\n fechaReq " + fechaReq + "]";
		
	}

	public String getFolioReq() {
		return folioReq;
	}

	public void setFolioReq(String folioReq) {
		this.folioReq = folioReq;
	}

	public String getEmpleadoSolicitante() {
		return empleadoSolicitante;
	}

	public void setEmpleadoSolicitante(String empleadoSolicitante) {
		this.empleadoSolicitante = empleadoSolicitante;
	}

	public String getEmpleadoResponsable() {
		return empleadoResponsable;
	}

	public void setEmpleadoResponsable(String empleadoResponsable) {
		this.empleadoResponsable = empleadoResponsable;
	}

	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getFolioFactura() {
		return folioFactura;
	}

	public void setFolioFactura(String folioFactura) {
		this.folioFactura = folioFactura;
	}

	public String getFechaReq() {
		return fechaReq;
	}

	public void setFechaReq(String fechaReq) {
		this.fechaReq = fechaReq;
	}




}
