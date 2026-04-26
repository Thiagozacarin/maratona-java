package devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Academia {
    public String nome;
    public String exercicio;
    public int series;

    public void imprime() {
        System.out.println("------");
        System.out.println("Musculo : "+ this.nome);
        System.out.println("Exercício : "+this.exercicio);
        System.out.println("Séries : "+this.series);

    }
}
