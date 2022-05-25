package com.Jeremy.service;

import com.Jeremy.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    // add a book
    int addBook(Books books);

    // delete a book
    int deleteBookById(int id);

    // update a book
    int updateBook(Books books);

    // query a book
    Books queryBookById(int id);

    // query all books
    List<Books> queryAllBook();

}
