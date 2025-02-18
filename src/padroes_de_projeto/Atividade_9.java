package padroes_de_projeto;

import java.util.Scanner;

public class Atividade_9 {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do primeiro lado de um triângulo: ");
		int a = scanner.nextInt();
		System.out.println("Informe o tamanho do segundo lado de um triângulo: ");
		int b = scanner.nextInt();
		System.out.println("Informe o tamanho do terceiro lado de um triângulo: ");
		int c = scanner.nextInt();
		
		if(a == b & a == c) {
			System.out.println("Triângulo Equilátero");
		}else if(a == b || a == c) {
			System.out.println("Triângulo Isósceles");
		}else {
			System.out.println("Triângulo Escaleno");
		}
				
	}
}
