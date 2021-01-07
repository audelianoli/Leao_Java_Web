package br.edu.unifei.pco203.modelo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "EstadoConservacao")
public class EstadoConservacao extends Subespecie {
	private String classificacao;
	private String regiao;
	private float taxaDeQueda;
	private float estimativaPopulacional;
	private int decada;
	
	
	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public float getTaxaDeQueda() {
		return taxaDeQueda;
	}

	public void setTaxaDeQueda(float taxaDeQueda) {
		this.taxaDeQueda = taxaDeQueda;
	}

	public float getEstimativaPopulacional() {
		return estimativaPopulacional;
	}

	public void setEstimativaPopulacional(float estimativaPopulacional) {
		this.estimativaPopulacional = estimativaPopulacional;
	}

	public int getDecada() {
		return decada;
	}

	public void setDecada(int decada) {
		this.decada = decada;
	}

}
