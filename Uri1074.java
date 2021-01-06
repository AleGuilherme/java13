import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int n, num;

        n = teclado.nextInt();
        for (int cont = 1; cont <= n; cont++ ){
            num = teclado.nextInt();

            if (num == 0){
                System.out.println("NULL");
            }
            else if (num > 0 && num %2 == 0){
                System.out.println("EVEN POSITIVE");
            }
            else if (num > 0 && num % 2 != 0){
                System.out.println("ODD POSITIVE");
            }
            else if (num < 0 && num %2 == 0){
                System.out.println("EVEN NEGATIVE");
            }
            else if (num < 0 && num %2 != 0){
                System.out.println("ODD NEGATIVE");
            }
        }
    }
}