import java.util.Scanner;

public class Questão7 {
/* 7) Crie um programa que use um loop "while" para encontrar o maior
número primo que é menor do que um número fornecido pelo usuário. */
	public static void main(String[] args) {
		System.out.println("Forneça um número: ");
		Scanner leitor = new Scanner(System.in);
		int numero= leitor.nextInt();
		int mprimo=0;
		while(numero>1) {
			Boolean primo = true;
			for(int i=2;i<=Math.sqrt(numero);i++) { //raiz quadrada do número
				if(numero % i==0) {
					primo=false;
				}
			}
			if(primo) {
				if(mprimo==0) { // como não pode usar break usei isso
					mprimo=numero;
				}
			}
			numero--;
		}
		if(mprimo==0) {
			System.out.println("Não existe número primo menor que o número dado");
		}
		else
			System.out.println(mprimo + " é o  maior primo menor que o numero dado");
		leitor.close();
	}

}
