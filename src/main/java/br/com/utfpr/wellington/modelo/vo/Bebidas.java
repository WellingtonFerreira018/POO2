/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.vo;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ferre
 */
@Entity
@Table(name = "tb_bebidas")
public class Bebidas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "beb_codigo", nullable = false)
    private Integer id;

    @Column(name = "beb_tipo", length = 45, nullable = false)
    private String tipo;

    @Column(name = "beb_nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "beb_preco", length = 45, nullable = false)
    private float preco;
    
    @Column(name = "beb_validade", length = 45, nullable = false)
    private Date validade;
}

