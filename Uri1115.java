import java.util.Scanner;

public class Uri1115{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x, y;
        int continua = 1;

/*
        do{
            x = teclado.nextInt();
            y = teclado.nextInt();
            if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0){
                System.out.println("terceiro");
            }
            else if (x > 0 && y < 0){
                System.out.println("quarto");
            }
        } while (x != 0 && y != 0);   // while ( !(x == 0 || y == 0) )
        */

        while (continua == 1){
            x = teclado.nextInt();
            y = teclado.nextInt();
            if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0){
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0){
                System.out.println("terceiro");
            }
            else if (x > 0 && y < 0){
                System.out.println("quarto");
            }

            // aqui eu coloco a famosa "condição de parada"
            if (x == 0 || y == 0){
                continua = 0;
            }
        }

    }

}