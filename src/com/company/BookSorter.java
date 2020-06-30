package com.company;
import java.util.ArrayList;
import java.util.List;

public class BookSorter {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("Animal Farm", "George Orwell", 1994);
        Book book2 = new Book("Harry Potter", "JK Rowling", 2005);
        Book book3 = new Book("1984", "George Orwell", 1984);
        Book book4 = new Book("Captain UnderPants", "Dav Pilkey", 2011);
        Book book5 = new Book("Wonder", "RJ Palacio", 2015);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
//      1st Way
        BookFilter bookFilter = new BookFilter();
        List<Book> books2000 = bookFilter.filter(books, new BookYearReleasedPredicate());
        System.out.println(books2000);

//      2nd Way
//        List<Book> books2000 = books.stream()
//                .filter(b -> b.getYearReleased() > 2000)
//                .collect(Collectors.toList());
//        System.out.println(books2000);


    }
}
