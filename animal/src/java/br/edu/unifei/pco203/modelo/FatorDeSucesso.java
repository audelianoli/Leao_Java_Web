package br.edu.unifei.pco203.modelo;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class FatorDeSucesso {
        @Id
        @GeneratedValue
        private int code;
	private float abundanciaPresa;
	private float tamanhoPresa;
	private float defesaPresa;
	private float taticaAntiPredacao;
	private String coberturaVegetal;
	@Temporal(TemporalType.TIMESTAMP)
        private Date horaDoDia;
	private String aspectoTerreno;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
	
	
	
	public float getAbundanciaPresa() {
		return abundanciaPresa;
	}
	public void setAbundanciaPresa(float abundanciaPresa) {
		this.abundanciaPresa = abundanciaPresa;
	}
	public float getTamanhoPresa() {
		return tamanhoPresa;
	}
	public void setTamanhoPresa(float tamanhoPresa) {
		this.tamanhoPresa = tamanhoPresa;
	}
	public float getDefesaPresa() {
		return defesaPresa;
	}
	public void setDefesaPresa(float defesaPresa) {
		this.defesaPresa = defesaPresa;
	}
	public float getTaticaAntiPredacao() {
		return taticaAntiPredacao;
	}
	public void setTaticaAntiPredacao(float taticaAntiPredacao) {
		this.taticaAntiPredacao = taticaAntiPredacao;
	}
	public String getCoberturaVegetal() {
		return coberturaVegetal;
	}
	public void setCoberturaVegetal(String coberturaVegetal) {
		this.coberturaVegetal = coberturaVegetal;
	}
	public Date getHoraDoDia() {
		return horaDoDia;
	}
	public void setHoraDoDia(Date horaDoDia) {
		this.horaDoDia = horaDoDia;
	}
	public String getAspectoTerreno() {
		return aspectoTerreno;
	}
	public void setAspectoTerreno(String aspectoTerreno) {
		this.aspectoTerreno = aspectoTerreno;
	}
	
	
	

}
