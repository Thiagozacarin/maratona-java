package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Thiago Z");
        funcionario.setIdade(24);
        funcionario.setSalarios(new double[]{5000, 12000, 20000});
        funcionario.imprime();
        System.out.println("Média "+ funcionario.getMedia());
    }
}
