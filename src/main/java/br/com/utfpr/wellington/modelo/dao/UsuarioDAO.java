/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao;

import br.com.utfpr.wellington.modelo.vo.Usuario;
import java.util.List;

/**
 *
 * @author ferre
 */
public interface UsuarioDAO {
    
    void Cadastrar(Usuario usuario);
    
    void Atualizar(Usuario usuario);
    
    void Excluir(Usuario usuario);
    
    List<Usuario> listarTodos();
    
    Usuario listarUm(Integer id);
    
    Usuario login(String user, String password);
    
    void funcaoUsuario(Usuario usuario);
    
}
