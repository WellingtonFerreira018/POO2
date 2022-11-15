/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.vo;

import java.io.Serializable;
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
@Table(name = "tb_endereco")
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "end_codigo", nullable = false)
    private Integer id;

    @Column(name = "end_nomeRua", length = 45, nullable = false)
    private String nomeRua;

    @Column(name = "end_numero", length = 45, nullable = false)
    private String numero;

    @Column(name = "end_bairro", length = 45, nullable = false)
    private String bairro;
    
    @Column(name = "end_complemento", length = 45, nullable = false)
    private String complemento;
    
    @Column(name = "end_cep", length = 45, nullable = false)
    private Integer cep;
    
    @Column(name = "end_cidade", length = 45, nullable = false)
    private String cidade;
    
    @Column(name = "end_estado", length = 45, nullable = false)
    private String estado;
    
    @Column(name = "end_pais", length = 45, nullable = false)
    private String pais;
}
