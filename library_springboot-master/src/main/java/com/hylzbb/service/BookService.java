package com.hylzbb.service;

import com.hylzbb.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getBookList(String bookName, String bookID);

    Book findById(String bookID);

    int updateBook(Book book);

    int deleteBook(String bookID);

    int addBook(Book book);

    int returnBook(String bookID);

    int check(String bookID);


}
