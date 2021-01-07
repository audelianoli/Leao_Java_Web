/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.bean;

import br.edu.unifei.pco203.controle.dao.EstadoConservacaoDao;
import br.edu.unifei.pco203.controle.dao.FonteDados;
import br.edu.unifei.pco203.modelo.EstadoConservacao;
import java.util.List;
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
public class EstadoConservacaoBean {
    private final EntityManager em = FonteDados.createEntityManager();
    private final EstadoConservacaoDao ecdao = new EstadoConservacaoDao(em);
    private EstadoConservacao ec = new EstadoConservacao();
    private List<String> listaNomes = ecdao.findAllNomesSubespecie();
    private String msgChave;
    private String nome;

    private boolean habilitaChave = false;
    private boolean habilitaEdicao = false;
    

    public String inserir() {
        try {
            ecdao.create(ec);
            msgChave = null;
        } catch (EntityExistsException e) {
            msgChave = "chave duplicada";
            return "";
        }
        return "/index";
    }

    public String buscar() {
        if (nome != null) {
            ec = ecdao.find(nome);
        }
        return "";
    }
        
    public String alterar() {
        ecdao.update(ec);
        return "/index";
    }
    
    public String excluir() {
        ecdao.removeEntity(ec);
        return "/index";
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

    public EstadoConservacao getEc() {
        return ec;
    }

    public void setEc(EstadoConservacao ec) {
        this.ec = ec;
    }

   
    
    
}
