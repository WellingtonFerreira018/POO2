/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.utfpr.wellington.visao;

import br.com.utfpr.wellington.modelo.dao.generic.GenericDAO;
import br.com.utfpr.wellington.modelo.dao.generic.GenericDAOimpl;
import br.com.utfpr.wellington.modelo.rn.OrdemPedidoRN;
import br.com.utfpr.wellington.modelo.vo.Bebidas;
import br.com.utfpr.wellington.modelo.vo.Cargo;
import br.com.utfpr.wellington.modelo.vo.Comidas;
import br.com.utfpr.wellington.modelo.vo.Endereco;
import br.com.utfpr.wellington.modelo.vo.Estoque;
import br.com.utfpr.wellington.modelo.vo.Funcionario;
import br.com.utfpr.wellington.modelo.vo.LocalServico;
import br.com.utfpr.wellington.modelo.vo.Mesa;
import br.com.utfpr.wellington.modelo.vo.OrdemPedido;
import br.com.utfpr.wellington.modelo.vo.Pedido;
import br.com.utfpr.wellington.modelo.vo.Pessoa;
import br.com.utfpr.wellington.modelo.vo.TipoPagamento;
import br.com.utfpr.wellington.modelo.vo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferre
 */
public class TesteOrdemPedido {
    
    public static void main(String[] args) {
        
        GenericDAO<OrdemPedido> genericDao = new GenericDAOimpl<OrdemPedido>() {};
        
        
        //pedido 
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
        pes.setCpf(88888);
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
        ped.setLocalServico(loc);
        ped.setMesa(mes);
        ped.setTipoPagamento(tip);
        ped.setUsusario(usu);
        
        //comidas
        Comidas com = new Comidas();
        com.setNome("X-Bacon");
        com.setPreco((float) 25.00);
        com.setTipo("Lanche");
        
        List<String> ingredientes = new ArrayList<>();
        ingredientes.add("Hamburguer");
        ingredientes.add("Bacon");
        com.setIngredientes(ingredientes);
        
        //estoque
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
        
        //OrdemPedido
        OrdemPedido op = new OrdemPedido();
        op.setQtd(2);
        //0- a fazer
        //1- pronto
        //2- entregar
        op.setStatus(2);
        op.setComidas(com);
        op.setEstoque(est);
        op.setPedido(ped);
        
        genericDao.Cadastrar(op);
        
        OrdemPedidoRN opRN = new OrdemPedidoRN();
        
        List<OrdemPedido> ordemPedidos = opRN.statusPedido(0);
        
        System.out.println("LISTAR PEDIDOS A FAZER ->");
        
        for (OrdemPedido ordemPedido : ordemPedidos) {
            System.out.println("Nome: "+ordemPedido.getComidas().getNome());
            System.out.println("Tipo: "+ordemPedido.getComidas().getTipo());
            System.out.println("Ingrediantes : "+ordemPedido.getComidas().getIngredientes());
            System.out.println("Responsavel pelo Pedido: "+
                    ordemPedido.getPedido().getUsusario().getPessoa().getFuncionario().getCargo().getNomeCargo()+
                    " "+ordemPedido.getPedido().getUsusario().getPessoa().getNome());
        }
        
        System.out.println("LISTAR PEDIDOS JA FEITOS ->");
        
        List<OrdemPedido> ordemPedidosFeitos = opRN.statusPedido(1);
        
        for (OrdemPedido ordemPedido : ordemPedidosFeitos) {
            System.out.println("Nome: "+ordemPedido.getComidas().getNome());
            System.out.println("Tipo: "+ordemPedido.getComidas().getTipo());
            System.out.println("Ingrediantes : "+ordemPedido.getComidas().getIngredientes());
        }
        
        System.out.println("LISTAR PEDIDOS PARA LEVAR A MESA ->");
        
        List<OrdemPedido> ordemPedidosEntregar = opRN.statusPedido(1);
        
        for (OrdemPedido ordemPedido : ordemPedidosEntregar) {
            System.out.println("Nome: "+ordemPedido.getComidas().getNome());
            System.out.println("Tipo: "+ordemPedido.getComidas().getTipo());
            System.out.println("Ingrediantes : "+ordemPedido.getComidas().getIngredientes());
        }
        
    } 
}
