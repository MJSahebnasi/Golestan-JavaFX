package Model;

import java.util.Vector;

public class Library {
    //TODO
    private Vector<Book> booksList_vctr= new Vector<>(0);

    public void addBook(Book book){
        booksList_vctr.add(book);
    }

}
