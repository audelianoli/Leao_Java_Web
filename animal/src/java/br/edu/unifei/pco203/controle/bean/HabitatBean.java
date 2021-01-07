/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.bean;

import br.edu.unifei.pco203.controle.dao.FonteDados;
import br.edu.unifei.pco203.controle.dao.HabitatDao;
import br.edu.unifei.pco203.modelo.Habitat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class HabitatBean {
    private final EntityManager em = FonteDados.createEntityManager();
    private final HabitatDao habdao = new HabitatDao(em);
    private Habitat hab = new Habitat();
    private List<String> listaContinentes = habdao.findAllContinentes();
    private String msgChave;
    private String continente;
    private String bioma;

    private boolean habilitaChave = false;
    private boolean habilitaEdicao = false;

    private Map<String,Map<String,String>> data = new HashMap<String, Map<String,String>>();
    private Map<String,String> continentes;
    private Map<String,String> biomas;
     
    @PostConstruct
    public void init() {
        continentes  = new HashMap<String, String>();
        continentes.put("Ásia", "Ásia");
        continentes.put("África", "África");
        continentes.put("Europa", "Europa");
         
        Map<String,String> map = new HashMap<String, String>();
        map.put("Pradaria", "Pradaria");
        map.put("Tundra", "Tundra");
        map.put("Vegetação de Montanha", "Vegetação de Montanha");
        data.put("Ásia", map);
         
        map = new HashMap<String, String>();
        map.put("Savana", "Savana");
        map.put("Deserto", "Deserto");
        map.put("Floresta Tropical", "Floresta Tropical");
        data.put("África", map);
         
        map = new HashMap<String, String>();
        map.put("Tundra", "Tundra");
        map.put("Floresta Temperada", "Floresta Temperada");
        map.put("Floresta de Coníferas", "Floresta de Coníferas");
        data.put("Europa", map);
    }
    
    public void onCountryChange() {
        if(continente !=null && !continente.equals("")){
            biomas = data.get(continente);
            //como converter Map<String,String> para String?
        }
        else
            biomas = new HashMap<String, String>();
    }

    public String inserir() {
        try {
            habdao.create(hab);
            msgChave = null;
        } catch (EntityExistsException e) {
            msgChave = "chave duplicada";
            return "";
        }
        return "/index";
    }
    
    public String inserirOutro() {
       try {
            habdao.create(hab);
            msgChave = null;
        } catch (EntityExistsException e) {
            msgChave = "chave duplicada";
            return "";
        }
        return "";
    }

        public String buscar() {
        if (continente != null) {
            hab = habdao.find(continente);
        }
        return "";
    }
        
    public String alterar() {
        habdao.update(hab);
        return "/index";
    }
    
    public String excluir() {
        habdao.removeEntity(hab);
        return "/index";
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
    
    public Habitat getHab() {
        return hab;
    }

    public void setHab(Habitat hab) {
        this.hab = hab;
    }

    public String getMsgChave() {
        return msgChave;
    }

    public void setMsgChave(String msgChave) {
        this.msgChave = msgChave;
    }

    public List<String> getListaContinentes() {
        return listaContinentes;
    }

    public void setListaContinentes(List<String> listaContinentes) {
        this.listaContinentes = listaContinentes;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getBioma() {
        return bioma;
    }

    public void setBioma(String bioma) {
        this.bioma = bioma;
    }

    public Map<String, Map<String, String>> getData() {
        return data;
    }

    public void setData(Map<String, Map<String, String>> data) {
        this.data = data;
    }

    public Map<String, String> getContinentes() {
        return continentes;
    }

    public void setContinentes(Map<String, String> continentes) {
        this.continentes = continentes;
    }

    public Map<String, String> getBiomas() {
        return biomas;
    }

    public void setBiomas(Map<String, String> biomas) {
        this.biomas = biomas;
    }
    
    
}
