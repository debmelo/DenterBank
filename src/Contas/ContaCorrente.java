package Contas;

import Clientes.Cliente;


public class ContaCorrente  extends Conta{


    public ContaCorrente(int agencia, int numero, Cliente titular)
    {
        super(agencia, numero, titular);
        System.out.println(
                "| Agencia: " + getAgencia() +
                "| Numero da Conta: " + getNumero() +
                "| Titular: " +  getTitular().getNome());
    }


}
