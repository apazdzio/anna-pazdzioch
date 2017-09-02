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
        return libraryUser.getBookList();
    }

    public boolean rentABook(LibraryUser libraryUser, Book book) {
        List<Book> bookList = libraryUser.getBookList();
        boolean result = false;
        if(bookList.size() >=5 || bookList.contains(book)) {
            result = false;
        }else{
            bookList.add(book);
            result = true;
        }
        return result;
    }
}