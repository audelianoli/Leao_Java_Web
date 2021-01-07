/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.dao;

import br.edu.unifei.pco203.modelo.Habitat;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author AudelianoLi
 */
public class HabitatDao extends 
        GenericoDao<Habitat, String>{

    public HabitatDao(EntityManager em) {
        super(em);
    } 
    public List<String> findAllContinentes(){
        return em.createQuery(
                "select h.continente from Habitat h"
            ).getResultList();
    }
}
