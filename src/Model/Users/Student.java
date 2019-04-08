package Model.Users;

import Model.Book;
import Model.Exceptions.TooManyReservedBooksException;
import Model.Food;

public class Student extends User {

    //---Food
    private Food[][] foodList = new Food[3][7];
    //---Mark
    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    //---Money
    private long Money;

    public void addMoney(long num){
       Money += num;
    }
    public long getMoney() {
        return Money;
    }
    public void setMoney(long money) {
        Money = money;
    }

    //---Books
    private Book[] bookList = new Book[3];
    int bookList_index = 0;

    public void reserve(Book book) throws TooManyReservedBooksException{

        if (bookList_index < 2) {
            bookList[bookList_index] = book;
            bookList[bookList_index].setReserved(true);
            bookList_index++;
        } else {
            throw new TooManyReservedBooksException();
        }
    }
    public void DISreserve(Book book) {
        //TODO
    }
}
