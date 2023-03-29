import java.util.Scanner;

public class Questão5 {
/*5) Faça um programa que possa exibir uma sequência como a abaixo,
sendo o limite superior dos pares da esquerda e direita informados pelo
usuário. Exemplo: com pares da esquerda e direta com o limite superior
de 2 unidades.
0 - 0
0 - 1
0 - 2
1 - 0
1 - 1
1 - 2
2 - 0
2 - 1
2 - 2 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o limite superior");
		int limite = leitor.nextInt();

		for(int i=0,j=0;i<limite+1;j++) {
			if(j>limite) {
				i++;
				j=0;
			}
			if(i<=limite)
			System.out.println(i +" - "+j);
			
		}
		leitor.close();
	}

}
