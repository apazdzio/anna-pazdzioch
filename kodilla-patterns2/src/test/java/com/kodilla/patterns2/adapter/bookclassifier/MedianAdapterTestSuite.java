package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1", "Book1", 1990,"123456"));
        bookSet.add(new Book("Author2", "Book2", 1995,"124556"));
        bookSet.add(new Book("Author3", "Book3", 2008,"1456"));
        bookSet.add(new Book("Author4", "Book4", 2004,"123456"));
        bookSet.add(new Book("Author5", "Book5", 2009,"456456"));
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(2004, median);
    }
}
