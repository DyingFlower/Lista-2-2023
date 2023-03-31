import java.util.Scanner;

public class Questão6 {
/*6) Escreva um programa que utilize uma estrutura "if-else" para verificar se
uma matriz é simétrica (ou seja, a matriz é igual à sua transposta).*/
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira o tamanho da matriz: ");
		int tamanhomatriz=leitor.nextInt();
		int matriz[][]=new int[tamanhomatriz][tamanhomatriz];
		System.out.println("Preencha a matriz:");
		for(int i =0;i<tamanhomatriz;i++) {
			for(int j=0;j<tamanhomatriz;j++) {
				System.out.println("Elemento ["+i +"] [" + j+"]:" );
				matriz[i][j]=leitor.nextInt();	
			}
		}
		  boolean simetrica = true;
	        for (int i = 0; i < tamanhomatriz; i++) {
	            for (int j = 0; j < tamanhomatriz; j++) {
	                if (matriz[i][j] != matriz[j][i]) {
	                    simetrica=false;
	                }
	            }
	        }
	        if (simetrica==true) {
	            System.out.println("A matriz é simétrica.");
	        } else {
	            System.out.println("A matriz não é simétrica.");
	        }
		
		
		leitor.close();
	}

}
