/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.vo;

import java.io.Serializable;
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
@Table(name = "tb_oredemPedido")
public class OrdemPedido implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "op_qtd", nullable = false)
    private Integer qtd;
    
    @ManyToOne
    @JoinColumn(name = "ped_codigo")
    private Pedido pedido;
    
    @ManyToOne
    @JoinColumn(name = "com_codigo")
    private Comidas comidas;
    
    @ManyToOne
    @JoinColumn(name = "est_codigo")
    private Estoque estoque;
}