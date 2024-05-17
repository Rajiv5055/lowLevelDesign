package DesignPatterns.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookLibrary implements Aggregator{
    List<Book> bookList;

    BookLibrary(List<Book> bookList){
        this.bookList = bookList;
    }
    @Override
    public Iterator creatorIterator() {
        return new BookIterator(bookList);
    }
}
