package devdojo.maratonajava.intruducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (idade >= 18){
            System.out.println("Pode comprar bebida alcoolica!");
        } else {
            System.out.println("Não pode comprar bebida alcoolica!");
        }
    }
}
