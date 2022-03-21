package GestãoDePessoas;

public class Gerente extends Funcionario{


    @Override
    public double comissao() {
      double comissao  =  getSalario() * 0.10;
      return comissao;
    }
}
