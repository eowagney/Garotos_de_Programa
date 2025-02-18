package estrutura_de_dados;
import java.util.Scanner;

public class Principal {
		private static Scanner scanner;
		private static Vetor obj;

		public static void main(String[] args) {
			
			scanner = new Scanner(System.in);			
	    	
			int escolha = 1;
			
			while(escolha != 0) {
	    	System.out.println("\n1- Criar um vetor" + 
	    					   "\n2- Exibir vetor na tela" + 
    			               "\n3- Exibir a soma de todos os elementos" + 
	    					   "\n4- Exibir números pares" +
    			               "\n5- Exibir o maior e menor valor do vetor" + 
	    					   "\n6- Exibir numeros maiores que a media" + 
    			               "\n7- Exibir vetor original e inverso" +
	    					   "\n0- Sair do progrma\n");
	    	
	    	escolha = scanner.nextInt();
	    	
	    	switch(escolha) {
	    	case 0:
    		System.out.println("Adeus! ate a proxima.");
	    		break;
	    	case 1:
	    		System.out.println("Informe o tamanho do vetor: ");
	    	    obj = new Vetor(scanner.nextInt());
	    		break;
	    	case 2:
	    		obj.exibirVetor();
	    		break;
	    	case 3:
	    		obj.soma();
	    		break;
	    	case 4:
	    		obj.pares();
	    		break;
	    	case 5:
	    		obj.maior();
	    		obj.menor();
	    		break;
	    	case 6:
	    		obj.media();
	    		break;
	    	case 7:
	    		obj.vetores();
	    		break;
	    	default:
    		System.out.println("Escolha uma opção existente");
	    	}
			}
	    
		}
	}

