package bootcamp.java.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o valor de a: ");
		a = scan.nextDouble();
		System.out.println("Digite o valor de b: ");
		b = scan.nextDouble();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("Soma " + soma);
		System.out.println("Subtração " + subtracao);
		System.out.println("Multiplicação " + multiplicacao);
		System.out.println("Divisão " + divisao);
		
		
	}
	
	public static double soma(double a, double b) {
		return a + b;
	}
	public static double subtracao(double a, double b) {
		return a - b;
	}
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	public static double divisao(double a, double b) {
		return a / b;
	}

}
