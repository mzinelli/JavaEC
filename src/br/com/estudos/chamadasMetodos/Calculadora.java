package br.com.estudos.chamadasMetodos;

public class Calculadora {

	public int soma(int... nums) {
		int total = 0;
		
		for(int a: nums) {
			total += a;
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		
		System.out.println(c.soma());
		System.out.println(c.soma(1));
		System.out.println(c.soma(1,2));
		System.out.println(c.soma(1,2,3,4,6));
		
		//Abaixo não compila, pois definição acima apenas int.
		//System.out.println(c.soma(1.12,2,3,4,6));
	}
}
