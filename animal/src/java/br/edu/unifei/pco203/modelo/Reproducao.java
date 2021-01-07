package br.edu.unifei.pco203.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reproducao {
        @Id
        @GeneratedValue
        private int code;
	private String clima;
	private float disponibilidadeAlimento;
        
        @OneToOne
	private Leao leao;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
	
	
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public float getDisponibilidadeAlimento() {
		return disponibilidadeAlimento;
	}
	public void setDisponibilidadeAlimento(float disponibilidadeAlimento) {
		this.disponibilidadeAlimento = disponibilidadeAlimento;
	}
	public Leao getLeao() {
		return leao;
	}
	public void setLeao(Leao leao) {
		this.leao = leao;
	}
	
	
	

}
