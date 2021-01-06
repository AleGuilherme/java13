import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int qtPar = 0;
        int qtImp = 0;
        int qtPos = 0;
        int qtNeg = 0;

        int num;

        for (int co = 1; co <=5 ; co++){
            num = teclado.nextInt();
            if (num % 2 == 0){
                qtPar++;
            }
            else{
                qtImp++;
            }

            if (num > 0){
                qtPos++;
            }
            else if (num < 0) {
                qtNeg++;
            }
        }

        System.out.println(qtPar + " valor(es) par(es)");
        System.out.println(qtImp + " valor(es) impar(es)");
        System.out.println(qtPos + " valor(es) positivo(s)");
        System.out.println(qtNeg + " valor(es) negativo(s)");
    }
}