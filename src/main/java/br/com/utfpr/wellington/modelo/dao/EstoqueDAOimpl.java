/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao;

import br.com.utfpr.wellington.modelo.vo.Bebidas;
import br.com.utfpr.wellington.modelo.vo.Estoque;
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
public class EstoqueDAOimpl implements EstoqueDAO {

    EntityManager conexao;

    public EstoqueDAOimpl() {
        conexao = ConexaoBanco.getInstance();
    }

    @Override
    public void Cadastrar(Estoque estoque) {
        conexao.getTransaction().begin();
        conexao.persist(estoque);
        conexao.getTransaction().commit();
    }

    @Override
    public void Atualizar(Estoque estoque) {
        conexao.getTransaction().begin();
        conexao.merge(estoque);
        conexao.getTransaction().commit();
    }

    @Override
    public void Excluir(Estoque estoque) {
        conexao.getTransaction().begin();
        conexao.remove(estoque);
        conexao.getTransaction().commit();
    }

    @Override
    public List<Estoque> listarTodos() {
        List<Estoque> estoque;

        CriteriaBuilder cb = conexao.getCriteriaBuilder();
        CriteriaQuery<Estoque> cq = cb.createQuery(Estoque.class);

        Root<Estoque> root = cq.from(Estoque.class);
        cq.select(root);

        TypedQuery<Estoque> query = conexao.createQuery(cq);
        estoque = query.getResultList();

        return estoque;
    }

    @Override
    public List<Estoque> listarTipo(String tipo) {
        List<Estoque> estoque;

        CriteriaBuilder cb = conexao.getCriteriaBuilder();
        CriteriaQuery<Estoque> cq = cb.createQuery(Estoque.class);

        Root<Estoque> root = cq.from(Estoque.class);
        cq.select(root);

        Predicate predicate = cb.equal(root.get("tipo"), tipo);
        cq.where(predicate);

        TypedQuery<Estoque> query = conexao.createQuery(cq);
        estoque = query.getResultList();

        return estoque;
    }
}
