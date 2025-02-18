package estrutura_de_dados;
import java.util.Scanner;

public class Atividade_02 {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		int vet[] = new int[5];
		int v = vet.length - 1;
		int temporario;
		int a = vet.length - 1;
	
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Informe um numero inteiro: ");
			vet[i] = scanner.nextInt();
		}
		
		System.out.println("\nVetor na posição original: ");
		for(int i = 0; i < vet.length; i++)System.out.println("vet[" + i + "]: " + vet[i]);
		
			temporario = vet[v];
			for(int j = vet.length-2; j > -1; j--) {
			 vet[a] = vet[j];
			 a--;
			}
			vet[0] = temporario;
		
		System.out.println("\nVetor rotacionado para a direira: ");
		for(int i = 0; i < vet.length; i++)System.out.println("vet[" + i + "]: " + vet[i]);
		
		v = 0;
		a = 1;
		
			temporario = vet[v];
			for(int j = 0; j < vet.length && a < vet.length; j++) {
			 vet[j] = vet[a];
			 a++;
			}
			 vet[vet.length - 1] = temporario;
		
		System.out.println("\nVetor rotacionado para a esquerda: ");
		for(int i = 0; i < vet.length; i++)System.out.println("vet[" + i + "]: " + vet[i]);
		
		v = vet.length - 1;
		for(int i = 0; i < vet.length / 2; i++) {
			temporario = vet[i];
			 vet[i] = vet[v];
			 vet[v] = temporario;
			 v--;
		}		
		System.out.println("\nVetor com os elementos trocados: ");
		for(int i = 0; i < vet.length; i++)System.out.println("vet[" + i + "]: " + vet[i]);
		
		v = -1; 
		a = vet.length - 1; 
		
		for(int i = 0; i < vet.length - 1; i++) {
			v++;
			for(int j = vet.length -1 ; j > v; j--) {
			if(vet[i] > vet[j]) {
				temporario = vet[j];
				vet[j] = vet[i];
				vet[i] = temporario;
				
			}
			}
		}
		
		System.out.println("\nVetor em ordem crescente: ");
		for(int i = 0; i < vet.length; i++)System.out.println("vet[" + i + "]: " + vet[i]);
	}
}
		


		/*for(int i = 0; i < vet.length; i++) {
			if(vet[0] != 0) {
			for(int j = vet.length-2; j > -1; j--) {
				if(vet[j] != 0) {
				vet[v] = vet[j];
				}
				v--;
			}
			}
			v = vet.length-1;
			System.out.println("Informe um numero inteiro: ");
			vet[0] = scanner.nextInt();
		}
		
		for(int i = 0; i < vet.length; i++)System.out.println("vet[" + i + "]: " + vet[i]);*/ 
		
