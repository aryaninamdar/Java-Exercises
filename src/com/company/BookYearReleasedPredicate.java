package com.company;

public class BookYearReleasedPredicate implements BookPredicate{
    public boolean test(Book b) {
        return b.getYearReleased() > 2000;
    }
}
