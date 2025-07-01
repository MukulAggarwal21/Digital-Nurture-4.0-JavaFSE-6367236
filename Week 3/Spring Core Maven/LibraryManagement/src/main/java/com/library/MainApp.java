
//EXERCISE1
// package com.library;

// import com.library.service.BookService;
// import org.springframework.context.ApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

// public class MainApp {
//     public static void main(String[] args) {
//         ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//         BookService bookService = (BookService) context.getBean("bookService");
//         bookService.addBook("Effective Java");
//     }
// }


//EXERCISE 2
package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.performAction();
    }
}
