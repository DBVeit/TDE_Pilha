import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner para digitar uma expressao
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a expressao: ");
        String expressao = scan.nextLine();

        boolean expressaoValida = Expressao.verificaDelimitadores(expressao);

        if(expressaoValida){
            System.out.println("Valida");
        }else {
            System.out.println("Invalida");
        }

    }
}