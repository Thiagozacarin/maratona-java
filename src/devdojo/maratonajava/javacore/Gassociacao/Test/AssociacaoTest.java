package devdojo.maratonajava.javacore.Gassociacao.Test;

import devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Frei Caneca");
        Aluno aluno = new Aluno("Thiago", 24);
        Professor professor = new Professor("Pedro Miranda", "Neuro");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("IPM Day", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
