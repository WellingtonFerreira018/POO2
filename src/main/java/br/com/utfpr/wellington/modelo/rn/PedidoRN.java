/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.rn;

import br.com.utfpr.wellington.modelo.dao.PedidoDAO;
import br.com.utfpr.wellington.modelo.dao.PedidoDAOimpl;
import br.com.utfpr.wellington.modelo.vo.Pedido;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author ferre
 */
public class PedidoRN {
    
    private PedidoDAO pedidoDao;
    
    public PedidoRN(){
        pedidoDao = new PedidoDAOimpl();
    }
    
    public void salvar(Pedido pedido) {
        
        try {
            pedidoDao.Cadastrar(pedido);
        } catch (HibernateException e) {
            System.err.println(e);
        }
    }
    
    public List<Pedido> listarPedidos() {
        return this.pedidoDao.listarTodos();
    }
}
