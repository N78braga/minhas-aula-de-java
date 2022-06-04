package com.uala.de.orientação.objeto.java;
import java.util.ArrayList;
import java.util.Arrays;

public class JavArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] minha_lista_codigo = new String[] {"python","Java", "php","perl","C#","c++"};
		ArrayList<String> lista = new ArrayList<String>(Arrays.asList(minha_lista_codigo));
		
		System.out.println(lista);

	}

}
