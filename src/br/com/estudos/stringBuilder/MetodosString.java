package br.com.estudos.stringBuilder;

public class MetodosString {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("Olá Miguel").append(" - ").append("Seja bem-vindo!");
		sb.insert(0, "Teste: ");
		
		System.out.println(sb);
		
		//Imprimindo o tamanho do SB.
		System.out.println(sb.length());
		
		//Remover o último caractere contando o índice inicial e final.
		sb.delete(34, 35);
		
		System.out.println(sb);
		
		System.out.println(new StringBuffer("Miguel").reverse());
	}
}
