package com.yemiadeoye.books.login.bookstoreapp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yemiadeoye.books.login.bookstoreapp.models.Book;

public interface BookRespository extends JpaRepository<Book, Long>{

    List<Optional<Book>> findAllByAuthorId(long authorId);
    
}
