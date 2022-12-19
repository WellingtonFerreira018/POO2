/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao;

import br.com.utfpr.wellington.modelo.vo.Pedido;
import java.util.List;

/**
 *
 * @author ferre
 */
public interface PedidoDAO {
 
    void Cadastrar(Pedido categoria);
    
    void Atualizar(Pedido usuario);
    
    void Excluir(Pedido usuario);
    
    List<Pedido> listarTodos();
    
    float Pagamento(Integer mesa);
}
