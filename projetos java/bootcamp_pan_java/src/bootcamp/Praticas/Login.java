package bootcamp.Praticas;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        

        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        System.out.println("DIgite sua senha");
        String senha = scan.next();

        
        while(senha.equalsIgnoreCase(nome)){
            System.out.println("ERRO: ");
            senha = scan.next();
            
        }
            System.out.println("FIM");
            
        
    }

    
}

