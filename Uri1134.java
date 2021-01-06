import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int comb;
        int qtAlc = 0;
        int qtGas = 0;
        int qtDie = 0;

        do{
            comb = teclado.nextInt();
            switch(comb){
                case 1:
                    qtAlc++;
                    break;
                case 2:
                    qtGas++;
                    break;
                case 3:
                    qtDie++;
                    break;
            }
        } while (comb != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+qtAlc);
        System.out.println("Gasolina: "+qtGas);
        System.out.println("Diesel: "+qtDie);
    
    }
}