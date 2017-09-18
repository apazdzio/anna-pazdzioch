package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Library 1");
        library.getBooks().add(new Book("Book1", "Author1", LocalDate.of(1988, 10, 12)));
        library.getBooks().add(new Book("Book2", "Author2", LocalDate.of(1998, 2, 28)));
        library.getBooks().add(new Book("Book3", "Author3", LocalDate.of(2008, 7, 3)));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);

        //When&Then
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), clonedLibrary.getBooks());
    }
}
