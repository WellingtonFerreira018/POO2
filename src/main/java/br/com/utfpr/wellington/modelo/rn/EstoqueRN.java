/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.rn;

import br.com.utfpr.wellington.modelo.dao.EstoqueDAO;
import br.com.utfpr.wellington.modelo.dao.EstoqueDAOimpl;
import br.com.utfpr.wellington.modelo.vo.Estoque;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author ferre
 */
public class EstoqueRN {
    
    private EstoqueDAO estoqueDao;
    
    public EstoqueRN(){
        estoqueDao = new EstoqueDAOimpl();
    }
    
    public void salvar(Estoque estoque){
        try {
            estoqueDao.Cadastrar(estoque);
        } catch (HibernateException e) {
            System.err.println(e);
        }
    }
    
    public List<Estoque> listarEstoque() {
        return this.estoqueDao.listarTodos();
    }
}
