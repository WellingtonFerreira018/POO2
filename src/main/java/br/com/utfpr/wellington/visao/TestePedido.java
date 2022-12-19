/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.visao;

import br.com.utfpr.wellington.modelo.dao.generic.GenericDAO;
import br.com.utfpr.wellington.modelo.dao.generic.GenericDAOimpl;
import br.com.utfpr.wellington.modelo.vo.Cargo;
import br.com.utfpr.wellington.modelo.vo.Endereco;
import br.com.utfpr.wellington.modelo.vo.Funcionario;
import br.com.utfpr.wellington.modelo.vo.LocalServico;
import br.com.utfpr.wellington.modelo.vo.Mesa;
import br.com.utfpr.wellington.modelo.vo.Pedido;
import br.com.utfpr.wellington.modelo.vo.Pessoa;
import br.com.utfpr.wellington.modelo.vo.TipoPagamento;
import br.com.utfpr.wellington.modelo.vo.Usuario;

/**
 *
 * @author ferre
 */
public class TestePedido {
    
    public static void main(String[] args) {
        
        GenericDAO<Pedido> genericDao = new GenericDAOimpl<Pedido>() {};
        
        LocalServico loc = new LocalServico();
        loc.setNomeLocalServico("Cozinha");
        
        TipoPagamento tip = new TipoPagamento();
        tip.setNomeTipoPagamento("Cartão");
        
        Mesa mes = new Mesa();
        mes.setNumeroMesa(11);
        mes.setQtdPessoas(2);
        
        // preenchendo usuario
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
        pes.setCpf(1234567810);
        pes.setNome("Wellington");
        pes.setDataNascimento("02/08/2000");
        pes.setTelefone("(12)34556788");
        pes.setSexo("Masculino");
        pes.setEndereco(end);
        pes.setFuncionario(func);
        
        Usuario usu = new Usuario();
        usu.setNome("Ferreira");
        usu.setPessoa(pes);
        usu.setSenha("123");
        
        Pedido ped = new Pedido();
        ped.setDataEntrada("12/02/2022");
        // 0- nao esta pago
        // 1- ja esta pago
        ped.setPagamento(0);
        ped.setLocalServico(loc);
        ped.setMesa(mes);
        ped.setTipoPagamento(tip);
        ped.setUsusario(usu);
        
        genericDao.Cadastrar(ped);
        
    }
}
