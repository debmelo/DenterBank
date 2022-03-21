package TestaClasse;


import Clientes.Cliente;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import Seguranca.Autenticacao;

import java.util.Scanner;

public class TestaContaCliente {

    public static void main(String[] args) {

        //Cadastro 1º Cliente
        //1º Cria uma autenticação que será vinculada ao cliente.
        Autenticacao acesso1 = new Autenticacao();

        acesso1.setSenha(222);

        //2º Cria o novo cliente
        Cliente cliente1 =  new Cliente();

        cliente1.setNome("Julia Caixeta");
        cliente1.setProfissao("Designer");
        cliente1.setCpf("00233455672");
        cliente1.setSenhaAcesso(acesso1);

        //_________________________________________________

        // 1º Cria autenticação que será vinculada ao 2º Cliente:
        Autenticacao acesso2 = new Autenticacao();
        acesso2.setSenha(333);

        //2º Cria cadastro do 2º cliente
        Cliente cliente2 = new Cliente();

        cliente2.setNome("Gabriel Pereira");
        cliente2.setProfissao("Engenheiro Civil");
        cliente2.setCpf("88345672345");
        cliente2.setSenhaAcesso(acesso2);



        //Cria contas para cada cliente
        ContaCorrente conta1 = new ContaCorrente(224, 4356224, cliente1);
        ContaPoupanca conta2 = new ContaPoupanca(224, 88645, cliente2);

        System.out.println("----------------------------------------------------------------------");


        //Testa Métodos Classe Conta

        conta1.deposita(2000.00);
        conta2.deposita(3000.00);
        conta1.transfere(100.00,conta2);
        conta2.saca(3000.00);

        // Para imprimir o extrato os clientes precisam colocar suas senhas

        System.out.println(" Para Acessar seu extrato digite sua senha: ");
        Scanner sc = new Scanner(System.in);
        int login = sc.nextInt();

        if(login == acesso1.getSenha()) {
            System.out.println("Acesso Liberado.");
            System.out.printf("Saldo Conta  por Titular: %S  Saldo Total: R$ %.2f%n", conta1.getTitular().getNome(), conta1.getSaldo());
        }else if(login == acesso2.getSenha()){
            System.out.println("Acesso Liberado.");
            System.out.printf("Saldo Conta  por Titular: %S  Saldo Total: R$ %.2f%n", conta2.getTitular().getNome(), conta2.getSaldo());
        }else {
            System.out.println("Senha inválida, acesso negado");
        }



















    }
}
