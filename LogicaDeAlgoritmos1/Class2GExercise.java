package CapStartLogica1;

import java.util.Scanner;

public class Class2GExercise {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o primeiro tamanho");
			double lado1 = sc.nextDouble();
			System.out.println("Digite o segundo tamanho");
			double lado2 = sc.nextDouble();
			System.out.println("Digite o terceiro tamanho");
			double lado3 = sc.nextDouble();
			
			if (lado1>lado2+lado3 || lado2>lado1+lado3 || lado3>lado1+lado2) {
				System.out.println("Não é um triangulo");
			} else if (lado1==lado2 && lado2==lado3) {
				System.out.println("Triangulo equilatero");
			} else if (lado1==lado2 || lado2==lado3 || lado1==lado3) {
				System.out.println("Triangulo isoceles ");
			} else {
				System.out.println("Triangulo escaleno");
			}
		}
	}
}
