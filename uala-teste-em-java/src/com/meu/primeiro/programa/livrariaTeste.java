package com.meu.primeiro.programa;

//import com.minhas.classes.de.teste.Autor;
import com.minhas.classes.de.teste.Livraria;

public class livrariaTeste {

	public static void main(String[] args) {
		Livraria livro = new Livraria();

		/*
		 * livro.nome = "java 8 pratico"; livro.descricao =
		 * "Novos recursos da linguagem"; livro.valor = 59.90; livro.isbn =
		 * "978-85-66250-46-6"; Autor autor = new Autor(); autor.nome = "Rodrigo";
		 * autor.email = "rodrigo.turini@caelum.com.br"; autor.cpf = "123.456.789.10";
		 * livro.mostrandoLivro(); autor.mostrandoAutor(); livro.autor = autor;
		 * System.out.printf("O livro %s tem uma %s \n",autor.nome,livro.temAtor());
		 * System.out.println("--------------------------");
		 * 
		 * Livraria outroLivro = new Livraria(); outroLivro.nome =
		 * "Lógica de Programação"; outroLivro.descricao =
		 * "Crie seus primeiro programas"; outroLivro.valor = 59.90; outroLivro.isbn =
		 * "978-85-66250-22-0"; Autor outroAutor = new Autor(); outroAutor.nome =
		 * "Paulo"; outroAutor.email = "Paulo.turini@caelum.com.br"; outroAutor.cpf =
		 * "123.456.789.10"; outroLivro.mostrandoLivro(); outroAutor.mostrandoAutor();
		 */
		livro.getValor();
		livro.setValor(59.90);
		System.out.println();

	}

}
