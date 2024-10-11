package org.example.day9.memory;

public class Book {
    public String title;
    public String author;
    public String isbn;

    public void setTitle(String title) {
        this.title = title;
    };

    public void setAuthor(String author) {
        this.author = author;
    };

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    };

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void displayInfo(){
        System.out.println("Title: " + title +"\n" + "author: " + author +"\n"+"isbn: " + isbn  +"\n" );
    }
}
