import java.util.Scanner;

public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float valor = teclado.nextFloat();

        if (valor >= 0.0f && valor <= 25.0f){
            System.out.println("Intervalo [0,25]");
        }
        else if (valor > 25.0f && valor <= 50.0f){
            System.out.println("Intervalo (25,50]");
        }
        else if (valor > 50.0f && valor <= 75.0f){
            System.out.println("Intervalo (50,75]");
        }
        else if (valor > 75.0f && valor <= 100.0f){
            System.out.println("Intervalo (75,100]");
        }
        else{
            System.out.println("Fora de intervalo");
        }
    }
}