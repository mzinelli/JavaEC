package br.com.estudos.operadores;

public class OperadoresComparacao {

	public static void main(String[] args) {
		
		System.out.println(1 == 1); //true
		System.out.println(1 != 1); //false
		System.out.println(2 < 1); //false
		System.out.println(2 > 1); //true
		System.out.println(1 >= 1); //true
		System.out.println(2 <= 1); //false
		
		
		System.out.println("-------------------------------");
		//Comparação com o valor, independente do tipo;
		
		System.out.println( 1 == 1.0); //true
		
		System.out.println( 1 == 1); //true
		
		System.out.println( 1.0f == 1.0d); //true
		 
		System.out.println( 1.0f == 1l); //true

		System.out.println("-------------------------------");

		System.out.println('a' > 1); //true, a tem valor numérico.
	}
}
