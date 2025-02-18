package padroes_de_projeto;

import java.util.Scanner;

public class Atividade_8 {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		int a = scanner.nextInt();
		System.out.println("Informe o valor de B:");
		int b = scanner.nextInt();
		
		boolean maior = true;
		if(a > b) {
			maior = false;
		}
		
		System.out.println("Valor de A: "+ a +
				"\nValor de B: " + b);
				
		if(maior) {
			System.out.println("Maior: " + b);
		}else {
			System.out.println("Maior: " + a);
		}	
	}
}
