package bootcamp.Praticas;

import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        System.out.println("Digite seu nome: ");
        nome = scan.next();

        do {
            if(nome.length() < 3){
                System.out.println("Nome invalido digite novamente: ");
                nome = scan.next();
            }
        } while (nome.length() < 3);

        
        System.out.println("Digite sua idade: ");
        idade = scan.nextInt();

        do {
            if(idade < 0 || idade > 150){
                System.out.println("Idade invalida digite novamente: ");
                idade = scan.nextInt();
            }
            
        } while (idade < 0 || idade > 150);

        System.out.println("Digite seu salario: ");
        salario = scan.nextDouble();

        do {
            if(salario <= 0 ){
                System.out.println("Salario invalido digite novamente: ");
                salario = scan.nextDouble();
            }
            
        } while (salario <= 0);

        System.out.println("Qual seu sexo F ou M ? ");
        sexo = scan.next();

        while (!(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F"))){
            System.out.println("Erro Digite novamente: ");
            sexo = scan.next();
        }

        System.out.println("Estado civil C, S, V, D: ");
        estadoCivil = scan.next();
        

        while (!(estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D") )){
            System.out.println("Erro Digite novamente: ");
            estadoCivil = scan.next();
         }
         

        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSalario: " + salario + "\nSexo: " + sexo.toUpperCase() + "\nEstado civil: " + estadoCivil);

      
    }
}
