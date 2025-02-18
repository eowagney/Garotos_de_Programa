package padroes_de_projeto;

import java.util.Scanner;

public class Atividade_7 {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		int a = scanner.nextInt();
		System.out.println("Informe o valor de B:");
		int b = scanner.nextInt();
		
		System.out.println("Valor de A: "+ a +
							"\nValor de B: " + b);
		
		if(a > b) {
			System.out.println("Maior: " + a);
		}else {
			System.out.println("Maior: " + b);
		}
		
	}
}
