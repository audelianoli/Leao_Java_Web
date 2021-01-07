package br.edu.unifei.pco203.modelo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity 
@DiscriminatorValue(value = "Leao")
public class Leao extends Animal {
	private String nome;
	private Boolean dominante;
	private int idade;
	private Boolean leucismo;
	private String sexo;
        
	@OneToMany
	private List<Dieta> dieta = new ArrayList<Dieta>();
        @OneToOne
	private Subespecie subespecie;
        @OneToOne
	private AspectoCultural aspectoCultural;
        @OneToOne
	private Reproducao reproducao;
        @ManyToOne
	private Bando bando;
		
	
	public AspectoCultural getAspectoCultural() {
		return aspectoCultural;
	}
	public void setAspectoCultural(AspectoCultural aspectoCultural) {
		this.aspectoCultural = aspectoCultural;
	}
	public Reproducao getReproducao() {
		return reproducao;
	}
	public void setReproducao(Reproducao reproducao) {
		this.reproducao = reproducao;
	}
	public Bando getBando() {
		return bando;
	}
	public void setBando(Bando bando) {
		this.bando = bando;
	}
	
	public Boolean getDominante() {
		return dominante;
	}
	public void setDominante(Boolean dominante) {
		this.dominante = dominante;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Boolean getLeucismo() {
		return leucismo;
	}
	public void setLeucismo(Boolean leucismo) {
		this.leucismo = leucismo;
	}
	public Subespecie getSubespecie() {
		return subespecie;
	}
	public void setSubespecie(Subespecie subespecie) {
		this.subespecie = subespecie;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
        public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Dieta> getDieta() {
		return dieta;
	}
	public void setDieta(List<Dieta> dieta) {
		this.dieta = dieta;
	}
	public int sizeOfDieta() {
        return dieta.size();
        }

        public Iterator<Dieta> iteratorDieta() {
            return dieta.iterator();
        }

        public boolean addDieta(Dieta v) {
            return dieta.add(v);
        }

        public Dieta removeDieta(int idx) {
            return dieta.remove(idx);
        }
	

}
