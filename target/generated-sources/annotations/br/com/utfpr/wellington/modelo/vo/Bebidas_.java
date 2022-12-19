package br.com.utfpr.wellington.modelo.vo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Bebidas.class)
public abstract class Bebidas_ {

	public static volatile SingularAttribute<Bebidas, Float> preco;
	public static volatile SingularAttribute<Bebidas, String> tipo;
	public static volatile SingularAttribute<Bebidas, String> nome;
	public static volatile SingularAttribute<Bebidas, Integer> id;
	public static volatile SingularAttribute<Bebidas, String> validade;

	public static final String PRECO = "preco";
	public static final String TIPO = "tipo";
	public static final String NOME = "nome";
	public static final String ID = "id";
	public static final String VALIDADE = "validade";

}

