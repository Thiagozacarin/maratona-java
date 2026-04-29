package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.a2lunotreino;

public class a2lunoTest01treino {
    public static void main(String[] args) {
        a2lunotreino aluno = new a2lunotreino();
        aluno.nome = "Thiago";
        aluno.idade = 24;
        aluno.notas = new int[] {8, 5,9};

        aluno.imprime();
        aluno.mediaNota();

    }
}
