package com.uala.de.orientação.objeto.java;

import java.util.Scanner;

public class TesteLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Lampada lampada = new Lampada();

		System.out.println("Digite [ 1 ] para ligar a lâmpada ou [ 0 ] para desligar\n");
		System.out.println("Entre com o startus da Lâmpada\n");
		lampada.startus = in.nextInt();
		lampada.ligado();
		in.close();

	}

}
