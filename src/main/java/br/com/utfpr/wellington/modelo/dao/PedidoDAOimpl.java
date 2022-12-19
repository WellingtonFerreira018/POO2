/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao;

import br.com.utfpr.wellington.modelo.vo.Estoque;
import br.com.utfpr.wellington.modelo.vo.Pedido;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author ferre
 */
public class PedidoDAOimpl implements PedidoDAO{
    
    EntityManager conexao;
    
    public PedidoDAOimpl(){
        conexao = ConexaoBanco.getInstance();
    }

    @Override
    public void Cadastrar(Pedido pedido){
        conexao.getTransaction().begin();
        conexao.persist(pedido);
        conexao.getTransaction().commit();
    }
    
    @Override
    public void Atualizar(Pedido pedido){
        conexao.getTransaction().begin();
        conexao.merge(pedido);
        conexao.getTransaction().commit();
    }
    
    @Override
    public void Excluir(Pedido pedido){
        conexao.getTransaction().begin();
        conexao.remove(pedido);
        conexao.getTransaction().commit();
    }
    
    @Override
    public List<Pedido> listarTodos() {
        List<Pedido> pedido;

        CriteriaBuilder cb = conexao.getCriteriaBuilder();
        CriteriaQuery<Pedido> cq = cb.createQuery(Pedido.class);

        Root<Pedido> root = cq.from(Pedido.class);
        cq.select(root);

        TypedQuery<Pedido> query = conexao.createQuery(cq);
        pedido = query.getResultList();

        return pedido;
    }
    
    @Override
    public float Pagamento(Integer mesa) {
               
        return 0;                 
    }
}
