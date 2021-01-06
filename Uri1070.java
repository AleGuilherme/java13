/*
 8     9 11 13 15 17 19
 3     3 5 7 9 11 13
*/

import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();

        if (x % 2 == 0){
            x++;
        }

        for (int cont = 1;z cont <=6 ; cont++){
            System.out.println(x);
            x = x + 2;
        }
    }
}