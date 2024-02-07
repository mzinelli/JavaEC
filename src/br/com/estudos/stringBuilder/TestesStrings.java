package br.com.estudos.stringBuilder;

public class TestesStrings {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Estudos");
		sb.append(" - ");
		sb.append("Certificação Java. ");
		
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("Java");
		
		//Criando um array de tamanho que será utilizado pelo SB.
		StringBuffer sb3 = new StringBuffer(50);
		StringBuffer sb4 = new StringBuffer(sb2);
		
		System.out.println("StringBuffer 2: "+sb2);
		System.out.println("StringBuffer 3: "+sb3);
		System.out.println("StringBuffer 4: "+sb4);
		
		System.out.println(sb3);
		System.out.println(sb3.length());
	}
}
