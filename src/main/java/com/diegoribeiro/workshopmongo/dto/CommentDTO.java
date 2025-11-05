package com.diegoribeiro.workshopmongo.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class CommentDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String text;
	private LocalDate date;
	private AuthorDTO authorDto;
	
	public CommentDTO() {
	}

	public CommentDTO(String text, LocalDate date, AuthorDTO authorDto) {
		super();
		this.text = text;
		this.date = date;
		this.authorDto = authorDto;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public AuthorDTO getAuthorDto() {
		return authorDto;
	}

	public void setAuthorDto(AuthorDTO authorDto) {
		this.authorDto = authorDto;
	}
}
