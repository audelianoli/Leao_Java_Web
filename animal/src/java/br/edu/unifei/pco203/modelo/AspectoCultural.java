package br.edu.unifei.pco203.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
@Entity
public class AspectoCultural {
        @Id
        @GeneratedValue
        private int code;
	private float datacao;
	private String regiao;
	private String religiao;
	private String cultura;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
	
	
	
	public float getDatacao() {
		return datacao;
	}
	public void setDatacao(float datacao) {
		this.datacao = datacao;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getReligiao() {
		return religiao;
	}
	public void setReligiao(String religiao) {
		this.religiao = religiao;
	}
	public String getCultura() {
		return cultura;
	}
	public void setCultura(String cultura) {
		this.cultura = cultura;
	}

}
