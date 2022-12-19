package br.com.utfpr.wellington.modelo.vo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Estoque.class)
public abstract class Estoque_ {

	public static volatile SingularAttribute<Estoque, Integer> qtdTotal;
	public static volatile SingularAttribute<Estoque, Float> valorLote;
	public static volatile SingularAttribute<Estoque, Integer> id;
	public static volatile SingularAttribute<Estoque, Bebidas> bebidas;
	public static volatile SingularAttribute<Estoque, String> dataCompra;

	public static final String QTD_TOTAL = "qtdTotal";
	public static final String VALOR_LOTE = "valorLote";
	public static final String ID = "id";
	public static final String BEBIDAS = "bebidas";
	public static final String DATA_COMPRA = "dataCompra";

}

