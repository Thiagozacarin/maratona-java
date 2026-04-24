package devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.idade = 50;
        professor.nome = "dunha";
        professor.sexo = 'M';

        System.out.println("idade: " +professor.idade + " sexo: " + professor.sexo + " nome: " + professor.nome);
    }
}
