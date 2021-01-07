/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.dao;

import br.edu.unifei.pco203.modelo.Leao;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author AudelianoLi
 */
public class LeaoDao extends GenericoDao<Leao, String>{

    public LeaoDao(EntityManager em) {
        super(em);
    } 
    
    public List<String> findAllNomes(){
        return em.createQuery(
                "select l.nome from Leao l"
            ).getResultList();
    }
    
    public List<String> findAllSexos(){
        return em.createQuery(
                "select l.sexo from Leao l"
            ).getResultList();
    }
   
}
