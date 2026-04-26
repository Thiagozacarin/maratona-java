package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Thiago";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Juana";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();

    }
}
