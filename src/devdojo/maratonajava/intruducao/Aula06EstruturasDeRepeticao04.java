package devdojo.maratonajava.intruducao;


public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotal = 40000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+ parcela+ " R$ "+valorParcela);
            }
        }
    }

       /* int valorParcela = 1000;
        int valorCarro = 40000;
        int quantidadeParcelas = valorCarro / valorParcela;
        for (int i = 0; i < valorCarro; quantidadeParcelas++) {
            if (valorParcela < 1000) {
                break;
            } else {
                System.out.println("Você pode parcelar seu carro em: "+quantidadeParcelas+ " vezes");
            }
            break;

        }
    }
}

        */
