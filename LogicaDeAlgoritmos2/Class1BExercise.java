package CapStartLogicaDeAlgoritmos2;

import java.util.Scanner;

public class Class1BExercise {
	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		
		try (Scanner scanner = new Scanner(System.in)) {
			for (int i=0; i<5 ; i++) {
				System.out.println("Digite o "+ (i+1)+"º nome: ");
				nomes[i] = scanner.next();
			}
			
			System.out.println("Digite o nome que deseja encontrar");
			String nomeProcurado = scanner.next();
			
			for (String string : nomes) {
				if (string.equals(nomeProcurado)) {
					System.out.println("Nome encontrado");
				}
			}
		}
	}
}
