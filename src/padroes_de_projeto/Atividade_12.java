package padroes_de_projeto;

import java.util.Scanner;

public class Atividade_12 {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int fat = scanner.nextInt();
		
		int result = 1;
		
		for(int i = fat; i > 0; i--) {
			result *= i;
	}
		System.out.println("O fatorial de " + fat + " e: " + result);
		
				
	}
}
