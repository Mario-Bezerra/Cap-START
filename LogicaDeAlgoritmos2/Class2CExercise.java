package CapStartLogicaDeAlgoritmos2;

import java.util.Scanner;

public class Class2CExercise {
	
	public boolean ehUmTriangulo(double lado1,double lado2,double lado3) {
		if (lado1>lado2+lado3 || lado2>lado1+lado3 || lado3>lado1+lado2) {
			return false;
		}
		return true;
	}
	
	public String qualEhOTipoDoTriangulo(double lado1,double lado2,double lado3){
		if (lado1==lado2 && lado2==lado3) {
			return "Equilatero";
		} else if (lado1==lado2 || lado2==lado3 || lado1==lado3) {
			return "Isoceles";
		} else {
			return "Escaleno";
		}
	}
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite o primeiro tamanho");
			double lado1 = scanner.nextDouble();
			System.out.println("Digite o segundo tamanho");
			double lado2 = scanner.nextDouble();
			System.out.println("Digite o terceiro tamanho");
			double lado3 = scanner.nextDouble();
			
			Class2CExercise aluno = new Class2CExercise();
			boolean ehUmTriangulo = aluno.ehUmTriangulo(lado1, lado2, lado3);
			if (ehUmTriangulo == true) {
				String qualEhOTipoDoTriangulo = aluno.qualEhOTipoDoTriangulo(lado1, lado2, lado3);
				System.out.println(qualEhOTipoDoTriangulo);
			} else {
				System.out.println("Não é um triangulo");
			}
		}
		
	}

}
