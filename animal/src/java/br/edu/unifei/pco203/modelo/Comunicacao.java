package br.edu.unifei.pco203.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comunicacao {
        @Id
	private String vocalizacao;
	private Boolean aposRetorno;
	private Boolean aposLuta;
	
	public void gestoTatil(){
		
	}
	public void lambedura(){
		
	}
	
	
	
	public String getVocalizacao() {
		return vocalizacao;
	}
	public void setVocalizacao(String vocalizacao) {
		this.vocalizacao = vocalizacao;
	}
	public Boolean getAposRetorno() {
		return aposRetorno;
	}
	public void setAposRetorno(Boolean aposRetorno) {
		this.aposRetorno = aposRetorno;
	}
	public Boolean getAposLuta() {
		return aposLuta;
	}
	public void setAposLuta(Boolean aposLuta) {
		this.aposLuta = aposLuta;
	}

}
