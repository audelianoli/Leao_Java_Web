package br.edu.unifei.pco203.modelo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Bando {
        @Id

	private int quantidade;
	private float indiceSucessoCaca;
	private int horasRepouso;
        
        @OneToMany
	private List<Leao> leao = new ArrayList<Leao>();
	@OneToOne
	private Comunicacao comunicacao;
        @OneToOne
	private FatorDeSucesso fatorDeSucesso;
        @OneToOne
	private FormasDeMorte formasDeMorte;


	
	
        
	public Comunicacao getComunicacao() {
		return comunicacao;
	}
	public void setComunicacao(Comunicacao comunicacao) {
		this.comunicacao = comunicacao;
	}
	public FatorDeSucesso getFatorDeSucesso() {
		return fatorDeSucesso;
	}
	public void setFatorDeSucesso(FatorDeSucesso fatorDeSucesso) {
		this.fatorDeSucesso = fatorDeSucesso;
	}
	public FormasDeMorte getFormasDeMorte() {
		return formasDeMorte;
	}
	public void setFormasDeMorte(FormasDeMorte formasDeMorte) {
		this.formasDeMorte = formasDeMorte;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getIndiceSucessoCaca() {
		return indiceSucessoCaca;
	}
	public void setIndiceSucessoCaca(float indiceSucessoCaca) {
		this.indiceSucessoCaca = indiceSucessoCaca;
	}
	public int getHorasRepouso() {
		return horasRepouso;
	}
	public void setHorasRepouso(int horasRepouso) {
		this.horasRepouso = horasRepouso;
	}
	public List<Leao> getLeao() {
		return leao;
	}
	public void setLeao(List<Leao> leao) {
		this.leao = leao;
	}
	public int sizeOfLeao() {
        return leao.size();
        }

        public Iterator<Leao> iteratorLeao() {
            return leao.iterator();
        }

        public boolean addLeao(Leao v) {
            return leao.add(v);
        }

        public Leao removeLeao(int idx) {
            return leao.remove(idx);
        }
	
	

}
