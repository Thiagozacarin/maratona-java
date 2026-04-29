package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Verdelho";
        //pessoa.idade = 33;
        pessoa.setNome("Verdelho");
        pessoa.setIdade(30);
        pessoa.imprime();
        //System.out.println(pessoa.getNome());
        //System.out.println(pessoa.getIdade());
    }
}
