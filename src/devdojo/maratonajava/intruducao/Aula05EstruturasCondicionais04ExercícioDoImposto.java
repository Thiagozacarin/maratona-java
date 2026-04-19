package devdojo.maratonajava.intruducao;

public class Aula05EstruturasCondicionais04ExercícioDoImposto {
    public static void main(String[] args) {
        double salario = 50000;
        double imposto1 = salario * (9.70 / 100);
        double imposto2 = salario * (37.35 / 100);
        double imposto3 = salario * (49.50 / 100);

        if (salario <= 34712){
            System.out.println("Voce pagara: "+ imposto1+ "de imposto");
        }else if (salario <= 68506) {
            System.out.println("Voce pagara: "+imposto2+ "de imposto");
        }else {
            System.out.println("Voce pagara: "+imposto3+ "de imposto");
        }

        /*double salario = 40000;
        double primeiroGrupo = 9.70 / 100;
        double segundoGrupo = 37.35 / 100;
        double terceiroGrupo = 49.50 / 100;
        double valorImposto;
        if (salario <= 34712){
            valorImposto = salario * primeiroGrupo;
        }else if (salario <=68507) {
            valorImposto = salario * segundoGrupo;
        }else {
            valorImposto = salario * terceiroGrupo;
        }
        System.out.println(valorImposto);

         */
    }
}



