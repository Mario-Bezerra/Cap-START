package CapStartLogica1;

import java.util.Scanner;

public class Class1EExercise {

	public static void main(String[] args) {	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite seu nome");
			String nome = sc.next();
			System.out.println("Digite seu sobrenome");
			String sobrenome = sc.next();
			
			String nomeCompleto = nome + " " + sobrenome;
			
			System.out.println("Seu nome completo é: "+ nomeCompleto);
		}
		
	}
}
