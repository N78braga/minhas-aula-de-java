package com.exercicio.de.array;

import java.util.ArrayList;
import java.util.Random;

public class CassaPalavras {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("A");
		lista.add("B");
		lista.add("C");
		lista.add("D");
		lista.add("E");
		lista.add("F");
		lista.add("I");
		lista.add("J");
		lista.add("K");
		lista.add("L");
		
		ArrayList<String> lista_vazia = new ArrayList<>();
		Random aleatorio = new Random();
		int posicao = lista.size();
		for(int i = 0; i < 10000; i++) {
			lista_vazia.add(lista.get(aleatorio.nextInt(posicao)));
		}
		for(String x : lista_vazia) {
			System.out.print(x);
		}
	}
	

}
