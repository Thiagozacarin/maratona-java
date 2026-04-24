package devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Yaris";
        carro1.modelo = "Toyota";
        carro1.ano = 2026;
        carro1.cor = "branco";
        carro1.tipoDoCambio = "Automático";


        carro2.nome = "Porsche";
        carro2.modelo = "911";
        carro2.ano = 2023;

        carro2 = carro1;
        //System.out.println("ano :" + carro.ano + "  nome :" + carro.nome + "  modelo :" + carro.modelo + "  cor :" + carro.cor + "  Tipo do Câmbio :" + carro.tipoDoCambio);

        System.out.println("Carro 1");
        System.out.println("nome : "+carro1.nome);
        System.out.println("modelo : "+carro1.modelo);
        System.out.println("ano : "+carro1.ano);
        System.out.println("cor : "+carro1.cor);
        System.out.println("tipo de cambio : "+carro1.tipoDoCambio);

        System.out.println("\nCarro 2");
        System.out.println("nome : "+carro2.nome);
        System.out.println("modelo : "+carro2.modelo);
        System.out.println("ano : "+carro2.ano);
    }
}
