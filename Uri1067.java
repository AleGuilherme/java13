import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x;
        x = teclado.nextInt();

        for (int num=1; num<=x; num+=2){
            System.out.println(num);
        }
    }
}