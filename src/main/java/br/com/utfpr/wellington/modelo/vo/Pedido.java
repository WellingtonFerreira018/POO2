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
@Table(name = "tb_pedido")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ped_codigo", nullable = false)
    private Integer id;

    @Column(name = "ped_dataEntrada", length = 45, nullable = false)
    private Date dataEntrada;

    @Column(name = "ped_dataSaida", length = 45)
    private Date dataSaida;
    
    @ManyToOne
    @JoinColumn(name = "usu_codigo")
    private Usuario ususario;
    
    @ManyToOne
    @JoinColumn(name = "mes_numero")
    private Mesa mesa;
    
    @ManyToOne
    @JoinColumn(name = "tip_codigo")
    private TipoPagamento tipoPagamento;
    
    @ManyToOne
    @JoinColumn(name = "loc_codigo")
    private LocalServico localServico;
}
