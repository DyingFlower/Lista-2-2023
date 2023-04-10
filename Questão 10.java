import java.util.ArrayList;
import java.util.Scanner;

public class Questão10 {
/*10)Para cada item abaixo imprima as formas apresentadas. Permita que o
usuário escolha o número de linhas e colunas desejadas. No exemplo
abaixo, para cada matriz foram utilizadas 5 linhas e 5 colunas. Porém,
independentemente do número de linhas e colunas, as formas devem
ser mantidas. As matrizes sempre serão quadradas.

a)              b)            C)          D)            E)

0               4 3 @ 1 0      0 1 2 3 4   # # || ! !    0 * * * 4
0 1             0 1 @ 3 4      1 * * * 3   # # || ! !    * 1 * 3 *
0 1 2           @ @ @ @ @      2 * * * 2   = = || = =    * * 2 * *
0 1 2 3         0 1 @ 3 4      3 * * * 1   * * || % %    * 1 * 3 *
0 1 2 3 4       4 3 @ 1 0      4 3 2 1 0   * * || % %    0 * * * 4 */

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Diga quantas colunas e linhas você quer: ");
		int cl = leitor.nextInt();
		System.out.println("Diga qual Configuração de você quer: ");
		String config = leitor.next(); // não sei ler char
		leitor.close();
		if(config.equals("a")|| config.equals("A")) {
			configa(cl);
		}
		if(config.equals("b")|| config.equals("B")) {
			configb(cl);
		}
		if(config.equals("c")|| config.equals("C")) {
			configc(cl);
		}
		if(config.equals("d")|| config.equals("D")) {
			configd(cl);
		}
		if(config.equals("e")|| config.equals("E")) {
			confige(cl);
		}
	}
	public static void configa(int cl) {
		ArrayList<int[]> vetores= new ArrayList<>();
		for(int i=0;i<cl;i++) {
			int vetor[]= new int[i+1];
			for(int j=0;j<vetor.length;j++) {
				vetor[j]=j;
			}
			vetores.add(vetor);
		}
		for(int i=0;i<cl;i++) {
			int vetor[] = vetores.get(i);
			 for (int j = 0; j < vetor.length; j++) {
				 System.out.print(vetor[j] + " ");
	         }
			 System.out.println();
		}
	}
	public static void configb(int cl) {
		int matriz[][] = new int[cl][cl];
		
	}
	public static void configc(int cl) {
		int matriz[][] = new int[cl][cl];
	}
	public static void configd(int cl) {
		int matriz[][] = new int[cl][cl];
	}
	public static void confige(int cl) {
		int matriz[][] = new int[cl][cl];
	}
}
