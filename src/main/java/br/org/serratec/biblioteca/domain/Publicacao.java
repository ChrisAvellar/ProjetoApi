package br.org.serratec.biblioteca.domain;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;


@Embeddable


public class Publicacao {

	@Column(nullable = false)
	@NotBlank(message = "Preencha o nome do autor")
	private String autor;
	
	@Column
	private LocalDate dataPublicacao;
	
	@Column
	private String editora;
	
	public Publicacao(String autor, LocalDate dataPublicacao,
			String editora) {
		super();
		this.autor = autor;
		this.dataPublicacao = dataPublicacao;
		this.editora = editora;
	}

	public Publicacao() {
		
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
	
	
	
}
