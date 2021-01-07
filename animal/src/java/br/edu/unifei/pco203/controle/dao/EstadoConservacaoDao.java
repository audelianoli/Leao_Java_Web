/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.dao;

import br.edu.unifei.pco203.modelo.EstadoConservacao;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author AudelianoLi
 */
public class EstadoConservacaoDao extends GenericoDao<EstadoConservacao, String>{

    public EstadoConservacaoDao(EntityManager em) {
        super(em);
    }   
    
    public List<String> findAllNomesSubespecie(){
        return em.createQuery(
                "select s.nome from Subespecie s"
            ).getResultList();
    }
}
