package com.orintecao.objeto.exercicio01;

import java.util.Scanner;

public class TesteRetangulo {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os valores de largura e altura de um retângulo. E
		 * m seguikda, mostrar na tela o valor de sua área, perimetro e diagonal. Usar
		 * uma classe como mostrado no projeto ao lado.
		 */
		Scanner in = new Scanner(System.in);
		Retangulo tesRetangulo = new Retangulo();
		
		System.out.print("Digite um valor da altura: ");
		tesRetangulo.altura = in.nextDouble();
		
		System.out.print("Digite um valor da largura: ");
		tesRetangulo.largura = in.nextDouble();
		
		tesRetangulo.Area();
		tesRetangulo.Perimetro();
		tesRetangulo.Diagonal();
		
		System.out.println(" ");
		System.out.printf("Área do  retângulo é igual a: %.2f\n", tesRetangulo.Area());
		System.out.printf("O perimetro do retângulo é: %.2f\n", tesRetangulo.Perimetro());
		System.out.printf("A diagonal do retangulo é de %.2f",tesRetangulo.Diagonal() );
		in.close();

	}

}
