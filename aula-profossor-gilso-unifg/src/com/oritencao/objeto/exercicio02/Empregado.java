package com.oritencao.objeto.exercicio02;

public class Empregado {
	String nome;
	double salario_bruto;
	double imposto;

	public double SalarioMinimo() {
		return (salario_bruto * imposto / 100) - salario_bruto;
	}

	public double DescontoSalarial() {
		return (salario_bruto * imposto / 100);

	}

	public double Incremento_Salarial(double porcentagem) {
		double GratificacaoSalarial = SalarioMinimo() * (porcentagem / 100) + SalarioMinimo();
		return GratificacaoSalarial;
	}

}
