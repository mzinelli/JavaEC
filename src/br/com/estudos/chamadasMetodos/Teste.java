package br.com.estudos.chamadasMetodos;

public class Teste {

	
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.setNome("Miguel");
		
		String nome = p.getNome();
		
		System.out.println("Nome da Pessoa definido: "+nome+". ");
	}
}
