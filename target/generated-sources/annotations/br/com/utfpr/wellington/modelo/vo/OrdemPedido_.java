package br.com.utfpr.wellington.modelo.vo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrdemPedido.class)
public abstract class OrdemPedido_ {

	public static volatile SingularAttribute<OrdemPedido, Integer> qtd;
	public static volatile SingularAttribute<OrdemPedido, Estoque> estoque;
	public static volatile SingularAttribute<OrdemPedido, Pedido> pedido;
	public static volatile SingularAttribute<OrdemPedido, Comidas> comidas;
	public static volatile SingularAttribute<OrdemPedido, Boolean> status;

	public static final String QTD = "qtd";
	public static final String ESTOQUE = "estoque";
	public static final String PEDIDO = "pedido";
	public static final String COMIDAS = "comidas";
	public static final String STATUS = "status";

}

