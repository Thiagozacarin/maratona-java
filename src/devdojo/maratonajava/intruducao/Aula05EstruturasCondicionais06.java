package devdojo.maratonajava.intruducao;

import javax.swing.*;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 9;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}

        /*
        int dia = 1;
        int domingo = 1;
        int seg = 2;
        int ter = 3;
        int qua = 4;
        int qui = 5;
        int sex = 6;
        int sab = 7;

        if (dia == 1) {
            System.out.println("Não útil");
        } else if (dia == 2) {
            System.out.println("Dia útil!");
        } else if (dia == 3) {
            System.out.println("Dia útil!");
        } else if (dia == 4) {
            System.out.println("Dia útil!");
        } else if (dia == 5) {
            System.out.println("Dia útil!");
        } else if (dia == 6) {
            System.out.println("Dia útil!");
        } else if (dia == 7) {
            System.out.println("Não útil");
        } else {
            System.out.println("Invalido");
        }
    }
}
        /*byte dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda, Dia útil!");
                break;
            case 3:
                System.out.println("Terça, Dia útil!");
                break;
            case 4:
                System.out.println("Quarta, Dia útil!");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}

         */