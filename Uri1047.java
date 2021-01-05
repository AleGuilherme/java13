import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hI, mI, hF, mF, durI, durF, durT, horT, minT;

        // entradas
        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        // passo 1 - converter todos para Minutos
        durI = hI * 60 + mI;
        durF = hF * 60 + mF;

        // passo 2 - subtrair o fim do início
        durT = durF - durI;
        if (durT <= 0){  // se o resultado deu negativo, então o evento ultrapassou o dia
            durT = durT + 24*60; // somo 24h (porém na unidade minuto)
        }

        // passo 3 - converter este tempo de volta para horas/minutos
        horT = durT / 60;
        minT = durT % 60;

        System.out.println("O JOGO DUROU " + horT + " HORA(S) E " + minT + " MINUTO(S)");
    }
}