/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.vo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ferre
 */
@Entity
@Table(name = "tb_mesa")
public class Mesa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "mes_numero", nullable = false)
    private Integer numeroMesa;

    @Column(name = "mes_qtdPessoas", length = 45, nullable = false)
    private Integer qtdPessoas;
}
