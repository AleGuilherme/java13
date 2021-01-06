import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float num;
        int qtde=0;


        for (int cont=1; cont <= 6; cont++){
            num = teclado.nextFloat();
            if (num > 0){
                qtde = qtde + 1;
            }
        }

        System.out.println(qtde+" valores positivos");

        
    }
}