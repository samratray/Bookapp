package com.bookapp.app.Entity;

import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String description;

	// Getters and setters

	// Relationships
	@ManyToMany(mappedBy = "genres")
	private Set<Book> books;

	public Genre(String name, String description, Set<Book> books) {
		super();
		this.name = name;
		this.description = description;
		this.books = books;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	// Other relationships and fields
}
