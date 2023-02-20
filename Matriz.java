package ecal;

public class Matriz {
	
	public static void main(String[] args) {
		
		int botoes [][] = new int [2][3];
		int camisas [][] = new int [3][2];
		int totalBotoes[][] = new int [2][2];
		
		botoes[0][0] = 3;
		botoes[0][1] = 1;
		botoes[0][2] = 3;
		botoes[1][0] = 6;
		botoes[1][1] = 5;
		botoes[1][2] = 5;
		
		camisas[0][0] = 100;
		camisas[0][1] = 50;
		camisas[1][0] = 50;
		camisas[1][1] = 100;
		camisas[2][0] = 50;
		camisas[2][1] = 50;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 3; k++) {
					totalBotoes[i][j] += botoes[i][k] * camisas [k][j];
				}
			}
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println();
			for (int j = 0; j < 2; j++) {
				System.out.print(totalBotoes[i][j] + "  ");
			}
		}
	}
}