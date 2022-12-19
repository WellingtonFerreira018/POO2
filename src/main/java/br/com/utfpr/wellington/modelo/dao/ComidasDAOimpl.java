/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao;

import br.com.utfpr.wellington.modelo.vo.Comidas;
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
public class ComidasDAOimpl implements ComidasDAO {
    
    EntityManager conexao;
    
    public ComidasDAOimpl(){
        conexao = ConexaoBanco.getInstance();
    }
    
    @Override
    public void Cadastrar(Comidas comidas) {
        conexao.getTransaction().begin();
        conexao.persist(comidas);
        conexao.getTransaction().commit();
    }
    
    @Override
    public void Atualizar(Comidas comidas) {
        conexao.getTransaction().begin();
        conexao.merge(comidas);
        conexao.getTransaction().commit();
    }
    
    @Override
    public void Excluir(Comidas comidas) {
        conexao.getTransaction().begin();
        conexao.remove(comidas);
        conexao.getTransaction().commit();
    }

    @Override
    public List<Comidas> listarTodos() {
        List<Comidas> comidas;
        
        CriteriaBuilder cb = conexao.getCriteriaBuilder();
        CriteriaQuery<Comidas> cq = cb.createQuery(Comidas.class);
        
        Root<Comidas> root = cq.from(Comidas.class);
        cq.select(root);
        
        TypedQuery<Comidas> query = conexao.createQuery(cq);
        comidas = query.getResultList();
        
        return comidas;
    }
    
    @Override
    public List<Comidas> listarTipo(String tipo){
        List<Comidas> comidas;
        
        CriteriaBuilder cb = conexao.getCriteriaBuilder();
        CriteriaQuery<Comidas> cq = cb.createQuery(Comidas.class);
        
        Root<Comidas> root = cq.from(Comidas.class);
        cq.select(root);
        
        Predicate predicate = cb.equal(root.get("tipo"), tipo);
        cq.where(predicate);
       
        TypedQuery<Comidas> query = conexao.createQuery(cq);
        comidas = query.getResultList();
        
        return comidas;
    }
}
