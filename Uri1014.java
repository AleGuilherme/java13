import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int x; // distancia
        float y; // consumo

        float z; // media de consumo

        // entrada
        x = teclado.nextInt();
        y = teclado.nextFloat();

        // processamo
        z = x / y;  // isso vai dar um resultado Real

        System.out.printf("%.3f km/l%n", z);  
    }
}