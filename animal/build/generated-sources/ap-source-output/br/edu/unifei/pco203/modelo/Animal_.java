package br.edu.unifei.pco203.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Animal.class)
public abstract class Animal_ {

	public static volatile SingularAttribute<Animal, Habitat> habitat;
	public static volatile SingularAttribute<Animal, Float> velocidadeMaxima;
	public static volatile SingularAttribute<Animal, Integer> resistencia;
	public static volatile SingularAttribute<Animal, Float> peso;
	public static volatile SingularAttribute<Animal, Boolean> predador;
	public static volatile SingularAttribute<Animal, Boolean> mamifero;

}

