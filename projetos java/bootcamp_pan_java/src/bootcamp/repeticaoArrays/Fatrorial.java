package bootcamp.repeticaoArrays;

import java.util.Scanner;

public class Fatrorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero para saber o fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        

        for(int i = fatorial ; i >= 1 ; i-- ){
            multiplicacao = multiplicacao * i;

        }

        System.out.println(fatorial +"! = " + multiplicacao);
    }
}
