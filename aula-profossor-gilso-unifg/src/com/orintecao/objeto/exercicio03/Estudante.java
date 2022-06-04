package com.orintecao.objeto.exercicio03;

public class Estudante {
	String nome;
	double nota1;
	double nota2;
	double nota3;

	public double NotaFinal() {
		return (nota1 * 30 + nota2 * 35 + nota3 * 35) / 100;

	}

	public double pontoRestante() {

		return 6 - NotaFinal();

	}

	public void statusAluno() {
		if (NotaFinal() >= 6) {
			System.out.printf("O aluno %s está aprovado.", nome);

		} else {
			System.out.printf("O aluno %s está reprovado.\n", nome);
			System.out.printf("Para o aluno ser aprovado está faltando %.2f ponto(s),\n", pontoRestante());
		}
	}

}
