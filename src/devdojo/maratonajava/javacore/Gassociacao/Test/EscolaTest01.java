package devdojo.maratonajava.javacore.Gassociacao.Test;

import devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Tunic");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Hugo simas", professores, "Azul");

        escola.imprime();
    }
}
