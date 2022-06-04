package com.oritencao.objeto.exercicio02;

import java.util.Scanner;

public class testEmpregado {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de um fucionário (nome, salário_ bruto e
		 * imposto). Em seguida, aumentar o salário do fucionario com base em uma
		 * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e
		 * mostrar novamete os dados do fucionário. Use a classe projetada abaixo.
		 */
		Scanner in = new Scanner(System.in);
		Empregado testEmpregado = new Empregado();

		System.out.print("Digite o nome: ");
		testEmpregado.nome = in.nextLine();

		System.out.print("Digite o salario bruto: ");
		testEmpregado.salario_bruto = in.nextDouble();

		System.out.print("Digite o imposto: ");
		testEmpregado.imposto = in.nextDouble();

		testEmpregado.SalarioMinimo();
		testEmpregado.DescontoSalarial();
		
		System.out.printf("O salario liquido é R$%.2f\n",testEmpregado.SalarioMinimo());
		System.out.printf("O desconto é de R$%.2f\n",testEmpregado.DescontoSalarial());
		System.out.printf("O aumento foi de R$%.2f\n",testEmpregado.Incremento_Salarial(15));
		in.close();

	}

}
