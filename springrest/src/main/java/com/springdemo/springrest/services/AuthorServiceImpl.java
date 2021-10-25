package com.springdemo.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springdemo.springrest.entities.Author;

@Service
public class AuthorServiceImpl implements AuthorService {

	List<Author> list;
	
	public AuthorServiceImpl() {
		list = new ArrayList<>();
		list.add(new Author(101,"Aditya"));
		list.add(new Author(102,"Ronald"));
	}
	@Override
	public List<Author> getAuthors() {
		return list;
	}
	@Override
	public Author getAuthor(int authorId) {
		Author a=null;
		for(Author auth:list) {
			if(auth.getId() == authorId) {
				a=auth;
				break;
			}
		}
		return a;
	}
	@Override
	public Author addAuthor(Author author) {
		list.add(author);
		return author;
	}
	
	@Override
	public Author updateAuthor(Author author) {
		list.forEach(a->{
			if(a.getId()==author.getId()) {
				a.setName(author.getName());
			}
		});
		return author;
	}
	@Override
	public void deleteAuthor(int authorId) {
		
		list=list.stream().filter(a->a.getId()!=authorId).collect(Collectors.toList());
		System.out.println("Successfully deleted author");
	}

}
