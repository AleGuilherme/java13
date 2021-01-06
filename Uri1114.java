import java.util.Scanner;
public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int senha;

        /*do{
            senha = teclado.nextInt();
            if (senha != 2002){
                System.out.println("Senha Invalida");
            }
        } while (senha != 2002);
        System.out.println("Acesso permitido");
        */

        senha = teclado.nextInt();
        while (senha != 2002){
            System.out.println("Senha Invalida");
            senha = teclado.nextInt();
        }
        System.out.println("Acesso Permitido");

    }
}