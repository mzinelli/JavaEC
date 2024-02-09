package br.com.estudos.operadores;

public class OperadoresAritmeticos {

	static int dois = 2;
	static int dez = 10;
	
	public static void main(String[] args) {
		
		int doze = dois + dez;
		System.out.println("Soma: "+doze);
		
		int oito = dez - dois;
		System.out.println("Subtração: "+oito);
		
		int vinte = dois * dez;
		System.out.println("Multiplicação: "+vinte);
		
		int cinco = dez / dois;
		System.out.println("Divisão: "+cinco);
		
		int zero = dez % 2;
		System.out.println("Resto da Div: "+zero);
		
		
		//O resultado é o tipo mais abrangente entre os valores
		int idade = 15;
		long anos = 5;
		
		long daquiCincoAnos = idade + anos;
		System.out.println("Daqui cinco anos: "+daquiCincoAnos);
		
		//Não compila pelo tipo da variável; 
		//int daquiCincoAnos2 = idade + anos;
	}
}
