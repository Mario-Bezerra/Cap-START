package CapStartLogica1;

import java.util.Scanner;

public class Class3CExercise {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Quantas pessoas gostaria de entrevistar");
			int quantidadeDeEntrevistados = scanner.nextInt();

			int[] idades = new int[quantidadeDeEntrevistados];
			int maiorIdade = 0;
			int menorIdade = 100;
			int somaDeIdades = 0;
			double mediaDeIdade = 0;
			int quantidadeMenorDeIdades = 0;
			double porcentagemMenorDeIdades = 0;

			for (int i = 0; i != quantidadeDeEntrevistados; i++) {
				System.out.println("Digite a idade do " + (i + 1) + "º entrevistado");
				idades[i] = scanner.nextInt();
			}

			for (int i : idades) {
				if (i > maiorIdade) {
					maiorIdade = i;
				}
				if (i < menorIdade) {
					menorIdade = i;
				}
				if (i < 18) {
					quantidadeMenorDeIdades += 1;
				}
				somaDeIdades += i;
			}
			
			mediaDeIdade = somaDeIdades / quantidadeDeEntrevistados;
			porcentagemMenorDeIdades = (quantidadeMenorDeIdades *100) / quantidadeDeEntrevistados ;

			System.out.println("Maior idade: " + maiorIdade);
			System.out.println("Menor idade: " + menorIdade);
			System.out.println("Media de idades: " + mediaDeIdade);
			System.out.println("Porcentagem de menores de idade: "+ porcentagemMenorDeIdades+"%");
		}

	}
}
