package com.company;

public class BookAuthorPredicate implements BookPredicate {
    public  boolean test(Book b) {
        return b.getAuthor().equals("George Orwell");
    }
}
