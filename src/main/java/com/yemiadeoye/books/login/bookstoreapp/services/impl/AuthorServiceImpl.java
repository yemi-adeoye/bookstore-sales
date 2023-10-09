package com.yemiadeoye.books.login.bookstoreapp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.yemiadeoye.books.login.bookstoreapp.models.Author;
import com.yemiadeoye.books.login.bookstoreapp.models.Book;
import com.yemiadeoye.books.login.bookstoreapp.repositories.AuthorRepository;
import com.yemiadeoye.books.login.bookstoreapp.services.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService{

    private AuthorRepository authorRepository;


    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getAllAuthors() {
        return this.authorRepository.findAll();
    }

    @Override
    public Author createAuthor(Author author) {
        return this.authorRepository.save(author);
    }

    public Optional<Author> getOne(long authorId) {
        return this.authorRepository.findById(authorId);
    }
    
}
