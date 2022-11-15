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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ferre
 */
@Entity
@Table(name = "tb_estoque")
public class Estoque implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "est_codigo", nullable = false)
    private Integer id;

    @Column(name = "est_dataCompra", length = 45, nullable = false)
    private Date dataCompra;

    @Column(name = "est_valorLote", length = 45, nullable = false)
    private float valorLote;

    @Column(name = "est_qtdTotal", length = 45, nullable = false)
    private Integer qtdTotal;
    
    
    @ManyToOne
    @JoinColumn(name = "beb_codigo")
    private Bebidas bebidas;
}

