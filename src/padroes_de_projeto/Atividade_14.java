package padroes_de_projeto;

public class Atividade_14 {
    public static void main(String[] args) {
        int cont = 0;

        for (int i = 2; i <= 1000; i++) {
            int divisores = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                cont++;
            }
        }
        System.out.println("Quantidade de números primos entre 1 e 1000: " + cont);
    }
}