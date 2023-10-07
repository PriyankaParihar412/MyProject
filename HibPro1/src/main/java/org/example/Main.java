package org.example;

import org.example.dao.BooksDAO;
import org.example.modals.Books;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Books book2 = BooksDAO.getBook(12);
        System.out.println(book2);

    }
}