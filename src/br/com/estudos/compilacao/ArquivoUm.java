package br.com.estudos.compilacao;

public class ArquivoUm {

	static int id = 1;
	
	public static void main(String [] args) {
		
		/*
		 * Analisar pontuação (ponto e vírgula no final das sentenças)
		 * Abaixo compila;
		 */
		
		System.out.println(id);
		id = id + 1;
	}
}
