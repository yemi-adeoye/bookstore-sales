package com.yemiadeoye.books.login.bookstoreapp.services;

import java.util.List;
import java.util.Optional;

import com.yemiadeoye.books.login.bookstoreapp.models.Book;

public interface BookService {

    List<Book> getAllBooks();

    Book createBook(Book book);

    Optional<Book> getOne(long authorId);
}
