package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Thiago";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Juana";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("---------------");
        
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);
    }
}
