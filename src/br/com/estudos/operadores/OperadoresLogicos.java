package br.com.estudos.operadores;

public class OperadoresLogicos {

	
	public static void main(String[] args) {
		
		System.out.println( 1 == 1 & 1 > 2); //false
		
		System.out.println( 1 == 1 | 1 > 2); //true
		
		System.out.println( 1 == 1 ^ 2 > 1); //false
		
		System.out.println(!(1 == 1)); //false
		
		System.out.println("----- Operadores curto circuito && e || ------");
		
		System.out.println(1 != 1 && 1 > 2); //false, o segundo termo não é avaliado 
		
		System.out.println(1 == 1 || 2 > 1); //true, o segundo termo não é avaliado 
		
	}
}
