package DesignPatterns.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class IteratorMainClass {
    public static void execute(){

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "RD sharma"));
        bookList.add(new Book(2, "Cengage"));
        bookList.add(new Book(3, "Science reference"));

        Aggregator bookLibrary = new BookLibrary(bookList);
        Iterator itr = bookLibrary.creatorIterator();

        while(itr.hasNext()){
            Book current = (Book) itr.next();
            System.out.println(current.getId() + " " + current.getName());
        }

    }
}
