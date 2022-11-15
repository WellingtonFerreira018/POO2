/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.HibernateException;

/**
 *
 * @author ferre
 */
public class ConexaoBanco {
    
    private static EntityManagerFactory factory;
    private static EntityManager manager;
    
    public static EntityManager getInstance() {
        
        if (manager == null){
            synchronized (ConexaoBanco.class) {
                if(manager == null){
                    try {
                        factory = Persistence.createEntityManagerFactory("projetofinal");
                        manager = factory.createEntityManager();
                    } catch (HibernateException he) {
                        System.err.println(he.getMessage() + "deu ruim na conexao");
                    }
                }
            }
        }
        return manager;
    }
    
    public static void close() {
        manager.close();
        factory.close();
    }
    
}
