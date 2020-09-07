package com.kodilla.collection.adv.immutable.special.homework;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BookMenager {
    private HashSet<Book> books = new HashSet<>();

    public Book createBook(String title, String author) {
        Book book = new Book(author, title);

        if (books.contains(book)) {
            return book;
        } else {
            books.add(book);
            return book;
        }



    }

}

