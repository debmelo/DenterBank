package Contas;

import Clientes.Cliente;

public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta (int agencia, int numero, Cliente titular){
        //Analisa se a entrada de dados para agencia e numero são válidos
        if (agencia < 1){
            throw  new IllegalArgumentException("[Agência Invália]");
        }
        if (numero < 1){
            throw  new IllegalArgumentException("[Numero de Conta Invália]");
        }
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        Conta.total++;
        System.out.println("[Nova Conta Criada]");
    }

    public void deposita(double valor){
        this.saldo = saldo + valor;
    }


    //o metodo saca para retirar valores da conta.
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo = saldo - valor;
            return true;
        }else{
            return false;
        }
    }
    //metodo transfere saca da conta origem e depoisita em uma conta destino.
    public boolean transfere(double valor, Conta destino){
        if(this.saca(valor)){
            destino.deposita(valor);
            return true;
        }else{
            return  false;
        }

    }


    // metodos especiais
    public static int getTotal(){
        return Conta.total;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
