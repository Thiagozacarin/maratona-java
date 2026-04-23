package devdojo.maratonajava.intruducao;

public class Aula07Arrays03PraticandoExercicios {
    public static void main(String[] args) {
        /*int[][] num = new int[3][3];

        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;
        num[1][0] = 4;
        num[1][1] = 5;
        num[1][2] = 6;
        num[2][0] = 7;
        num[2][1] = 8;
        num[2][2] = 9;

// Calcula a soma da linha 1 PRIMEIRO
        int soma = 0;
        for (int j = 0; j < num[1].length; j++) {
            soma += num[1][j];
        }

// Imprime a matriz com a info da soma na linha 1
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            if (i == 1) {
                System.out.println("→ linha " + i + " (soma = " + soma + ")");
            } else {
                System.out.println("→ linha " + i);
            }
        }
    }
}

         */
        int[][] num = new int[3][3];
        int soma = 0;
        num[0][0] = 1;
        num[0][1] = 2;
        num[0][2] = 3;


        num[1][0] = 4;
        num[1][1] = 5;
        num[1][2] = 6;

        num[2][0] = 7;
        num[2][1] = 8;
        num[2][2] = 9;

        soma = 0;
        for (int j = 0; j < num[1].length; j++) {
            soma += num[1][j];
            }
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    System.out.print(num[i][j] + "  ");
                }
            if (i == 1){
                System.out.println("linha " + i + " (soma = " + soma + ")");
            }else {
                System.out.println("linha " + i);
            }

        }
    }
}



        /*int[] num1 = new int[6];
        int[] num1 = new int[]{1,2,3,4,5,6};

        for (int i = 0; i < num1.length; i++) {
            if (i % 2 == 0)
            System.out.println(i);
        }
    }
}

         */

        /*for (int i: num){
            soma += num1[i];
            System.out.println(i);

         */

        /*int total = 0;
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

         */
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
