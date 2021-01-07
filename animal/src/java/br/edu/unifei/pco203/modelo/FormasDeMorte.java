package br.edu.unifei.pco203.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FormasDeMorte {
        @Id
        @GeneratedValue
        private int code;
	private Boolean estrangulamento;
	private Boolean asfixia;
	private Boolean golpePata;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
	
	
	public Boolean getEstrangulamento() {
		return estrangulamento;
	}
	public void setEstrangulamento(Boolean estrangulamento) {
		this.estrangulamento = estrangulamento;
	}
	public Boolean getAsfixia() {
		return asfixia;
	}
	public void setAsfixia(Boolean asfixia) {
		this.asfixia = asfixia;
	}
	public Boolean getGolpePata() {
		return golpePata;
	}
	public void setGolpePata(Boolean golpePata) {
		this.golpePata = golpePata;
	}
	
	

}
