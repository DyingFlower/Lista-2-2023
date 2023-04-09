public class Questão8 {
	/*8) Escreva um programa que utilize uma estrutura para determinar se uma
expressão matemática contendo parênteses, colchetes e chaves está
bem formada (ou seja, se cada símbolo de abertura tem um símbolo de
fechamento correspondente). */
	public class Main
	{
	    public static void main(String[] args) {
	        int somaparagrafo = 0;
	        int somacolchete = 0;
	        int somachave = 0;
	        boolean resultado = true;
	        String eq = "(a+b)*{a*b}"; // equação certa

	        for(int i = 0;i<eq.length();i++){
	            if (eq.charAt(i)== '(' || eq.charAt(i)==')'){
	                somaparagrafo+=1;
	            }
	            if (eq.charAt(i)== '[' || eq.charAt(i)==']'){
	                somacolchete+=1;
	            }
	            if (eq.charAt(i)== '{' || eq.charAt(i)=='}'){
	                somachave+=1;
	            }
	        }
	        if (somaparagrafo%2==0 & somacolchete%2==0 & somachave%2==0){
	            resultado = true;
	        }
	        else{
	            resultado = false;
	        }
	        if (resultado == true){
	            if (eq.contains("(")){
	                if (eq.indexOf('(')>eq.indexOf(')')){
	                    resultado=false;
	                }
	            }
	            if (eq.contains("[")){
	                if (eq.indexOf('[')>eq.indexOf(']')){
	                    resultado=false;
	                }
	            }
	            if (eq.contains("{")){
	                if (eq.indexOf('{')>eq.indexOf('}')){
	                    resultado=false;
	                }
	            }
	        }
	        System.out.println(resultado);
	    }
	}
}
