package br.com.utfpr.wellington.modelo.vo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Comidas.class)
public abstract class Comidas_ {

	public static volatile SingularAttribute<Comidas, Float> preco;
	public static volatile SingularAttribute<Comidas, String> tipo;
	public static volatile ListAttribute<Comidas, String> ingredientes;
	public static volatile SingularAttribute<Comidas, String> nome;
	public static volatile SingularAttribute<Comidas, Integer> id;

	public static final String PRECO = "preco";
	public static final String TIPO = "tipo";
	public static final String INGREDIENTES = "ingredientes";
	public static final String NOME = "nome";
	public static final String ID = "id";

}

