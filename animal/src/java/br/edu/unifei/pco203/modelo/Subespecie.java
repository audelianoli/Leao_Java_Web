package br.edu.unifei.pco203.modelo;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipoSubespecie", discriminatorType= DiscriminatorType.STRING)
@DiscriminatorValue(value="Subespecie")
public class Subespecie {
    
    @Id
    private String nome;
    private String juba;
    private float tamanho;
    private String corPelagem;
    private Boolean hibrido;
    @OneToOne
    private Leao leao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getJuba() {
            return juba;
    }
    public void setJuba(String juba) {
            this.juba = juba;
    }
    public float getTamanho() {
            return tamanho;
    }
    public void setTamanho(float tamanho) {
            this.tamanho = tamanho;
    }
    public String getCorPelagem() {
            return corPelagem;
    }
    public void setCorPelagem(String corPelagem) {
            this.corPelagem = corPelagem;
    }
    public Boolean getHibrido() {
            return hibrido;
    }
    public void setHibrido(Boolean hibrido) {
            this.hibrido = hibrido;
    }
    public Leao getLeao() {
            return leao;
    }
    public void setLeao(Leao leao) {
            this.leao = leao;
    }

	

}
