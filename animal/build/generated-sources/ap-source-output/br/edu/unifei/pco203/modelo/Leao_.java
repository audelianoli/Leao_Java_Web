package br.edu.unifei.pco203.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Leao.class)
public abstract class Leao_ extends br.edu.unifei.pco203.modelo.Animal_ {

	public static volatile SingularAttribute<Leao, Integer> idade;
	public static volatile SingularAttribute<Leao, AspectoCultural> aspectoCultural;
	public static volatile SingularAttribute<Leao, Boolean> dominante;
	public static volatile SingularAttribute<Leao, Subespecie> subespecie;
	public static volatile SingularAttribute<Leao, Bando> bando;
	public static volatile SingularAttribute<Leao, Reproducao> reproducao;
	public static volatile SingularAttribute<Leao, String> nome;
	public static volatile SingularAttribute<Leao, Boolean> leucismo;
	public static volatile SingularAttribute<Leao, String> sexo;
	public static volatile ListAttribute<Leao, Dieta> dieta;

}

