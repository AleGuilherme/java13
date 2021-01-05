import java.util.Scanner;

public class Uri1001{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int a,b,x;

        // entrada
        a = teclado.nextInt();
        b = teclado.nextInt();

        // processamento
        x = a + b;

        // saída
        System.out.println("X = " + x);

    }
}