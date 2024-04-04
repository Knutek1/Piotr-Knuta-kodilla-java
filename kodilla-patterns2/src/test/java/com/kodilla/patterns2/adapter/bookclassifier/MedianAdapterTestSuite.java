package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.BookA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest(){
        //given
        Set<BookA>bookASet = new HashSet<>();
        bookASet.add(new BookA("Author1","Title1",1999,"1111"));
        bookASet.add(new BookA("Author2","Title2",2000,"2222"));
        bookASet.add(new BookA("Author3","Title3",2001,"3333"));
        bookASet.add(new BookA("Author4","Title4",2005,"4444"));
        bookASet.add(new BookA("Author5","Title5",2008,"5555"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //when
        int mediana = medianAdapter.publicationYearMedian(bookASet);
        //then
        Assertions.assertEquals(2001,mediana);

    }
}
