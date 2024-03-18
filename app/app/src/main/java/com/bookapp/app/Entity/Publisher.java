package com.bookapp.app.Entity;

import java.util.Set;

import jakarta.persistence.*;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String address;
	private String contactInformation;

	public Publisher(String name, String address, String contactInformation, Set<Book> books) {
		super();
		this.name = name;
		this.address = address;
		this.contactInformation = contactInformation;
		this.books = books;
	}

	// Getters and setters

	// Relationships
	@OneToMany(mappedBy = "publisher")
	private Set<Book> books;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	// Other relationships and fields
}
