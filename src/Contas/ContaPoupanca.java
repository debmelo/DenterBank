package Contas;

import Clientes.Cliente;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
        System.out.println(
                        "| Agencia: " + getAgencia() +
                        "| Numero da Conta: " + getNumero() +
                        "| Titular: " +  getTitular().getNome());
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.10;
        return super.saca(valorASacar);
    }


}
