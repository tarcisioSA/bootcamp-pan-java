package bootcamp.repeticaoArrays;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite sua nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10){
       
        System.out.println("Nota invalida digite novamente: ");
        nota = scan.nextInt();

        
        }

        System.out.println("A nota digitada foi: " + nota);
        
        


    }
}
