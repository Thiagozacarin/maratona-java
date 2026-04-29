package devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class a3Carrotreino {
    public String marca;
    public int ano;
    public double[] gastos;

    public void imprime(){
        System.out.println(this.marca);
        System.out.println(this.ano);
        for(double gasto : gastos)
        System.out.print(gasto+ " ");
    }
    public void mediaDosGastos(){
        double media = 0;
        for(double gasto: gastos){
            media += gasto;
        }

        media /= gastos.length;
        System.out.println("\nMédia dos gastos : " +media);
    }
}
