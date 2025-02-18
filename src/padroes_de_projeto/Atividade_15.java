package padroes_de_projeto;

public class Atividade_15 {
	public static void main(String[] args) {
		
	int matrix[][] = new int[3][3];
	int num = 1;
	
	for(int i = 0; i < 3;i++) {
		for(int j = 0; j < 3; j++) {
			matrix[i][j] = num;
			num++;
		}
	}
	
	for(int i = 0; i < 3;i++) {
		for(int j = 0; j < 3; j++) {
			if(i == j) {
				System.out.print(matrix[i][j] + " ");
			}else {
				System.out.print("X ");
			}
		}
		System.out.println();
	}

}
}
