/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.visao;

import br.com.utfpr.wellington.modelo.dao.generic.GenericDAO;
import br.com.utfpr.wellington.modelo.dao.generic.GenericDAOimpl;
import br.com.utfpr.wellington.modelo.rn.EstoqueRN;
import br.com.utfpr.wellington.modelo.vo.Bebidas;
import br.com.utfpr.wellington.modelo.vo.Estoque;
import java.util.List;

/**
 *
 * @author ferre
 */
public class TesteEstoque {
    
    public static void main(String[] args) {
        
        GenericDAO<Estoque> genericDao = new GenericDAOimpl<Estoque>(){};
        
        Bebidas beb = new Bebidas();
        beb.setNome("Brahma");
        beb.setPreco((float) 5.00);
        beb.setTipo("Cerveja");
        beb.setValidade("12/08/2023");
        
        Estoque est = new Estoque();
        est.setDataCompra("12/10/2022");
        est.setValorLote(100 * beb.getPreco());
        est.setQtdTotal(100);
        est.setBebidas(beb);
        
        genericDao.Cadastrar(est);
        
        EstoqueRN estoqueRN = new EstoqueRN();
        
        List<Estoque> estoques = estoqueRN.listarEstoque();
        
        System.out.println("LISTAR TODOS");
        
        for (Estoque estoque : estoques) {
            System.out.println("Babida: "+estoque.getBebidas().getNome());
            System.out.println("Tipo: "+estoque.getBebidas().getTipo());
            System.out.println("Preço: "+estoque.getBebidas().getPreco());
            System.out.println("Validade: "+estoque.getBebidas().getValidade());
            System.out.println("Qtd Disponivel: "+estoque.getQtdTotal());
        }
    }
}
