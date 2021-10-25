package com.springdemo.springrest.services;
import java.util.List;

import com.springdemo.springrest.entities.*;

public interface AuthorService {
	public List<Author> getAuthors();

	public Author getAuthor(int authorId);

	public Author addAuthor(Author author);

	public Author updateAuthor(Author author);

	public void deleteAuthor(int authorId);
}
