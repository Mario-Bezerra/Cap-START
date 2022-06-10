package CapStartLogica1;

import java.util.Scanner;

public class Class2CExercise {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite a primeira nota");
			double primeiraNota = sc.nextDouble();
			System.out.println("Digite a segunda nota");
			double segundaNota = sc.nextDouble();
			System.out.println("Digite a terceira nota");
			double terceiraNota = sc.nextDouble();

			Double media = (primeiraNota + segundaNota + terceiraNota) / 3;
			
			if (media>=7) {
				System.out.println("Aluno aprovado");
			} else {
				System.out.println("Aluno reprovado");
			}
		}
	}
}
