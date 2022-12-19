/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao;

import br.com.utfpr.wellington.modelo.vo.Estoque;
import java.util.List;

/**
 *
 * @author ferre
 */
public interface EstoqueDAO {
    
    void Cadastrar(Estoque estoque);
    
    void Atualizar(Estoque estoque);
    
    void Excluir(Estoque estoque);
    
    List<Estoque> listarTodos();
    
    List<Estoque> listarTipo(String tipo);
}
