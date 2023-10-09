package com.yemiadeoye.books.login.bookstoreapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yemiadeoye.books.login.bookstoreapp.models.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{
    
}
