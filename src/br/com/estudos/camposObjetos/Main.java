package br.com.estudos.camposObjetos;

public class Main {
	
	public static void main(String[] args) {
		Carro a = new Carro();
		
		//Ambas atribuições abaixo estão corretas.
		//Semper optar pelo uso de getters e setters.
		
		a.modelo = "Palio";
		a.setModelo("Palio");
			
		System.out.println(a.getDadosDeImpressao());
	}
}
