/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao;

import br.com.utfpr.wellington.modelo.vo.OrdemPedido;
import java.util.List;

/**
 *
 * @author ferre
 */
public interface OrdemPedidoDAO {
    
    void Cadastrar(OrdemPedido ordemPedido);
    
    void Atualizar(OrdemPedido ordemPedido);
    
    void Excluir(OrdemPedido ordemPedido);
    
    List<OrdemPedido> listarTodos();
    
    List<OrdemPedido> statusPedido(Integer status);
    
}
