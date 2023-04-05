import java.util.ArrayList;
import java.util.Scanner;

public class Questão9 {
/* 9) Faça um programa para gerar todas as permutações de um conjunto de
caracteres (por exemplo, "ABC" pode gerar "ABC", "ACB", "BAC",
"BCA", "CAB" e "CBA"). */
	public static void main(String[] args) {
		System.out.println("Escreva seu conjunto de caracteres:");
		Scanner leitor = new Scanner(System.in);
		int i;
		int numero= 3;
		ArrayList<Character> lista = new ArrayList<Character>();
		for( i=0;i<numero;i++) {
			System.out.println("Escreva o caractere "+ i + ": ");
			lista.add(leitor.next().charAt(0));
		}
		
		for(int j=0;j<lista.size();j++) {
			System.out.print(lista.get(j));       
		}
		char u;
		System.out.println("Permutações possíveis:");
		for(int j=0;j<lista.size()*2;j++) {
			for(int k=0;j<lista.size();k++) {
				System.out.print(lista.get(k));
			}
			u=lista.get(0);
			
		}
		leitor.close();
	}

}
import java.util.Arrays;

public class PermutationGenerator {
    
    public static void main(String[] args) {
        String input = "ABC";
        generatePermutations(input.toCharArray(), 0);
    }

    private static void generatePermutations(char[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(String.valueOf(arr));
        } else {
            for (int i = index; i < arr.length; i++) {
                swap(arr, index, i);
                generatePermutations(arr, index + 1);
                swap(arr, index, i);
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
