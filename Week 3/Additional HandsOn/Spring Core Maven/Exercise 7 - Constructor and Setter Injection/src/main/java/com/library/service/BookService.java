
package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        System.out.println("BookService initialized via constructor");
        this.bookRepository = bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        System.out.println("Setter injection: BookRepository has been set");
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("BookService: Displaying list of books...");
        bookRepository.fetchBooks();
    }
}
