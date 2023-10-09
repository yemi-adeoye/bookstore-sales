package com.yemiadeoye.books.login.bookstoreapp.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yemiadeoye.books.login.bookstoreapp.models.Author;
import com.yemiadeoye.books.login.bookstoreapp.models.Book;
import com.yemiadeoye.books.login.bookstoreapp.repositories.BookRespository;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class BookServiceImpl {

    @Autowired
    private BookRespository bookRespository;

    public Book createBook(Book book) {
        return bookRespository.save(book);
    }

    public Optional<Book> getOne(long bookId) {
        return bookRespository.findById(bookId);
    }

    public List<Optional<Book>> getAll(long authorId) {
        return bookRespository.findAllByAuthorId(authorId);
    }
    
}
