package devdojo.maratonajava.intruducao;

public class Aula07Arrays03PraticandoExercicios {
    public static void main(String[] args) {
        int total = 0;
        int[] soma = {1, 2, 3, 4, 5};
        int[] soma2 = {10, 20, 30};

        for (int i : soma) {
            total = total + i;
        }
        System.out.println("Soma 1: " + total);

        total = 0;

        for (int i : soma2) {
            total += i;
        }
        System.out.println("Soma 2: " + total);
    }
}












        /*int[] numero = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int i : numero) {
            if (i % 2 == 0) {
                soma = soma + i;
            }
        }

        System.out.println(soma);
    }
}
        /*int[] numero = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int i : numero) {
            if (i % 2 == 0) {
                soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}

         */
