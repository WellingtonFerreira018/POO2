/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.vo;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ferre
 */
@Entity
@Table(name = "tb_pessoa")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "pes_cpf", length = 12, nullable = false)
    private Integer cpf;

    @Column(name = "pes_nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "pes_dtNasc", length = 45, nullable = false)
    private Date dataNascimento;

    @Column(name = "pes_telefone", length = 15, nullable = false)
    private String telefone;
    
    @Column(name = "pes_sexo", length = 45, nullable = false)
    private String sexo;
    
    @ManyToOne
    @JoinColumn(name = "end_codigo")
    private Endereco endereco;
    
    @ManyToOne
    @JoinColumn(name = "fun_codigo")
    private Funcionario funcionario;
}
