/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.modelo.rn;

import br.com.utfpr.wellington.modelo.dao.UsuarioDAOImpl;
import br.com.utfpr.wellington.modelo.vo.Usuario;
import org.hibernate.HibernateException;
import br.com.utfpr.wellington.modelo.dao.UsuarioDAO;
import java.util.List;

/**
 *
 * @author ferre
 */
public class UsuarioRN {

    private UsuarioDAO usuarioDao;

    public UsuarioRN() {
        usuarioDao = new UsuarioDAOImpl();
    }

    public void salvar(Usuario usuario) {

        try {
            usuarioDao.Cadastrar(usuario);
        } catch (HibernateException e) {
            System.err.println(e);
        }
    }

    public List<Usuario> listarUsuarios() {
        return this.usuarioDao.listarTodos();
    }

    public Usuario listarUmUsuario(Integer id) {
        return this.usuarioDao.listarUm(id);
    }

    public Usuario login(String user, String password) {
        return this.usuarioDao.login(user, password);
    }

    public void funcaoUsuario(Usuario usuario){
        this.usuarioDao.funcaoUsuario(usuario);
    }
}
