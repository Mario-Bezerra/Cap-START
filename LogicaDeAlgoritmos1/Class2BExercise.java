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
			System.out.println("Subtra��o: "+ (primerioNumero - segundoNumero));
			System.out.println("Multiplica��o: "+ (primerioNumero * segundoNumero));
			System.out.println("Divis�o: "+ (primerioNumero / segundoNumero));
		}
	}
}
