package classes;

import java.util.Scanner;

public class Imc {
	String nome;
	double peso;
	double altura;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	Scanner in = new Scanner(System.in);

	public void enrada() {
		System.out.print("Nome: ");
		nome = in.next();
		System.out.print("Peso: ");
		peso = in.nextDouble();
		System.out.print("Altura: ");
		altura = in.nextDouble();

		in.close();

	}

	public double somaImc() {
		return peso / (Math.pow(altura, 2));
	}

	public void calculoImc() {
		if (somaImc() < 17) {
			System.out.printf("%s \n%.1f kL \n%.1f muito baixo do peso.", nome, peso, somaImc());
		}
		if (somaImc() >= 17 && somaImc() <= 18.49) {
			System.out.printf("%s \n%.1f kL \n%.1f abaixo do peso.", nome, peso, somaImc());
		}
		if (somaImc() >= 18.5 && somaImc() <= 24.99) {
			System.out.printf("%s \n%.1f kL \n%.1f peso normal.", nome, peso, somaImc());
		}
		if (somaImc() >= 25 && somaImc() <= 29.99) {
			System.out.printf("%s \n%.1f kL \n%.1f um pouco acima do peso.", nome, peso, somaImc());
		}
		if (somaImc() >= 30 && somaImc() <= 34.99) {
			System.out.printf("%s \n%.1f kL \n%.1f um pouco obeso.", nome, peso, somaImc());
		}
		if (somaImc() >= 35 && somaImc() <= 39.99) {
			System.out.printf("%s \n%.1f kL \n%.1f obesidade severa.", nome, peso, somaImc());
		}
		if (somaImc() > 40) {
			System.out.printf("%s \n%.1f kL \n%.1f obesidade mórbida.", nome, peso, somaImc());
		}
	}

}
