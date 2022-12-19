/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao;

import br.com.utfpr.wellington.modelo.vo.Usuario;
import br.com.utfpr.wellington.visao.swing.Cardapio;
import br.com.utfpr.wellington.visao.swing.Gerente;
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
public class UsuarioDAOImpl implements UsuarioDAO {

    EntityManager conexao;

    public UsuarioDAOImpl() {
        conexao = ConexaoBanco.getInstance();
    }

    @Override
    public void Cadastrar(Usuario usuario) {
        conexao.getTransaction().begin();
        conexao.persist(usuario);
        conexao.getTransaction().commit();
    }

    @Override
    public void Atualizar(Usuario usuario) {
        conexao.getTransaction().begin();
        conexao.merge(usuario);
        conexao.getTransaction().commit();
    }

    @Override
    public void Excluir(Usuario usuario) {
        conexao.getTransaction().begin();
        conexao.remove(usuario);
        conexao.getTransaction().commit();
    }

    @Override
    public List<Usuario> listarTodos() {
        List<Usuario> usuarios;

        CriteriaBuilder cb = conexao.getCriteriaBuilder();
        CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);

        Root<Usuario> root = cq.from(Usuario.class);
        cq.select(root);

        TypedQuery<Usuario> query = conexao.createQuery(cq);
        usuarios = query.getResultList();

        return usuarios;
    }

    @Override
    public Usuario listarUm(Integer id) {

        Usuario usuario;

        CriteriaBuilder cb = conexao.getCriteriaBuilder();
        CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);

        Root<Usuario> root = cq.from(Usuario.class);
        cq.select(root);

        Predicate predicate = cb.equal(root.get("id"), id);
        cq.where(predicate);

        TypedQuery<Usuario> query = conexao.createQuery(cq);
        usuario = query.getSingleResult();

        return usuario;
    }

    @Override
    public Usuario login(String user, String password) {

        Usuario usuario = null;

        try {

            CriteriaBuilder cb = conexao.getCriteriaBuilder();
            CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);

            Root<Usuario> root = cq.from(Usuario.class);
            cq.select(root);
            
            Predicate predicate = cb.equal(root.get("nome"), user);
            cq.where(predicate);
            
            Predicate predicates = cb.equal(root.get("senha"), password);
            cq.where(predicates);
            
            TypedQuery<Usuario> query = conexao.createQuery(cq);
            usuario = query.getSingleResult();
            
            System.out.println("br.com.utfpr.wellington.modelo.dao.UsuarioDAOImpl.login()");

        } catch (Exception e) {
            System.out.println("deu ruim aqui!!");
        }

        return usuario;
    }
    
    @Override
    public void funcaoUsuario(Usuario usuario){
        
        if(usuario.getPessoa().getFuncionario().getCargo().getNomeCargo().equals("Gerente")){
            System.out.println("deu certo gerente");
            Gerente gerente = new Gerente();
            gerente.show();
        }
        
    }

}
