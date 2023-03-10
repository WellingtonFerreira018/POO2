package br.com.utfpr.wellington.modelo.vo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Endereco.class)
public abstract class Endereco_ {

	public static volatile SingularAttribute<Endereco, String> cidade;
	public static volatile SingularAttribute<Endereco, String> estado;
	public static volatile SingularAttribute<Endereco, String> nomeRua;
	public static volatile SingularAttribute<Endereco, String> complemento;
	public static volatile SingularAttribute<Endereco, String> numero;
	public static volatile SingularAttribute<Endereco, String> bairro;
	public static volatile SingularAttribute<Endereco, Integer> id;
	public static volatile SingularAttribute<Endereco, Integer> cep;
	public static volatile SingularAttribute<Endereco, String> pais;

	public static final String CIDADE = "cidade";
	public static final String ESTADO = "estado";
	public static final String NOME_RUA = "nomeRua";
	public static final String COMPLEMENTO = "complemento";
	public static final String NUMERO = "numero";
	public static final String BAIRRO = "bairro";
	public static final String ID = "id";
	public static final String CEP = "cep";
	public static final String PAIS = "pais";

}

