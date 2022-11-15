/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.vo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

/**
 *
 * @author ferre
 */
@Entity
@Table(name = "tb_comidas")
public class Comidas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "com_codigo", nullable = false)
    private Integer id;

    @Column(name = "com_tipo", length = 45, nullable = false)
    private String tipo;

    @Column(name = "com_nome", length = 45, nullable = false)
    private String nome;
    
    @Column(name = "com_preco", length = 45, nullable = false)
    private float preco;
    
    @ElementCollection
    @CollectionTable(name = "Ingredientes", joinColumns = @JoinColumn(name = "com_codigo"))
    @Column(name = "com_ingredientes")
    private Collection<String> ingredientes;
 }