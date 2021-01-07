package br.edu.unifei.pco203.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Dieta")
public class Dieta extends Animal {

	private String ungulado;
	private String humano;
	
	public String getUngulado() {
		return ungulado;
	}
	public void setUngulado(String ungulado) {
		this.ungulado = ungulado;
	}

        public String getHumano() {
            return humano;
        }

        public void setHumano(String humano) {
            this.humano = humano;
        }

	
}
