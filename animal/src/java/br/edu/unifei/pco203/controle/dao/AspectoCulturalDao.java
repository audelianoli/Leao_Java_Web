/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.dao;

import br.edu.unifei.pco203.modelo.AspectoCultural;
import javax.persistence.EntityManager;

/**
 *
 * @author AudelianoLi
 */
public class AspectoCulturalDao extends GenericoDao<AspectoCultural, String>{

    public AspectoCulturalDao(EntityManager em) {
        super(em);
    }   
    
}
