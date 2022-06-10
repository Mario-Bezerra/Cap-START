package CapStartLogica1;

import java.util.Scanner;

public class Class2BExercise {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o primeiro numero");
			double primerioNumero = sc.nextDouble();
			System.out.println("Digite o segundo numero");
			double segundoNumero = sc.nextDouble();
			
			System.out.println("Soma: "+ (primerioNumero + segundoNumero));
			System.out.println("Subtração: "+ (primerioNumero - segundoNumero));
			System.out.println("Multiplicação: "+ (primerioNumero * segundoNumero));
			System.out.println("Divisão: "+ (primerioNumero / segundoNumero));
		}
	}
}
