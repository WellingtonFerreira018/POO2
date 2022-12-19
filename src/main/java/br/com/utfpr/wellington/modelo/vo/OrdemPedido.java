/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.vo;

import java.io.Serializable;
import javax.persistence.CascadeType;
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
@Table(name = "tb_oredemPedido")
public class OrdemPedido implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "op_codigo", nullable = false)
    private Integer id;
     
    @Column(name = "op_qtd", nullable = false)
    private Integer qtd;
    
    @Column(name = "op_status", nullable = false)
    private Integer status;
    
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "ped_codigo")
    private Pedido pedido;
    
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "com_codigo")
    private Comidas comidas;
    
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "est_codigo")
    private Estoque estoque;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Comidas getComidas() {
        return comidas;
    }

    public void setComidas(Comidas comidas) {
        this.comidas = comidas;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
    
    
}