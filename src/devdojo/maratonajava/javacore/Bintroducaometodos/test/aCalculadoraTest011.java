package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.aCalculadora2;

public class aCalculadoraTest011 {
    public static void main(String[] args) {
        aCalculadora2 calculadora = new aCalculadora2();
        //calculadora.somaDoisNumeros();
        //calculadora.diminuaDoisNumeros();
        //calculadora.multiDoisNumeros(10, 20);
        //System.out.println("Finalizando calculadora test 01");

        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        
    }
}
