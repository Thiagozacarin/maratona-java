package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.a4Produtotreino;

public class a4ProdutosTest01treino {
    public static void main(String[] args) {
        a4Produtotreino produto = new a4Produtotreino();
        produto.nome = "Iphone";
        produto.quantidade = 8;
        produto.precos = new double[] {14.599, 16.899, 18.000};

        produto.imprime();
        produto.totalDeProdutos();
    }
}
