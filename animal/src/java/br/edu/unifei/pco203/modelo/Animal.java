package br.edu.unifei.pco203.modelo;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;


@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipoAnimal", discriminatorType= DiscriminatorType.STRING)
@DiscriminatorValue(value="Animal")
public abstract class Animal {
	
	@Id
        @GeneratedValue
        private int code;
	private Boolean mamifero;
	private float peso;
	private Boolean predador;
	private float velocidadeMaxima;
	private int resistencia;
	@ManyToOne
	private Habitat habitat;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

        
	
	
	public Boolean getMamifero() {
		return mamifero;
	}
	public void setMamifero(Boolean mamifero) {
		this.mamifero = mamifero;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Boolean getPredador() {
		return predador;
	}
	public void setPredador(Boolean predador) {
		this.predador = predador;
	}
	public float getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	public Habitat getHabitat() {
		return habitat;
	}
	public void setHabitat(Habitat habitat) {
		this.habitat = habitat;
	}
	
	

}
