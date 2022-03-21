package GestãoDePessoas;

public class Vendedor extends Funcionario {


    @Override
    public double comissao() {
        double comissao = getSalario() * 0.05;
        return comissao;
    }
}
