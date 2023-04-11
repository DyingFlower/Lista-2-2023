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
		if(config.equals("a")|| config.equals("A")) { // perfeito
			configa(cl);
		}
		if(config.equals("b")|| config.equals("B")) {// funciona legal só com 5 linhas e colunas
			configb(cl);
		}
		if(config.equals("c")|| config.equals("C")) {// perfeito
			configc(cl);
		}
		if(config.equals("d")|| config.equals("D")) {// funciona melhor com numeros impares de colunas e linhas
			configd(cl);
		}
		if(config.equals("e")|| config.equals("E")) {// só funciona direito para o numero de colunas e linhas 5
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
		ArrayList<int[]> vetores= new ArrayList<>();
		for(int i = 0;i<cl;i++) {
			if(i==cl/2+0.5 || i==cl/2) {
				int vetor[]= new int[cl];
				for(int j=0;j<vetor.length;j++) {
					vetor[j]=2;
				}
				vetores.add(vetor);
			}
			else if(i%2==0) {
				int vetor[]= new int[cl];
				int aux = cl-1;
				for(int j=0;j<vetor.length;j++) {
					vetor[j]=aux;
					aux--;
				}
				vetores.add(vetor);
			}
			else if(i%2!=0) {
				int vetor[]= new int[cl];
				for(int j=0;j<vetor.length;j++) {
					vetor[j]=j;
				}
				vetores.add(vetor);
			}
		}
		for(int i=0;i<cl;i++) {
			int vetor[] = vetores.get(i);
			 for (int j = 0; j < vetor.length; j++) {
				 if(vetor[j]==2) {
					 System.out.print("@ ");
				 }
				 else
				 System.out.print(vetor[j] + " ");
	         }
			 System.out.println();
		}
		
	}
	public static void configc(int cl) {
		ArrayList<int[]> vetores= new ArrayList<>();
		int aux2=cl-2; // diminui a ultima coluna
		for(int i = 0;i<cl;i++) {
			int vetor[]= new int[cl];
			int aux=cl-1; // diminui a ultima linha
			for(int j=0;j<vetor.length;j++) {
				if(i==0) {
					vetor[j]=j;
				}
				else if(i==cl-1) {
					vetor[j]=aux;
					aux--;
				}
				else if(i>0 && i<cl-1) {
					if(j==0)
						vetor[j]=i;
					else if(j==vetor.length-1) {
						vetor[j]=aux2;
						aux2--;
					}
					else
						vetor[j]=45; // numero auxiliar :)
				}
			}
			vetores.add(vetor);
		}
		for(int i=0;i<cl;i++) {
			int vetor[] = vetores.get(i);
			 for (int j = 0; j < vetor.length; j++) {
				 if(vetor[j]==45) {// motivo do numero auxiliar
					 System.out.print("* ");
				 }
				 else
					 System.out.print(vetor[j] + " ");
	         }
			 System.out.println();
		}
	}
	public static void configd(int cl) {
		ArrayList<String[]> vetores= new ArrayList<>(); // necessário vetor de STRING DEVIDO O ||
		for(int i=0;i<cl;i++) {
			String vetor[]= new String[cl];
			for(int j=0;j<vetor.length;j++) {
				if(i<=cl/2||i==cl/2+0.5) {
					if(j<cl/2) {
						if(i==cl/2+0.5|| i==cl/2) {
							vetor[j]="=";
						}
						else
							vetor[j]="#";
					}
						else if(j>cl/2) {
							if(i==cl/2+0.5 || i==cl/2) {
								vetor[j]="=";
							}
							else
								vetor[j]="!";
						}
						else if(j==cl/2+0.5 || j==cl/2) {
							vetor[j]="||";
						}	
				}
				else if(i>cl/2) {
					if(j<cl/2) {
						vetor[j]="*";
					}
					else if(j>cl/2) {
						vetor[j]="%";
					}
					else if(j==cl/2+0.5 || j==cl/2) {
						vetor[j]="||";
					}	
				}
			}
			vetores.add(vetor);
		}
		for(int i=0;i<cl;i++) {
			String vetor[] = vetores.get(i);
			 for (int j = 0; j < vetor.length; j++) {
				 System.out.print(vetor[j] + " ");
	         }
			 System.out.println();
		}
	}
	public static void confige(int cl) {
		ArrayList<int[]> vetores= new ArrayList<>();
		for(int i=0;i<cl;i++) {
			int vetor[]= new int[cl];
			for(int j=0;j<vetor.length;j++) {
				vetor[j]=j;
			}
			vetores.add(vetor);
		}
		for(int i=0;i<cl;i++) {
			int vetor[] = vetores.get(i);
			 for (int j = 0; j < vetor.length; j++) {
				 if(i==0 || i== cl-1) {
					 if(j!=0 && j!=cl-1) {
						 System.out.print("* ");
					 }
					 else
						 System.out.print(vetor[j] + " ");
				 }
				 else if(i<cl/2 || i>cl/2) {
					 if(j==0 || j==cl-1 || j==cl/2 || j==cl/2+0.5) {
						 System.out.print("* ");
					 }
					 else
						 System.out.print(vetor[j] + " ");
				 }
				 else if(i==cl/2+0.5 || i==cl/2|| i==cl/2+1) {
					 if(j==cl/2+0.5 ||j==cl/2) {
						 System.out.print(vetor[j] + " "); 
					 }
					 else {
						 System.out.print("* "); 
					 }
				 }
				
	         }
			 System.out.println();
		}
	}
}
