/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.rm;

import br.com.utfpr.wellington.modelo.dao.ConexaoBanco;
import javax.persistence.EntityManager;

/**
 *
 * @author ferre
 */
public class Programa {
    public static void main(String[] args) {
        
        
        EntityManager conexao = ConexaoBanco.getInstance();
        
        
        System.out.println("Pronto!");
 
    }
}
