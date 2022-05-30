package br.com.caelum;

import java.util.Calendar;

public class Contato {
	private Calendar dataNascimento;
	private String nome, endereco, email;
	private long id;

	public Contato(String nome, String endereco, String email, Calendar dataNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
