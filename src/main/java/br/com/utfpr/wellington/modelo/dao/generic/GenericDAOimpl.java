/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao.generic;

import br.com.utfpr.wellington.modelo.dao.ConexaoBanco;
import javax.persistence.EntityManager;

/**
 *
 * @author ferre
 */
public abstract class GenericDAOimpl<T> implements GenericDAO<T> {
    
    EntityManager conexao;
    
    public GenericDAOimpl(){
        conexao = ConexaoBanco.getInstance();
    }
    
    @Override
    public void Cadastrar(T object) {
        conexao.getTransaction().begin();
        conexao.persist(object);
        conexao.getTransaction().commit();
    }
}
