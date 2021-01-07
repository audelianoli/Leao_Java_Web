/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



/**
 *
 * @author AudelianoLi
 */
public class FonteDados {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("animalPU");
    
    private FonteDados(){}
    
    public static EntityManager createEntityManager(){
        return emf.createEntityManager();
    }
    
}
