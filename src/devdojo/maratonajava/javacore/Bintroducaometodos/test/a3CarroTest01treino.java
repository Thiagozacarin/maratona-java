package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.a3Carrotreino;

public class a3CarroTest01treino {
    public static void main(String[] args) {
        a3Carrotreino carro = new a3Carrotreino();
        carro.marca = "Yaris";
        carro.ano = 2024;
        carro.gastos = new double[] {5.367, 7.894, 3.486};

        carro.imprime();
        carro.mediaDosGastos();
        
    }
}
