package bootcamp.repeticaoArrays;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumero;

        System.out.println("Quantidade de numeros: ");
        quantNumero = scan.nextInt();
        System.out.println("Foi escolhido " + quantNumero + " quantidades");

        int numero;

        int count = 0;
        int par = 0;
        int impar = 0;
        int somaPar = 0;
        int somaImpar = 0;
        do {
            System.out.println("digite o numero: ");
            numero = scan.nextInt();

            if(numero % 2 == 0){
                par++;
                somaPar = somaPar + numero;
                
            }else{
                impar++;
                somaImpar = somaImpar + numero;
                
            }
            count++;
        } while (count < quantNumero);

        System.out.println("A quantidade de par foi: " + par);
        System.out.println("A quantidade de impar foi: " + impar);
        System.out.println("A soma dos numeros pares é: " + somaPar);
        System.out.println("A soma dos numeros impares é: " + somaImpar);
        System.out.println("A média de números pares é: " + somaPar / par);
        System.out.println("A média de impares é: " + somaImpar / impar);
        System.out.println("A soma geral é: " + (somaImpar + somaPar));
        System.out.println("A média geral é: " + (somaImpar + somaPar) / quantNumero);
    }
    
}
