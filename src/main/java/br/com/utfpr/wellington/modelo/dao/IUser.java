/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao;

import br.com.utfpr.wellington.modelo.vo.Usuario;

/**
 *
 * @author ferre
 */
public interface IUser {
    
    void Cadastrar (Usuario categoria);
    
    void Atualizar(Usuario usuario);
    
    void Excluir(Usuario usuario);
}
