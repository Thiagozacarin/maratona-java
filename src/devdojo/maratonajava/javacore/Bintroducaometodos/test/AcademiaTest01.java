package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Academia;

public class AcademiaTest01 {
    public static void main(String[] args) {
        Academia treino1 = new Academia();
        Academia treino2 = new Academia();
        Academia treino3 = new Academia();
        Academia treino4 = new Academia();
        Academia treino5 = new Academia();

        treino1.nome = "peito";
        treino1.exercicio = "voador";
        treino1.series = 4;

        treino2.nome = "perna";
        treino2.exercicio = "leg";
        treino2.series = 6;

        treino3.nome = "perna";
        treino3.exercicio = "agachamento";
        treino3.series = 8;

        treino4.nome = "costas";
        treino4.exercicio = "remada alta";
        treino4.series = 3;

        treino5.nome = "ombro";
        treino5.exercicio = "elevacao lateral";
        treino5.series = 5;


        treino1.imprime();
        treino2.imprime();
        treino3.imprime();
        treino4.imprime();
        treino5.imprime();
    }
}
