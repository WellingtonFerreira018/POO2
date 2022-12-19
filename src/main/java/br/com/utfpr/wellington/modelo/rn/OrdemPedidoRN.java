/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.rn;

import br.com.utfpr.wellington.modelo.dao.OrdemPedidoDAO;
import br.com.utfpr.wellington.modelo.dao.OrdemPedidoDAOimpl;
import br.com.utfpr.wellington.modelo.vo.OrdemPedido;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author ferre
 */
public class OrdemPedidoRN {
    
    private OrdemPedidoDAO ordemPedidoDao;
    
    public OrdemPedidoRN(){
        ordemPedidoDao = new OrdemPedidoDAOimpl();
    }
    
    public void salvar(OrdemPedido ordemPedido){
        
        try {
            ordemPedidoDao.Cadastrar(ordemPedido);
        } catch (HibernateException e) {
            System.err.println(e);
        }
    }
    
    public List<OrdemPedido> statusPedido(Integer status){
        return this.ordemPedidoDao.statusPedido(status);
    }
    
    public List<OrdemPedido> listarPedidos() {
        return this.ordemPedidoDao.listarTodos();
    }
}
