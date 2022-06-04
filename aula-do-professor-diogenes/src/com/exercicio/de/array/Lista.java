package com.exercicio.de.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		Scanner in = new Scanner(System.in);

		System.out.println("Digite as cores em sequẽncias: ");
		list_Strings.add(in.next());
		list_Strings.add(in.next());
		list_Strings.add(in.next());
		list_Strings.add(in.next());
		list_Strings.add(in.next());
		System.out.println("");
		System.out.printf("%s, \n", list_Strings);
		System.out.println("Adicione mas duas cores na lista: ");
		list_Strings.add(0, in.next());
		list_Strings.add(5, in.next());
		System.out.printf("%s\n ", list_Strings);
		System.out.println("");
		String elementos = list_Strings.get(0);
		System.out.printf("Primeiro: %s\n", elementos);
		elementos = list_Strings.get(2);
		System.out.printf("Terceiro elemento: %s\n", elementos);
		System.out.println("");
		list_Strings.set(2,in.next());
		System.out.printf("%s \n", list_Strings);
		in.close();

	}

}
