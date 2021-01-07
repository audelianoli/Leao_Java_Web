/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unifei.pco203.controle.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author enzo
 */
public abstract class AbstractDao<T, K> {

    private EntityManager em;
    private String entityName;
    private Class<T> classEntity;

    public AbstractDao(EntityManager em) {
        this.em = em;
        this.classEntity = ((Class<T>)((ParameterizedType)
              this.getClass().getGenericSuperclass())
              .getActualTypeArguments()[0]);
       this.entityName = classEntity.getSimpleName();
    }

    public void create(T obj) {
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
    }

    public void update(T obj) {
        em.getTransaction().begin();
        em.merge(obj);
        em.getTransaction().commit();
    }

    public void delete(K key) {
        T obj = find(key);
        if (obj != null) {
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
        }
    }
    public void deleteObject(T obj) {
        if (obj != null) {
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
        }
    }
    public List<T> findAll() {
        return em.createQuery("from " + entityName)
                .getResultList();
    }
    public T find(K key) {
        return em.find(classEntity, key);
    }
    public List<T> findPage(int max, int first){
        Query q = em.createQuery("from " + entityName);
        q.setMaxResults(max);
        q.setFirstResult(first);
        return q.getResultList();
    }
    public long getCount(){
        return (Long)em.createQuery(
                "select count(*) "
                + "from " + entityName
                ).getSingleResult();
    }

}
