
public class improperexceptionhandling {
	    public static void main(String[] args) {
	        Calculator calculator = new Calculator();
	        calculator.divide(10, 2);
	    }
	}

	class Calculator {
	    public void divide(int a, int b) {
	        try {
	            System.out.println("Result: " + (a / b));
	        } catch (ArithmeticException e) {
	            System.out.println("Erro: Divisão por zero não é permitida.");
	        }
	    }
	}


