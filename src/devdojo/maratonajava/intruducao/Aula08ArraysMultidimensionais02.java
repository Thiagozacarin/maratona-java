package devdojo.maratonajava.intruducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int [] array = {1,2,3};

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1,2,3,4,5,6,};

        int[][] arrayInt2 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
        /*// 4 linhas (alunos), 3 colunas (notas)
        double[][] notas = {
                {8.0, 7.5, 9.0, 8.5}, // Aluno 0
                {5.0, 6.0, 7.0, 4.9}, // Aluno 1
                {9.0, 9.5, 10.0, 6.8},// Aluno 2
                {4.0, 3.0, 5.0, 9.6},  // Aluno 3
                {6.3, 8.4, 7.5, 9.1},  // Aluno 4
        };

        // Loop pelas linhas (alunos)
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            // Loop pelas colunas (notas)
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            double media = soma / notas[i].length;
            System.out.printf("Média do Aluno %d: %.2f\n", i + 1, media);
        }
    }
}

         */
     /* int[][] nota = new int[5][5];
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int nota4 = 0;

        nota [0][0] = 5;
        nota [0][1] = 9;
        nota [0][2] = 2;
        nota [0][3] = 4;


        nota1 [1][0] = 5;
        nota1 [1][1] = 1;
        nota1 [1][2] = 3;
        nota1 [1][3] = 6;


        nota2 [2][0] = 7;
        nota2 [2][1] = 4;
        nota2 [2][2] = 2;
        nota2 [2][3] = 0;


        nota3 [3][0] = 6;
        nota3 [3][1] = 2;
        nota3 [3][2] = 7;
        nota3 [3][3] = 1;

        nota4 [4][0] = 8;
        nota4 [4][1] = 9;
        nota4 [4][2] = 4;
        nota4 [4][3] = 6;





        for (int i = 0; i < 5; i++) {
            System.out.print("nota aluno "+ i +": ");
            for (int j = 0; j < 4; j++) {
                System.out.print(nota[i][j]);
            }
            System.out.println();
        }
    }
}

        */
        /*char[][] jogo = new char[3][3];

        jogo[0][0] = 'X';
        jogo[0][1] = 'O';
        jogo[0][2] = 'O';

        jogo[1][0] = 'O';
        jogo[1][1] = 'X';
        jogo[1][2] = 'O';

        jogo[2][0] = 'O';
        jogo[2][1] = 'O';
        jogo[2][2] = 'X';

        for (int i = 0; i < jogo.length; i++) {
            for (int j = 0; j < jogo.length; j++) {
                System.out.print(jogo[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

         */
        /*int[][] arrayInt = new int[3][];
        int [] array = {1,2,3};

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1,2,3,4,5,6,};

        int[][] arrayInt2 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}

         */



