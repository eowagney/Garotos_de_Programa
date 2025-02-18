package estrutura_de_dados;
import java.util.Scanner;

public class Vetor{
	
	//Atributos
	private int tamVetor;
	private int[] vet;
	
	//variaveis
	int soma = 0;
	private Scanner scanner;
	
	//Construtor
	Vetor(int tamVetor) {
		vet = new int[tamVetor];
		this.tamVetor = tamVetor;
		preencherVetor();
	}

	//Geters e Seters
	public int getTamVetor() {
		return tamVetor;
	}

	public void setTamVetor(int tamVetor) {
		this.tamVetor = tamVetor;
	}

	public int[] getVet() {
		return vet;
	}

	public void setVet(int[] vet) {
		this.vet = vet;
	}


	//Metodos
	public void preencherVetor() {
		scanner = new Scanner(System.in);
		System.out.println();
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Informe um numero inteiro: ");
			vet[i] = scanner.nextInt();
		}
	}
		
		public void exibirVetor() {
			for(int i = 0; i < vet.length; i++)System.out.println("vet[" + i + "]: " + vet[i]); 
		}
		
		public void soma() {
			for(int i = 0; i < vet.length; i++)soma += vet[i];
		    System.out.println("\nA soma dos elementos e: " + soma);
		}
		
		public void pares() {
			int pares = 0;
			for(int i = 0; i < vet.length; i++) {
				if(vet[i] % 2 == 0) pares++;
			}
		System.out.println("\nQuantidade de números pares sao: " + pares);
		}
		
		public void maior() {
			int maior = vet[0];
			for(int i = 0; i < vet.length; i++) {
			if(vet[i] > maior)maior = vet[i];	
			}
			System.out.println("\nO maior valor do vetor e: " + maior);
		}
		
		public void menor() {
			int menor = vet[0];
			for(int i = 0; i < vet.length; i++) {
			if(vet[i] < menor)menor = vet[i];	
			}
			System.out.println("\nO menor valor do vetor e: " + menor);
		}
		
		public void media() {
			float media = soma / vet.length;
			System.out.println("\nNúmeros maiores que a média: ");
			for(int i = 0; i < vet.length; i++) {
				if(vet[i] > media)System.out.println("vet[" + i + "]: " + vet[i]);
			}	
		}
		
		public void vetores() {
			System.out.println("\nVetor original: ");
			for(int i = 0; i < vet.length; i++)System.out.println("vet[" + i + "]: " + vet[i]);
			System.out.println("\nVetor invertido: ");
			for(int i = vet.length-1; i > -1; i--)System.out.println("vet[" + i + "]: " + vet[i]);
			
		}
		
		
}

	