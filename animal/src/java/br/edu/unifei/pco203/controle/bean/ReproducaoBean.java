/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.bean;

import br.edu.unifei.pco203.controle.dao.FonteDados;
import br.edu.unifei.pco203.controle.dao.HabitatDao;
import br.edu.unifei.pco203.controle.dao.LeaoDao;
import br.edu.unifei.pco203.controle.dao.ReproducaoDao;
import br.edu.unifei.pco203.modelo.Habitat;
import br.edu.unifei.pco203.modelo.Leao;
import br.edu.unifei.pco203.modelo.Reproducao;
import java.util.List;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;

/**
 *
 * @author AudelianoLi
 */
@ManagedBean
@ViewScoped
public class ReproducaoBean {
    private final EntityManager em = FonteDados.createEntityManager();
    private final ReproducaoDao repdao = new ReproducaoDao(em);
    private final LeaoDao leaodao = new LeaoDao(em);
    private Reproducao rep = new Reproducao();
    private final List<Leao> leoes = leaodao.findAll();
    private List<String> listaSexos = repdao.findAllSexos();
    private List<String> listaNomes = leaodao.findAllNomes();
    private String msgChave;
    private String sexoM;
    private String sexoF;
    private String nomeM;
    private String nomeF;
    private Leao leaoM;
    private Leao leaoF;

    private boolean habilitaChave = false;
    private boolean habilitaEdicao = false;
    
    public String create(){
        if (sexoM!= null && sexoF!= null){
            leaoM = leaodao.find("Macho");
            leaoF = leaodao.find("Femea");
            
            Random r = new Random();
            Leao filhote = new Leao();
            filhote.setNome("Simba"+r);
            filhote.setSexo("Macho");
            filhote.setIdade(1);
        }
        return "/index";
        
    }
    
    

    
       
    
    

    public Reproducao getRep() {
        return rep;
    }

    public void setRep(Reproducao rep) {
        this.rep = rep;
    }

    public List<String> getListaReproducao() {
        return listaSexos;
    }

    public void setListaReproducao(List<String> listaReproducao) {
        this.listaSexos = listaReproducao;
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

    public String getSexoM() {
        return sexoM;
    }

    public void setSexoM(String sexoM) {
        this.sexoM = sexoM;
    }

    public String getSexoF() {
        return sexoF;
    }

    public void setSexoF(String sexoF) {
        this.sexoF = sexoF;
    }

    public String getNomeM() {
        return nomeM;
    }

    public void setNomeM(String nomeM) {
        this.nomeM = nomeM;
    }

    public String getNomeF() {
        return nomeF;
    }

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    public Leao getLeaoM() {
        return leaoM;
    }

    public void setLeaoM(Leao leaoM) {
        this.leaoM = leaoM;
    }

    public Leao getLeaoF() {
        return leaoF;
    }

    public void setLeaoF(Leao leaoF) {
        this.leaoF = leaoF;
    }
    
}
