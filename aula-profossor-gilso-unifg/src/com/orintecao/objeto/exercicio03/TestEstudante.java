package com.orintecao.objeto.exercicio03;

import java.util.Scanner;

public class TestEstudante {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o nome de aluno e as três notas que ele obteve nos
		 * três trimestre do ano (rimeiro trimestre vale 30 e o segundo e terceiro valem
		 * 35 cada). Ao final, mostra qual a nota final do aluno no ano. Dizer também se
		 * o aluno está aprovado o u não e, em caso negativo, quantos pontos falta ara o
		 * aluno obter o mininmo para ser aprovado (que '60% da nota). Você deve criar
		 * uma classe Estudante para resolver este problema.
		 */
		Scanner in = new Scanner(System.in);
		Estudante Estudante = new Estudante();

		System.out.print("Digite o nome do aluno: ");
		Estudante.nome = in.nextLine();

		System.out.print("Entre com a primeira nota: ");
		Estudante.nota1 = in.nextDouble();

		System.out.print("Entre com o segunda nota: ");
		Estudante.nota2 = in.nextDouble();

		System.out.print("Entre com o terceira nota: \n");
		Estudante.nota3 = in.nextDouble();

		Estudante.NotaFinal();
		System.out.printf(" A nota obtida pelo aluno %s foi %.2f ponto(s).\n\n", Estudante.nome, Estudante.NotaFinal());
		Estudante.statusAluno();
		in.close();

	}

}
