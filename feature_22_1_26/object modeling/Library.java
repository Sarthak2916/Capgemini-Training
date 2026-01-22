package feature_22_1_26.object_modeling;

import java.util.ArrayList;

public class Library {

    String libraryName;
    ArrayList<Book> books;

    Library(String libraryName){
        this.libraryName= libraryName;
        books= new ArrayList<>();
    }

    void addBook(Book book){
        if(book!=null) books.add(book);
        else System.out.println("Book is empty");
    }
    void displayBooks(){
        System.out.println("Library: "+libraryName);
        if(books.isEmpty()) System.out.println("No Books Available");
        else for (Book b: books){
            b.displayBook();
        }
    }

}
class Book{

    String title;
    String author;

    Book(String title, String author){
        this.title= title;
        this.author= author;
    }

    void displayBook(){
        System.out.println("Title: "+title+" | Author: "+author);
    }
}
