import java.util.Random;
import java.util.Scanner;
public class Questão3 {
/* 3) Escreva um programa que peça ao usuário para adivinhar um número
entre 1 e 100. Se o usuário adivinhar incorretamente, o programa deve
dizer se o número a ser adivinhado é maior ou menor do que o número
digitado pelo usuário. O programa deve continuar a pedir ao usuário que
adivinhe até que ele adivinhe corretamente. */
	public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
		 Random gerador = new Random();
		 int numero=gerador.nextInt(1,100);
		 System.out.println(numero);// apenas para testar se está funcionando
		 System.out.println("Escreva números aleatórios de 1 a 100 até acertar o número ");
		 for(int coleta=0;coleta!=numero;coleta=leitor.nextInt()) {
			 System.out.println("Tente Acertar");
		 }
		 System.out.println("numero correto");
		 leitor.close();
	}

}
