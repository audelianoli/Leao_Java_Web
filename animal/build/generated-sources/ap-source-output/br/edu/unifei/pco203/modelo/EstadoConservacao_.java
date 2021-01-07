package br.edu.unifei.pco203.modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EstadoConservacao.class)
public abstract class EstadoConservacao_ extends br.edu.unifei.pco203.modelo.Subespecie_ {

	public static volatile SingularAttribute<EstadoConservacao, String> classificacao;
	public static volatile SingularAttribute<EstadoConservacao, String> regiao;
	public static volatile SingularAttribute<EstadoConservacao, Float> estimativaPopulacional;
	public static volatile SingularAttribute<EstadoConservacao, Integer> decada;
	public static volatile SingularAttribute<EstadoConservacao, Float> taxaDeQueda;

}

