package bootcamp.repeticaoArrays;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("De qual numero você quer ver a tabuada? ");
        numero = scan.nextInt();

        System.out.println("Tabuada de " + numero);

        for(int i = 1 ; i <= 10 ; i++ ){
            System.out.println(numero + "X" + i + "=" + (numero * i));

        }
    }
}
