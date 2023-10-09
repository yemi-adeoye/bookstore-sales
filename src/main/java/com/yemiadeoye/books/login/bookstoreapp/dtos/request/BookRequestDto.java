package com.yemiadeoye.books.login.bookstoreapp.dtos.request;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookRequestDto {
    private String isbn;
    private String price;
    private Date published;
    private Long authorId;
}
