package com.yemiadeoye.books.login.bookstoreapp.services;

import java.util.List;

import com.yemiadeoye.books.login.bookstoreapp.models.Author;

public interface AuthorService {

    List<Author> getAllAuthors();

    Author createAuthor(Author author);
}
