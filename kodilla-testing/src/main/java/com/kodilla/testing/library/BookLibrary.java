package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }
    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList = new ArrayList<Book>();
        Book book1 = new Book("The book title1", "The book author1", 2001);
        Book book2 = new Book("The book title2", "The book author2", 2002);
        bookList.add(book1);
        bookList.add(book2);

        // temporary returning list of two books
        return bookList;
    }
}