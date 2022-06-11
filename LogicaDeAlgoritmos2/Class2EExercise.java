package CapStartLogicaDeAlgoritmos2;

import java.util.Scanner;

public class Class2EExercise {

	String[] respostas = new String[10];
	String[] gabarito = new String[10];
	int notaFinal = 0;

	Scanner scanner = new Scanner(System.in);

	public void registrarRespostas(Scanner scanner) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite sua resposta " + (i + 1));
			respostas[i] = scanner.next();
		}
	}

	public void registrarGabarito(Scanner scanner) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite a respota do gabarito " + (i + 1));
			gabarito[i] = scanner.next();
		}
	}

	public String resultadoDaProva() {
		for (int i = 0; i < 10; i++) {
			if (gabarito[i].equals(respostas[i])) {
				notaFinal += 1;
			}
		}
			
			if (notaFinal >= 7) {
				return "Aprovado: " + notaFinal+"/10";
			}
			if (notaFinal < 5) {
				return "Reprovado: " + notaFinal+"/10";
			} else {
				return "Recuperação: " + notaFinal+"/10";
			}
		
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Class2EExercise controlador = new Class2EExercise();
		boolean continuar = true;
		while (continuar) {
			System.out.println("Digite a opção do menu: \n " + " 1 - Cadastrar gabarito \n"
					+ " 2 - Cadastrar respostas \n" + " 3 - Resultado da prova \n " + " 4 - Sair");
			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				controlador.registrarGabarito(scanner);
				break;
			case 2:
				controlador.registrarRespostas(scanner);
				break;
			case 3:
				String resultadoDaProva = controlador.resultadoDaProva();
				System.out.println(resultadoDaProva);
				break;
			case 4:
				continuar = false;
				break;
			default:
				break;
			}
		}
	}
}
