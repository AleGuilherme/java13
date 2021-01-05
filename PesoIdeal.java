import java.util.Scanner;

public class PesoIdeal{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String sexo;
        double altura, peso;

        System.out.println("Digite o sexo");
        sexo = teclado.nextLine();

        System.out.println("Digite a altura");
        altura = teclado.nextDouble();

        switch(sexo){
            case "M":
            case "m":
            case "Masc":
            case "Masculino":
            case "MASC":
               peso = (72.7*altura)-58;
               System.out.println( "O peso ideal masculino vale "+peso);
               break;
            case "F":
            case "f":
            case "Fem":
            case "Feminino":
            case "FEM":
                peso = (62.1*altura)-44.7;
                System.out.println("O peso ideal feminino vale "+peso);
                break;
            default:
                System.out.println("Nao consegui entender o que vc digitou...")
;        }
    }
}