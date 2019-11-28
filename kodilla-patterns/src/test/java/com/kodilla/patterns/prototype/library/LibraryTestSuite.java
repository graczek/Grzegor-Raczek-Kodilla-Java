package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() throws Exception {

        //Given
        Library library = new Library("My library");
        Book book1 = new Book("Wiedźmak 1", "Andżej1", LocalDate.of(1991, 1, 2));
        Book book2 = new Book("Wiedźmak 2", "Andżej2", LocalDate.of(1992, 10, 3));
        Book book3 = new Book("Wiedźmak 3", "Andżej3", LocalDate.of(1993, 5, 4));
        Book book4 = new Book("Wiedźmak 4", "Andżej4", LocalDate.of(1994, 7, 5));
        //When
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book4);
        library.getBooks().add(book3);

        Library clonedLibrary = null;

        clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("Not mine library");

        Library deepClonedLibrary = null;
        deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("Somebody else's library");


        library.getBooks().remove(book1);
        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}
