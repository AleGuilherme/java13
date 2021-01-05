import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo, velMedia;
        double distancia;
        double consumo;

        // entrada
        tempo = teclado.nextInt();
        velMedia = teclado.nextInt();

        // processamento
        distancia = tempo * velMedia;
        consumo   = distancia / 12.0;

        // saida
        System.out.printf("%.3f%n",consumo);

    }
}