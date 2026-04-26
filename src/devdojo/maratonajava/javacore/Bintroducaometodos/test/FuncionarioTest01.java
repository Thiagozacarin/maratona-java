package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        //funcionario.mediaDosSalarios();
        funcionario.nome = "Thiago Z";
        funcionario.idade = 24;
        funcionario.salario1 = 5000;
        funcionario.salario2 = 12000;
        funcionario.salario3 = 18000;

        System.out.println("Nome do funcionario : "+funcionario.nome);
        System.out.println("Idade do funcionario : "+funcionario.idade);
        System.out.println("Sálario 1 do funcionario : "+funcionario.salario1);
        System.out.println("Sálario 2 do funcionario : "+funcionario.salario2);
        System.out.println("Sálario 3 do funcionario : "+funcionario.salario3);

        //System.out.println(funcionario.mediaDosSalarios());
    }
}
