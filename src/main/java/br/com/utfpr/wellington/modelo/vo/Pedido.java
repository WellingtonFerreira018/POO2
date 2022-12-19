/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.vo;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name = "tb_pedido")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ped_codigo", nullable = false)
    private Integer id;

    @Column(name = "ped_dataEntrada", length = 45, nullable = false)
    private String dataEntrada;

    @Column(name = "ped_dataSaida", length = 45)
    private String dataSaida;
    
    @Column(name = "ped_pagamento", length = 45)
    private Integer pagamento;
    
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "usu_codigo")
    private Usuario ususario;
    
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "mes_numero")
    private Mesa mesa;
    
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "tip_codigo")
    private TipoPagamento tipoPagamento;
    
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "loc_codigo")
    private LocalServico localServico;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Integer getPagamento() {
        return pagamento;
    }

    public void setPagamento(Integer pagamento) {
        this.pagamento = pagamento;
    }
    
    public Usuario getUsusario() {
        return ususario;
    }

    public void setUsusario(Usuario ususario) {
        this.ususario = ususario;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public LocalServico getLocalServico() {
        return localServico;
    }

    public void setLocalServico(LocalServico localServico) {
        this.localServico = localServico;
    }
    
    
}
