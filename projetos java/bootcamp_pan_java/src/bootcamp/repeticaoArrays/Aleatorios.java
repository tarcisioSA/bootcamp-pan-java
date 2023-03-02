package bootcamp.repeticaoArrays;

import java.util.Random;



public class Aleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numerosAleatorios = new int[20];

        for(int i = 0 ;i < numerosAleatorios.length ; i++ ){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;


        }
        System.out.print("Numeros aleatorios: ");
        for (int numero : numerosAleatorios) {

            System.out.print(numero + " ");
            
        }

        System.out.print("\nSucessores Numeros aleatorios: ");
        for (int numero : numerosAleatorios) {

            System.out.print(numero+1 + " ");
            
        }
        
    }
}
