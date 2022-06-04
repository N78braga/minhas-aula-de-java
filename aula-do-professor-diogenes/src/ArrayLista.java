import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtd;
		String carro = "", carro1 = "", carro2 = "";
		Scanner in = new Scanner(System.in);
		ArrayList<String> lista_de_carros = new ArrayList<String>();

		System.out.print("Digite a quantidade de carros: ");
		qtd = in.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.print("informe a marca do carro: ");
			lista_de_carros.add(in.next());
			System.out.println(lista_de_carros.add(carro2));
			carro = lista_de_carros.get(0);
			carro1 = lista_de_carros.set(1, "fusca");
			carro2 = lista_de_carros.remove(0);
			lista_de_carros.clear();
		}
		System.out.println(lista_de_carros);
		System.out.println(carro);
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(lista_de_carros);
		in.close();

	}

}
