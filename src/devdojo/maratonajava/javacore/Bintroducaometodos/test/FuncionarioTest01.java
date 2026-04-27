package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Thiago Z";
        funcionario.idade = 24;
        funcionario.salarios = new double[] {5000, 12000, 18000};

        funcionario.imprime();
    }
}
