/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.utfpr.wellington.modelo.dao;

import br.com.utfpr.wellington.modelo.vo.Comidas;
import java.util.List;

/**
 *
 * @author ferre
 */
public interface ComidasDAO {
    
    void Cadastrar(Comidas comidas);
    
    void Atualizar(Comidas comidas);
    
    void Excluir(Comidas comidas);
    
    List<Comidas> listarTodos();
    
    List<Comidas> listarTipo(String tipo);
    
}
