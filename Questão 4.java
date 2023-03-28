import java.util.Scanner;

public class Questão4 {
/*4) Escreva um programa que imprima a tabela de multiplicação de um
número específico fornecido pelo usuário usando um loop while. */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o numero que deseja receber a tabela de multiplicação");
		int numero = leitor.nextInt();
		int preguiça=0;
		int incremento=0;
		while (preguiça<numero*10){
			preguiça=numero*incremento;
			System.out.println(preguiça);
			incremento++;
		}
		leitor.close();
	}

}
