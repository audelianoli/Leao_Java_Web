/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.dao;

import br.edu.unifei.pco203.modelo.Dieta;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author AudelianoLi
 */
public class DietaDao extends GenericoDao<Dieta, String>{

    public DietaDao(EntityManager em) {
        super(em);
    }   
    
    public List<String> findAllUngulados() {
        return em.createQuery(
                "select d.ungulado from Dieta d"
        ).getResultList();
    }
    
    public List<String> findAllHumanos() {
        return em.createQuery(
                "select d.humano from Dieta d"
        ).getResultList();
    }
    
    public List<String> findAllLentos(int velocidade){
        return em.createQuery(
                "select d.ungulado from Dieta d "
              + "where d.velocidadeMaxima <= "+velocidade
        ).getResultList();
    }
    
    public List<String> findAllRapidos(int velocidade){
        return em.createQuery(
                "select d.ungulado from Dieta d "
              + "where d.velocidadeMaxima > "+velocidade
        ).getResultList();
    }
}
