package br.com.estudos.operadores;

public class OperadoresAritmeticos2 {

	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		
		//Compila pois devolve um int.
		int i = b + s;
		
		System.out.println("Soma: "+i);
		
		//Compila forçando um casting
		byte b2 = (byte) (i + s);
		System.out.println("Soma 2: "+b2);
		
		//Nao compila pois devolve um int.
		//byte b3 = i + s;
	}
}
