/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.rn;

import br.com.utfpr.wellington.modelo.dao.ComidasDAO;
import br.com.utfpr.wellington.modelo.dao.ComidasDAOimpl;
import br.com.utfpr.wellington.modelo.vo.Comidas;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author ferre
 */
public class ComidasRN {

    private ComidasDAO comidasDao;

    public ComidasRN() {
        comidasDao = new ComidasDAOimpl();
    }

    public void salvar(Comidas comidas) {

        try {
            comidasDao.Cadastrar(comidas);
        } catch (HibernateException e) {
            System.err.println(e);
        }
    }

    public List<Comidas> listarComidas() {
        return this.comidasDao.listarTodos();
    }

    public List<Comidas> listarTipo(String tipo) {
        return this.comidasDao.listarTipo(tipo);
    }
}
