package devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Produtoexerc;

public class ProdutoTest01exerc {
    public static void main(String[] args) {
        Produtoexerc produto1 = new Produtoexerc();
        Produtoexerc produto2 = new Produtoexerc();
        Produtoexerc produto3 = new Produtoexerc();

        produto1.nome = "Arroz";
        produto1.preco = 20.0;
        produto1.quantidade = 5;

        produto2.nome = "Feijão";
        produto2.preco = 15.50;
        produto2.quantidade = 3;

        produto3.nome = "Òleo";
        produto3.preco = 7.50;
        produto3.quantidade = 10;

        System.out.println("Produto 1");
        System.out.println("Produto:" + produto1.nome);
        System.out.println("Preço: " + produto1.preco);
        System.out.println("Quantidade: " + produto1.quantidade);

        System.out.println("------------------------");

        System.out.println("Produto 2");
        System.out.println("Produto:" + produto2.nome);
        System.out.println("Preço: " + produto2.preco);
        System.out.println("Quantidade: " + produto2.quantidade);

        System.out.println("------------------------");

        System.out.println("Produto 3");
        System.out.println("Produto:" + produto3.nome);
        System.out.println("Preço: " + produto3.preco);
        System.out.println("Quantidade: " + produto3.quantidade);


    }
}
