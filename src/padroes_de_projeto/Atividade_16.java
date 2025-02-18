package padroes_de_projeto;

import java.util.Scanner;

public class Atividade_16 {
	
	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		int matrix[][] = new int[3][3];

		
		for(int i = 0; i < 3;i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Informe um número inteiro: ");
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		for(int i = 0; i < 3;i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 0 && j ==  2 || i == 1 && j ==  1 || i == 2 && j ==  0 ) {
					System.out.print(matrix[i][j] + " ");
				}else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}

	}
}
