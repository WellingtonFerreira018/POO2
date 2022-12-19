/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao;

import br.com.utfpr.wellington.modelo.vo.Comidas;
import br.com.utfpr.wellington.modelo.vo.OrdemPedido;
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
public class OrdemPedidoDAOimpl implements OrdemPedidoDAO{
    
    EntityManager conexao;
    
    public OrdemPedidoDAOimpl() {
        conexao =  ConexaoBanco.getInstance();
    }
    
    @Override
    public void Cadastrar(OrdemPedido ordemPedido){
        conexao.getTransaction().begin();
        conexao.persist(ordemPedido);
        conexao.getTransaction().commit();
    }

    @Override
    public void Atualizar(OrdemPedido ordemPedido) {
        conexao.getTransaction().begin();
        conexao.merge(ordemPedido);
        conexao.getTransaction().commit();
    }

    @Override
    public void Excluir(OrdemPedido ordemPedido) {
        conexao.getTransaction().begin();
        conexao.remove(ordemPedido);
        conexao.getTransaction().commit();
    }

    @Override
    public List<OrdemPedido> listarTodos() {
        List<OrdemPedido> opedido;

        CriteriaBuilder cb = conexao.getCriteriaBuilder();
        CriteriaQuery<OrdemPedido> cq = cb.createQuery(OrdemPedido.class);

        Root<OrdemPedido> root = cq.from(OrdemPedido.class);
        cq.select(root);

        TypedQuery<OrdemPedido> query = conexao.createQuery(cq);
        opedido = query.getResultList();

        return opedido;
    }
    
    @Override
    public List<OrdemPedido> statusPedido(Integer status) {
        List<OrdemPedido> pedidos;
        
        CriteriaBuilder cb = conexao.getCriteriaBuilder();
        CriteriaQuery<OrdemPedido> cq = cb.createQuery(OrdemPedido.class);
        
        Root<OrdemPedido> root = cq.from(OrdemPedido.class);
        cq.select(root);
        
        if(status == 1){
            //a fazer
            Predicate predicate = cb.equal(root.get("status"), status);
            cq.where(predicate);
       
            TypedQuery<OrdemPedido> query = conexao.createQuery(cq);
            pedidos = query.getResultList();
               
        }else if(status == 0){
            //ja feitos
            Predicate predicate = cb.equal(root.get("status"), status);
            cq.where(predicate);
       
            TypedQuery<OrdemPedido> query = conexao.createQuery(cq);
            pedidos = query.getResultList();
        }else{
            //para entregar
            Predicate predicate = cb.equal(root.get("status"), status);
            cq.where(predicate);
       
            TypedQuery<OrdemPedido> query = conexao.createQuery(cq);
            pedidos = query.getResultList();
        }      
        return pedidos;
    }
}
