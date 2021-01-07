package br.edu.unifei.pco203.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Bando.class)
public abstract class Bando_ {

	public static volatile SingularAttribute<Bando, Comunicacao> comunicacao;
	public static volatile ListAttribute<Bando, Leao> leao;
	public static volatile SingularAttribute<Bando, FormasDeMorte> formasDeMorte;
	public static volatile SingularAttribute<Bando, Integer> horasRepouso;
	public static volatile SingularAttribute<Bando, Float> indiceSucessoCaca;
	public static volatile SingularAttribute<Bando, Integer> quantidade;
	public static volatile SingularAttribute<Bando, FatorDeSucesso> fatorDeSucesso;

}

