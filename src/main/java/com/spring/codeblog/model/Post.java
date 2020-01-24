package com.spring.codeblog.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="TB_POST") // Nome da tabela
public class Post {

	// Atributos da tabela
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Id gerado automaticamente
	private Long id;
	
	// Não permite valores em branco ou nulos
	@NotBlank 
	private String titulo;
	
	// Não permite valores em branco ou nulos
	@NotBlank 
	private String autor;
	
	// Formatação da data usando JsonFormat
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
	private LocalDate data;
	
	// Com essa anotação o banco de dados irá aceitar valores bem grandes e ele irá tratar esse
	// atributo de forma diferente para a performance da aplicação ser melhor
	@Lob
	@NotBlank 
	private String texto;

	// Métodos Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
}
