/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.dao;

import br.edu.unifei.pco203.modelo.Comunicacao;
import javax.persistence.EntityManager;

/**
 *
 * @author AudelianoLi
 */
public class ComunicacaoDao extends GenericoDao<Comunicacao, String>{

    public ComunicacaoDao(EntityManager em) {
        super(em);
    }   
    
}
