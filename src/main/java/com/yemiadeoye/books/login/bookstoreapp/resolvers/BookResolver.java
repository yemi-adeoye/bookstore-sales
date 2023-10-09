package com.yemiadeoye.books.login.bookstoreapp.resolvers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.yemiadeoye.books.login.bookstoreapp.dtos.request.BookRequestDto;
import com.yemiadeoye.books.login.bookstoreapp.models.Author;
import com.yemiadeoye.books.login.bookstoreapp.models.Book;
import com.yemiadeoye.books.login.bookstoreapp.services.impl.AuthorServiceImpl;
import com.yemiadeoye.books.login.bookstoreapp.services.impl.BookServiceImpl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Controller
@AllArgsConstructor
@NoArgsConstructor
public class BookResolver {

    @Autowired
    private BookServiceImpl bookServiceImpl;

    @Autowired
    private AuthorServiceImpl authorServiceImpl;

    @MutationMapping
    public Book insertAuthor(@Argument BookRequestDto bookRequestDto){

        Optional<Author>  author = authorServiceImpl.getOne(bookRequestDto.getAuthorId());

        Book book = new Book();
        book.setAuthor(author.get());
        book.setIsbn(bookRequestDto.getIsbn());
        book.setPrice(bookRequestDto.getPrice());
        book.setPublished(bookRequestDto.getPublished());

        return bookServiceImpl.createBook(book);
    }

    @QueryMapping
    public List<Book> getBooksByAuthorId(@Argument String authorId){

        
        return bookServiceImpl
                .getAll(Long.valueOf(authorId))
                .stream()
                .map(book -> book.get())
                .toList();

        
    }
 
}
