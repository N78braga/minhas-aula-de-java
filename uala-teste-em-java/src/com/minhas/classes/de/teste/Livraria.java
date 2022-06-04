package com.minhas.classes.de.teste;

public class Livraria {
	private String nome;
	public String descricao;
	private double valor;
	public String isbn;
	public Autor autor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	/*
	 * public void mostrandoLivro() { String mensagem =
	 * "Mostrando detalhes do livro"; System.out.println(mensagem);
	 * System.out.println("nome: " + this.nome); System.out.println("descrição: " +
	 * descricao); System.out.println("valor: " + this.valor);
	 * System.out.println("isbn: " + isbn);
	 * 
	 * 
	 * } public boolean temAtor() { return this.autor != null; }
	 */

}
