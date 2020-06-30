package com.company;

public class Book {
    private String title;
    private String author;
    private int yearReleased;

    public Book(String title, String author, int yearReleased) {
        this.title = title;
        this.author = author;
        this.yearReleased = yearReleased;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }
}
