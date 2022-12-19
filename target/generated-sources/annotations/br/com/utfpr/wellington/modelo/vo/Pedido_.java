package br.com.utfpr.wellington.modelo.vo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pedido.class)
public abstract class Pedido_ {

	public static volatile SingularAttribute<Pedido, String> dataEntrada;
	public static volatile SingularAttribute<Pedido, Mesa> mesa;
	public static volatile SingularAttribute<Pedido, Integer> id;
	public static volatile SingularAttribute<Pedido, String> dataSaida;
	public static volatile SingularAttribute<Pedido, Usuario> ususario;
	public static volatile SingularAttribute<Pedido, TipoPagamento> tipoPagamento;
	public static volatile SingularAttribute<Pedido, LocalServico> localServico;

	public static final String DATA_ENTRADA = "dataEntrada";
	public static final String MESA = "mesa";
	public static final String ID = "id";
	public static final String DATA_SAIDA = "dataSaida";
	public static final String USUSARIO = "ususario";
	public static final String TIPO_PAGAMENTO = "tipoPagamento";
	public static final String LOCAL_SERVICO = "localServico";

}

