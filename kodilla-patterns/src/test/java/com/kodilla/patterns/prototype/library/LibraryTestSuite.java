package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    void testGetBooks(){
        //given
        Library library = new Library("Miejska");
        Book book1 = new Book("Harry Potter","Rowling", LocalDate.of(1996,12,31));
        library.getBooks().add(book1);
        library.getBooks().add(new Book("Solaris","Lem", LocalDate.of(1975,11,11)));
        library.getBooks().add(new Book("Da Vinci Code","Brown", LocalDate.of(2000,10,22)));
        library.getBooks().add(new Book("Burza","King", LocalDate.of(1988,3,1)));

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowClone();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepClonedLibrary1 = null;
        try {
            deepClonedLibrary1 = library.deepClone();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        Library deepClonedLibrary2 = null;
        try {
            deepClonedLibrary2 = library.deepClone();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //when
        shallowClonedLibrary.getBooks().remove(book1);
        deepClonedLibrary2.getBooks().removeAll(deepClonedLibrary2.getBooks());
        deepClonedLibrary1.getBooks().add(new Book("Cesarz","Kapusciński",LocalDate.of(1973,2,2)));
        //then
        Assertions.assertEquals(3,library.getBooks().size());
        Assertions.assertEquals(0,deepClonedLibrary2.getBooks().size());
        Assertions.assertEquals(5,deepClonedLibrary1.getBooks().size());
        Assertions.assertEquals(library.getBooks().size(),shallowClonedLibrary.getBooks().size());
        Assertions.assertNotEquals(library.getBooks().size(),deepClonedLibrary1.getBooks().size());

    }
}
