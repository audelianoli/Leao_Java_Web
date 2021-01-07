package br.edu.unifei.pco203.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Habitat {
        @Id
	private String continente;
	private String bioma;

	
	public String getBioma() {
		return bioma;
	}
	public void setBioma(String bioma) {
		this.bioma = bioma;
	}
	public String getContinente() {
		return continente;
	}
	public void setContinente(String continente) {
		this.continente = continente;
	}

}
