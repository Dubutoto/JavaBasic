package org.example.day9.chracterFile;

import org.example.day9.memory.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i= 0; i<2; i++){
            Book book = new Book();//새 Book 객체를 생성하는 것이므로 for 문 안에 넣어줘야함.
            System.out.println("Register the title");
            book.setTitle(scanner.nextLine());
            System.out.println("Register the author");
            book.setAuthor(scanner.nextLine());
            System.out.println("Register the ISBN");
            book.setIsbn(scanner.nextLine());
            bookList.add(book);
            System.out.println("Book Registered Successfully");
        }

        System.out.println("Displaying book list: ");
        if(bookList.isEmpty()){
            System.out.println("Book list is empty");
        }else {
            for (Book b : bookList) {
                b.displayInfo();  // 각 Book 객체의 정보 출력
            }
        }
    }
}
