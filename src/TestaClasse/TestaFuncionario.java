package TestaClasse;

import GestãoDePessoas.Atendente;
import GestãoDePessoas.Funcionario;
import GestãoDePessoas.Gerente;
import GestãoDePessoas.Vendedor;

public class TestaFuncionario {

    public static void main(String[] args) {

        Funcionario gerente = new Gerente();

        Funcionario atendente = new Atendente();

        Funcionario vendedor = new Vendedor();


        gerente.setNome("Carlos Andre");
        gerente.setCpf("22355648897");
        gerente.setSalario(5000.00);


        atendente.setNome("Ana Cecilia Lopes");
        atendente.setCpf("22554417856");
        atendente.setSalario(1500.00);


        vendedor.setNome("Luis Gustavo Noronha ");
        vendedor.setCpf("25544177755");
        vendedor.setSalario(3000.00);

        System.out.println();
        System.out.println("Folha de Pagamento " + gerente.getNome());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Comissão: " + gerente.comissao());

        System.out.println();
        System.out.println("Folha de Pgamento: " + atendente.getNome());
        System.out.println("Salário: " + atendente.getSalario());

        System.out.println();
        System.out.println("Folha de Pagamento: " + vendedor.getNome());
        System.out.println("Salário: " + vendedor.getSalario());
        System.out.println("Comissão: " + vendedor.comissao());





    }
}
