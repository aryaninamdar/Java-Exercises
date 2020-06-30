package com.company;
import java.util.ArrayList;
import java.util.List;

public class BookFilter {
    public List<Book> filter(List<Book> books, BookPredicate bookPredicate) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (bookPredicate.test(book)) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }
}
