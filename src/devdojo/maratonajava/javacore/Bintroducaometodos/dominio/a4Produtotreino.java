package devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class a4Produtotreino {
    public String nome;
    public int quantidade;
    public double[] precos;

    public void imprime() {
        System.out.println("Nome do produto : " + this.nome);
        System.out.println("Quantidades do produto : " + this.quantidade);
        for (double preco : precos) {
            System.out.print(preco + " ");
        }
    }


    public void totalDeProdutos() {
        double soma = 0;
        for (double preco : precos) {
            soma = soma + preco;
        }
            System.out.println("\nSoma dos valores : "+soma);
    }
}


