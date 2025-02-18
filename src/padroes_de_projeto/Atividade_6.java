package padroes_de_projeto;

import java.util.Scanner;

public class Atividade_6 {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor de X1: ");
		int x1 = scanner.nextInt();
		System.out.println("Informe o valor de Y1:");
		int y1 = scanner.nextInt();
		System.out.println("Informe o valor de X2: ");
		int x2 = scanner.nextInt();
		System.out.println("Informe o valor de Y2:");
		int y2 = scanner.nextInt();

		
		int d = (x1 - x2) * 2 + (y1 - y2) * 2;
		
		System.out.println("Ponto 1: (" + x1 + "," + y1 + ")" +
							"\nPonto 2: (" + x2 + "," + y2 + ")" + 
							"\nDistância: " + d);
		
	}

}
