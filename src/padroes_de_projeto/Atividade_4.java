package padroes_de_projeto;
import java.util.Scanner;

public class Atividade_4 {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor de X:");
		int x = scanner.nextInt();
		System.out.println("Informe o valor de Y:");
		int y = scanner.nextInt();
		System.out.println("Informe o valor de Z:");
		int z = scanner.nextInt();
		
		int result = x * y / z;
		
		System.out.println("Resultado: " + result);
		
	}
}
