/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao;

import br.com.utfpr.wellington.modelo.vo.Usuario;
import javax.persistence.EntityManager;

/**
 *
 * @author ferre
 */
public class UsuarioDAO implements IUser {

    EntityManager conexao;

    
    public UsuarioDAO() {
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
        conexao.persist(usuario);
        conexao.getTransaction().commit();
    }
    
    @Override
    public void Excluir(Usuario usuario) {
        conexao.getTransaction().begin();
        conexao.remove(usuario);
        conexao.getTransaction().commit();
    }
    
}
