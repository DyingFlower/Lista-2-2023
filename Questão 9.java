import java.util.Scanner;

public class Questão9 {
	/* 9) Faça um programa para gerar todas as permutações de um conjunto de
	caracteres (por exemplo, "ABC" pode gerar "ABC", "ACB", "BAC",
	"BCA", "CAB" e "CBA"). */
	   public static void main(String[] args) {// precisei de ajuda do chat gpt mas entendi o código
		   Scanner leitor = new Scanner(System.in);
		   System.out.println("Escreva um Conjunto de 3 caracteres: ");
	       String conjunto = leitor.next();
	       gerarPermutações(conjunto.toCharArray(), 0);
	       leitor.close();
	   }

	   private static void gerarPermutações(char[] conjunto, int index) {
	       if (index == conjunto.length - 1) {
	    	   System.out.println(String.valueOf(conjunto));//devolve o array de char como string
	       } 
	       else {
	    	   for (int i = index; i < conjunto.length; i++) {
	             swap(conjunto, index, i);
	             gerarPermutações(conjunto, index + 1);
	             swap(conjunto, index, i);
	           }
	       }
	   }

	   private static void swap(char[] conjunto, int i, int j) { 
	       char temp = conjunto[i];
	       conjunto[i] = conjunto[j];
	       conjunto[j] = temp;
	   }
}
