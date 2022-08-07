package cl.falabella.sge.aslplus.sge.entity;

import java.beans.JavaBean;
import java.io.Serializable;

@JavaBean
public class Ocenc implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public Long numOC;
	public String negocio;
	public String canal;
	
	public Ocenc() {
		
	}
	
	
	public String getNegocio() {
		return negocio;
	}

	public void setNegocio(String negocio) {
		this.negocio = negocio;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}


	public Long getNumOC() {
		return numOC;
	}

	public void setNumOC(Long numOC) {
		this.numOC = numOC;
	}
	
	
	
	
}
