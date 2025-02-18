package padroes_de_projeto;

import java.util.Scanner;

public class Atividade_13 {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor de x: ");
		int x = scanner.nextInt();
		System.out.println("Informe o valor de y: ");
		int y = scanner.nextInt();
		
		int result = x;
		for(int i = 1; i < y; i++) {
			result *= x;
	}
		System.out.println("A potenciacao de " + x + "^" + y + " e: " + result);
		
				
	}
}
