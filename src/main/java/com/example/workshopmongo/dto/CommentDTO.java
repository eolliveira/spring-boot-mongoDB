package com.example.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String coment;
	private Date date;
	private AuthorDTO author;

	public CommentDTO() {

	}

	public CommentDTO(String coment, Date date, AuthorDTO author) {
		super();
		this.coment = coment;
		this.date = date;
		this.author = author;
	}

	public String getComent() {
		return coment;
	}

	public void setComent(String coment) {
		this.coment = coment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}

}
