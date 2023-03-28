import java.util.Scanner;

public class Questão2 {
/* 2) Escreva um programa que leia uma sequência de números do usuário e
pare a leitura quando o usuário digitar um número negativo. Em seguida,
o programa deve imprimir a soma dos números positivos lidos. */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int i=0,soma=0;
		System.out.println("Escreva uma sequência de números que serão somados, quando digitar um número negativo aparecerá a soma dos positivos");
		int contador=1;
		while( i>=0) {
			System.out.println("Escreva o número " + contador);
			i=leitor.nextInt();
			if(i>0) {
				soma=soma+i;	
			}
			contador++;
		}
		System.out.println("sua soma é " + soma);
		leitor.close();
	}

}
