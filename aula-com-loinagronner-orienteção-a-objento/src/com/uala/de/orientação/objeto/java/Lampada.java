package com.uala.de.orientação.objeto.java;

public class Lampada {
	String cor;
	String tipo_de_lampada;
	int tensao;
	double preco;
	int startus;
	int potencia;

	public void ligado() {
		if (startus == 1) {
			System.out.println("Ligada");
		}
		if (startus == 0) {
			System.out.println("Desligada");
		} else if (startus > 1) {
			System.out.println("Foi digitado um startus errado por favor digite entre 1 ou 0.");
		}
	}

}
