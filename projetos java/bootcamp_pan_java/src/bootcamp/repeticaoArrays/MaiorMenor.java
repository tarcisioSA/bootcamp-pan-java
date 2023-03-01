package bootcamp.repeticaoArrays;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0; 
        int soma = 0;

        int count = 0;
        do {
        System.out.println("Digite um numero: ");
        numero = scan.nextInt();

        soma = soma + numero; //soma feita para criar a média

        if (numero > maior) maior = numero; // condição para achar o maior numero

        count++; //contador para controlar as vezes que a expressao irá se repetir count < 5
        } while (count < 5); // o laço irá se repetir 5x contador começou com 0

        System.out.println("O maior número é: " + maior);
        System.out.println("A media dos numeros é: " + soma/5);
        
    }
}
