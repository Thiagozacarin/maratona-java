package devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class a2lunotreino {
    public String nome;
    public int idade;
    public int[] notas;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int nota : notas) {
            System.out.print(nota + " ");
        }
    }
    public void mediaNota(){
        int media = 0;
        for(int nota: notas){
            media += nota;
        }
        media /= notas.length;
        System.out.println("\nMédia das notas : "+media);
    }
}
