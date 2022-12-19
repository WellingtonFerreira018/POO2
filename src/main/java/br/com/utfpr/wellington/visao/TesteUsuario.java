/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.visao;

import br.com.utfpr.wellington.modelo.dao.ConexaoBanco;
import br.com.utfpr.wellington.modelo.dao.generic.GenericDAO;
import br.com.utfpr.wellington.modelo.dao.generic.GenericDAOimpl;
import br.com.utfpr.wellington.modelo.rn.UsuarioRN;
import br.com.utfpr.wellington.modelo.vo.Cargo;
import br.com.utfpr.wellington.modelo.vo.Endereco;
import br.com.utfpr.wellington.modelo.vo.Funcionario;
import br.com.utfpr.wellington.modelo.vo.Pessoa;
import br.com.utfpr.wellington.modelo.vo.Usuario;
import java.util.List;

/**
 *
 * @author ferre
 */
public class TesteUsuario {
    
    public static void main(String[] args) {
        
        GenericDAO<Usuario> genericDao = new GenericDAOimpl<Usuario>() {};
        
        /*
        Endereco end = new Endereco();
        end.setNomeRua("Av Coronel Pires");
        end.setNumero("999");
        end.setBairro("Centro");
        end.setComplemento("Proximo ao mercado LAR");
        end.setCep(85892000);
        end.setCidade("Santa Helena");
        end.setEstado("Parana");
        end.setPais("Brasil");
        
        Cargo cargo = new Cargo();
        cargo.setNomeCargo("Gerente");
        
        Funcionario func = new Funcionario();
        func.setCargo(cargo);
        func.setDataAdmissao("2011-11-11");
        func.setSalario((float) 10000.00);
        
        Pessoa pes = new Pessoa();
        pes.setCpf(12235);
        pes.setNome("Wellington");
        pes.setDataNascimento("02/08/2010");
        pes.setTelefone("(12)34556788");
        pes.setSexo("Masculino");
        pes.setEndereco(end);
        pes.setFuncionario(func);
        
        Usuario usu = new Usuario();
        usu.setNome("Souza");
        usu.setPessoa(pes);
        usu.setSenha("123");
         
        
        genericDao.Cadastrar(usu);
        */
        UsuarioRN usuariosRN = new UsuarioRN();
        
        
        List<Usuario> usuarios = usuariosRN.listarUsuarios();
        
        System.out.println("LISTAR TODOS");
        
        for (Usuario usuario : usuarios) {
            System.out.println("Nome do Usuario:"+usuario.getNome());
            System.out.println("Senha do Usuario:"+usuario.getSenha());
            System.out.println("DataNascimento:"+usuario.getPessoa().getDataNascimento());
        }
        
        
        System.out.println("LISTAR UM");
        
        Usuario usuario2 = usuariosRN.listarUmUsuario(1);
        
        System.out.println("Nome: "+usuario2.getNome());
        
        
        System.out.println("LOgin");
        
        Usuario usuario3 = usuariosRN.login("Ferreira", "123");
        
        System.out.println("Nome: "+usuario3.getNome());
        System.out.println("Nome: "+usuario3.getPessoa().getFuncionario().getCargo().getNomeCargo());
        
        ConexaoBanco.close();
    }  
}
