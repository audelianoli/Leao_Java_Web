/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.bean;

import br.edu.unifei.pco203.controle.dao.FonteDados;
import br.edu.unifei.pco203.controle.dao.LeaoDao;
import br.edu.unifei.pco203.modelo.Leao;
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
public class LeaoBean {
    private final EntityManager em = FonteDados.createEntityManager();
    private final LeaoDao leaodao = new LeaoDao(em);
    private Leao leao = new Leao();
    private List<String> listaNomes = leaodao.findAllNomes();
    private String msgChave;
    private String nome;

    private boolean habilitaChave = false;
    private boolean habilitaEdicao = false;
    
    private List<String> sexo;  
 
     
    @PostConstruct
    public void sexo() {
        sexo = new ArrayList<String>();
        sexo.add("Macho");
        sexo.add("Femea");
    }

    public String inserir() {
        try {
            leaodao.create(leao);
            msgChave = null;
        } catch (EntityExistsException e) {
            msgChave = "chave duplicada";
            return "";
        }
        return "/index";
    }

    public String buscar() {
        if (nome != null) {
            leao = leaodao.find(nome);
        }
        return "";
    }
        
    public String alterar() {
        leaodao.update(leao);
        return "/index";
    }
    
    public String excluir() {
        leaodao.removeEntity(leao);
        return "/index";
    }

    public Leao getLeao() {
        return leao;
    }

    public void setLeao(Leao leao) {
        this.leao = leao;
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

    public List<String> getListaNomes() {
        return listaNomes;
    }

    public void setListaNomes(List<String> listaNomes) {
        this.listaNomes = listaNomes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getSexo() {
        return sexo;
    }

    public void setSexo(List<String> sexo) {
        this.sexo = sexo;
    }
    
    
}
