/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.dao;

import br.edu.unifei.pco203.modelo.Reproducao;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author AudelianoLi
 */
public class ReproducaoDao extends GenericoDao<Reproducao, String>{

    public ReproducaoDao(EntityManager em) {
        super(em);
    } 
    
    public List<String> findAllSexos(){
        return em.createQuery(
                "select r.leao.sexo from Reproducao r"
            ).getResultList();
    }
}