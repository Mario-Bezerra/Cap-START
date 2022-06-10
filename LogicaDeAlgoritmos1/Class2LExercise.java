package CapStartLogica1;

import java.util.Scanner;

public class Class2LExercise {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Escolha seu candidato \n 10 - Mario \n 20 - Vicenzo \n 30 - Lorenzo");
			int voto = sc.nextInt();
			
			switch (voto) {
			case 10:
				System.out.println("Mario wins");
				break;
			case 20:
				System.out.println("Vicenzo wins");
				break;
			case 30:
				System.out.println("Lorenzo wins");
				break;
			default:
				System.out.println("Voto nulo");
				break;
			}
		}
	}
}
