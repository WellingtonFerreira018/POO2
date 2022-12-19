package br.com.utfpr.wellington.modelo.vo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Funcionario.class)
public abstract class Funcionario_ {

	public static volatile SingularAttribute<Funcionario, Float> salario;
	public static volatile SingularAttribute<Funcionario, Integer> id;
	public static volatile SingularAttribute<Funcionario, String> dataAdmissao;
	public static volatile SingularAttribute<Funcionario, Cargo> cargo;

	public static final String SALARIO = "salario";
	public static final String ID = "id";
	public static final String DATA_ADMISSAO = "dataAdmissao";
	public static final String CARGO = "cargo";

}

