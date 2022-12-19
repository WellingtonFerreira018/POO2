/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.visao;

import br.com.utfpr.wellington.modelo.dao.generic.GenericDAO;
import br.com.utfpr.wellington.modelo.dao.generic.GenericDAOimpl;
import br.com.utfpr.wellington.modelo.rn.ComidasRN;
import br.com.utfpr.wellington.modelo.vo.Comidas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferre
 */
public class TesteComidas {
    public static void main(String[] args) {
        
        GenericDAO<Comidas> genericDao = new GenericDAOimpl<Comidas>() {};
        
        /*Comidas com = new Comidas();
        com.setNome("Calabresa");
        com.setPreco((float) 50.00);
        com.setTipo("Pizza");
        
        List<String> ingredientes = new ArrayList<>();
        ingredientes.add("Queijo");
        ingredientes.add("Calabresa");
        com.setIngredientes(ingredientes);
                
        
        genericDao.Cadastrar(com);
        */
        ComidasRN comidasRN = new ComidasRN();
        
        List<Comidas> comidas = comidasRN.listarComidas();
        
        System.out.println("LISTAR TODOS");
        
        for (Comidas comida : comidas) {
            System.out.println("Nome:"+comida.getNome());
            System.err.println("Ingredientes:"+comida.getIngredientes());
            System.out.println("Preco:"+comida.getPreco());
        }
        
        
        System.out.println("LISTAR POR TIPO");

        List<Comidas> comidasTipo = comidasRN.listarTipo("Pizza");
  
        for (Comidas comida : comidasTipo) {
            System.out.println("Nome:"+comida.getNome());
            System.err.println("Ingredientes:"+comida.getIngredientes());
            System.out.println("Preco:"+comida.getPreco());
        }
    }
}
