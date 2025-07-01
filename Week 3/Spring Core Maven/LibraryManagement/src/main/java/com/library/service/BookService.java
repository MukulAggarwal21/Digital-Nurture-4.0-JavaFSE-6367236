
// exercise 1
// package com.library.service;

// import com.library.repository.BookRepository;

// public class BookService {
//     private BookRepository bookRepository;

//     public void setBookRepository(BookRepository bookRepository) {
//         this.bookRepository = bookRepository;
//     }

//     public void addBook(String title) {
//         System.out.println("Adding book: " + title);
//         bookRepository.saveBook(title);
//     }
// }


//EXERCISE2
package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for DI
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performAction() {
        System.out.println("BookService: Calling BookRepository...");
        bookRepository.display();
    }
}
