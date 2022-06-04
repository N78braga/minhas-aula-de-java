package com.minhas.classes.de.teste;

public class Autor {
	public String nome;
	public String email;
	public String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void mostrandoAutor() {
		System.out.println("Mostrando detalhe do autor ");
		System.out.printf("Nome: %s\n", this.nome);
		System.out.printf("email: %s\n", email);
		System.out.printf("CPF: %s\n", cpf);
	}

}
