package br.com.estudos.compilacao;

public class ArquivoTres {

	static int x = 15;
	
	public static void main(String[] x) {
		
		/*
		 * Este código não compila, pois há um shadowing,
		 * Tentando atribuir um int a um array de string.
		 */
		
		x = 200;
		System.out.println(x);
	}
}
