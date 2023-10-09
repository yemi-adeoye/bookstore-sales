package com.yemiadeoye.books.login.bookstoreapp.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yemiadeoye.books.login.bookstoreapp.models.Author;
import com.yemiadeoye.books.login.bookstoreapp.services.impl.AuthorServiceImpl;

@RestController
@RequestMapping("/author")
public class AuthorResolver {

    @Autowired
    private AuthorServiceImpl authorServiceImpl;

    @PostMapping("/create")
    public Author inserAuthor(@RequestBody Author author){
        System.out.println(author);
        return authorServiceImpl.createAuthor(author);
    }

    
}
