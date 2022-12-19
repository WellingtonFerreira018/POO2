package br.com.utfpr.wellington.modelo.vo;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ {

	public static volatile SingularAttribute<Pessoa, String> telefone;
	public static volatile SingularAttribute<Pessoa, Endereco> endereco;
	public static volatile SingularAttribute<Pessoa, Integer> cpf;
	public static volatile SingularAttribute<Pessoa, String> nome;
	public static volatile SingularAttribute<Pessoa, Funcionario> funcionario;
	public static volatile SingularAttribute<Pessoa, String> dataNascimento;
	public static volatile SingularAttribute<Pessoa, String> sexo;

	public static final String TELEFONE = "telefone";
	public static final String ENDERECO = "endereco";
	public static final String CPF = "cpf";
	public static final String NOME = "nome";
	public static final String FUNCIONARIO = "funcionario";
	public static final String DATA_NASCIMENTO = "dataNascimento";
	public static final String SEXO = "sexo";

}

