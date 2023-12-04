package br.com.estudos.tiposDados;

class ExercicioCinco {

	public static void main(String[] args) {
		A x = new A();
		A y = x;
		y.v++;
		x.v++;
		A z = y;
		z.v--;
		System.out.println(x.v + y.v + z.v);
	}
}

class A {

	int v = 15;
}
