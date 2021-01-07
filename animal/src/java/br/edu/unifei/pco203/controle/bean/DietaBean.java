/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.bean;

import br.edu.unifei.pco203.controle.dao.DietaDao;
import br.edu.unifei.pco203.controle.dao.FonteDados;
import br.edu.unifei.pco203.modelo.Dieta;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;

/**
 *
 * @author AudelianoLi
 */
    
@ManagedBean
@ViewScoped
public class DietaBean {
    private final EntityManager em = FonteDados.createEntityManager();
    private final DietaDao didao = new DietaDao(em);
    private Dieta di = new Dieta();
    private List<String> listaUngulados = didao.findAllUngulados();
    private String ungulado;
    private String humano;
    private String msgChave;

    private boolean habilitaChave = false;
    private boolean habilitaEdicao = false;
    
    private List<String> ungulados;  
    private List<String> humanos;  
 
     
    @PostConstruct
    public void vitimas() {
        ungulados = new ArrayList<String>();
        ungulados.add("Vaca");
        ungulados.add("Cavalo");
        ungulados.add("Zebra");
        ungulados.add("Gnu");
        ungulados.add("Veado");
        ungulados.add("Girafa");
        
        humanos = new ArrayList<String>();
        humanos.add("Atlético");
        humanos.add("Sedentário");
        humanos.add("Petrificado");
    }
    
    

    public String inserir() {
        try {
            didao.create(di);
            msgChave = null;
        } catch (EntityExistsException e) {
            msgChave = "chave duplicada";
            return "";
        }
        return "/index";
    }
    
        public String inserirOutro() {
        try {
            didao.create(di);
            msgChave = null;
        } catch (EntityExistsException e) {
            msgChave = "chave duplicada";
            return "";
        }
        return "";
    }
        
    public String buscar() {
        if (ungulado != null) {
            di = didao.find(ungulado);
        }
        return "";
    }

    public String alterar() {
        didao.update(di);
        return "/index";
    }
    
    public String excluir() {
        didao.removeEntity(di);
        return "/index";
    }

    public Dieta getDi() {
        return di;
    }

    public void setDi(Dieta di) {
        this.di = di;
    }

    public String getMsgChave() {
        return msgChave;
    }

    public void setMsgChave(String msgChave) {
        this.msgChave = msgChave;
    }

    public boolean isHabilitaChave() {
        return habilitaChave;
    }

    public void setHabilitaChave(boolean habilitaChave) {
        this.habilitaChave = habilitaChave;
    }

    public boolean isHabilitaEdicao() {
        return habilitaEdicao;
    }

    public void setHabilitaEdicao(boolean habilitaEdicao) {
        this.habilitaEdicao = habilitaEdicao;
    }

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

    public List<String> getListaUngulados() {
        return listaUngulados;
    }

    public void setListaUngulados(List<String> listaUngulados) {
        this.listaUngulados = listaUngulados;
    }

    public List<String> getUngulados() {
        return ungulados;
    }

    public void setUngulados(List<String> ungulados) {
        this.ungulados = ungulados;
    }

    public List<String> getHumanos() {
        return humanos;
    }

    public void setHumanos(List<String> humanos) {
        this.humanos = humanos;
    }
    
    

    
}
