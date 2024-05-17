package DesignPatterns.IteratorDesignPattern;

import java.util.List;

public class BookIterator implements Iterator{
    List<Book> bookList ;
    int idx = 0;

    public BookIterator(List<Book> bookList){
        this.bookList = bookList;
    }

    @Override
    public boolean hasNext() {
        if(idx<bookList.size()) return true;
        return false;
    }

    @Override
    public Object next() {
        return bookList.get(idx++);
    }
}
