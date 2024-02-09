package br.com.estudos.operadores;

public class OperadoresDecisao {

	public static boolean metodo(String msg) {
		System.out.println(msg);
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println( 1 == 2 & metodo("oi"));
		
		System.out.println( 1 == 2 & metodo("tchau"));
		
		int i = 10;
		
		System.out.println(i == 2 & i++ == 0);
		//Imprime false e soma mesmo assim.
		System.out.println(i);
		
		int j = 10;
		System.out.println( j == 2 && j++ == 0);
		//Imprime false e não soam
		System.out.println(j);
	}
}
