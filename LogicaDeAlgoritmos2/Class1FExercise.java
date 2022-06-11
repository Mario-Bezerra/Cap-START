package CapStartLogicaDeAlgoritmos2;

import java.util.Scanner;

public class Class1FExercise {
	public static void main(String[] args) {
		
		boolean continuar = true;

		try (Scanner scanner = new Scanner(System.in)) {
			String[][] lugaresDoCinema = new String[10][10];

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					lugaresDoCinema[i][j] = "O";
				}
			}

			while (continuar) {
				System.out.println("Digite a opção que deseja: \n" + " 1 - Reservar um lugar \n " + "2 - Layout dos lugares \n"
						+ " 3 - Sair ");
				int opcao = scanner.nextInt();

				switch (opcao) {
				case 1:
					System.out.println("Digite a fila que deseja");
					int fila = scanner.nextInt();
					System.out.println("Digite a cadeira que deseja");
					int cadeira = scanner.nextInt();
					lugaresDoCinema[fila][cadeira] = "X";
					break;
				
				case 2:
					for (int i = 0; i < 10; i++) {
						for (int j = 0; j < 10; j++) {
							System.out.print(lugaresDoCinema[i][j]+ " " );
						}
						System.out.println("");
					}
					break;
				
				case 3:
					continuar = false;
					break;
					
				default:
					break;
				}
			}
		}
	}
}
