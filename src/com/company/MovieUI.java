package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieUI {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        Movie movie1 = new Movie("Avengers: Endgame", "PG-13", 50, 9.99);
        Movie movie2 = new Movie("Secret Life of Pets", "PG", 35, 6.99);
        Movie movie3 = new Movie("Jumanji", "PG-13", 40, 7.99);
        Movie movie4 = new Movie("Venom", "PG-13", 45, 8.99);
        Movie movie5 = new Movie("Up", "G", 25, 5.99);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);

        List<Movie> bookedMovies = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String username = scanner.next();
        System.out.println("Enter your age: ");
        int userage = scanner.nextInt();
        User user = new User(username, userage);
        System.out.println("Hello " + username);
        do {
            System.out.println("1. Book a ticket for a movie\n2. View all booked movies\n3. Exit");
            System.out.println("Select an option: ");
            String choice = scanner.next();
            if (choice.equals("1") || choice.equalsIgnoreCase("book")) {
                System.out.println("1. " + movie1 + "\n2. " + movie2 + "\n3. " + movie3 + "\n4. " + movie4 + "\n5. " + movie5);
                System.out.println("Choose a movie that you want to book a ticket for");
                String movieChoice = scanner.next();
                if (movieChoice.equals("1") || movieChoice.equalsIgnoreCase("avengers") || movieChoice.equalsIgnoreCase("endgame")) {
                    if (user.getAge() < 13) {
                        System.out.println("Movie is not age-suitable for you.");
                    }
                    else {
                        System.out.println("Movie Booked");
                        bookedMovies.add(movie1);
                    }
                }
                else if (movieChoice.equals("2") || movieChoice.equalsIgnoreCase("secret life of pets")) {
                    if (user.getAge() < 10) {
                        System.out.println("Movie is not age-suitable for you.");
                    }
                    else {
                        System.out.println("Movie Booked");
                        bookedMovies.add(movie2);
                    }
                }
                else if (movieChoice.equals("3") || movieChoice.equalsIgnoreCase("jumanji")) {
                    if (user.getAge() < 13) {
                        System.out.println("Movie is not age-suitable for you.");
                    }
                    else {
                        System.out.println("Movie Booked");
                        bookedMovies.add(movie3);
                    }
                }
                else if (movieChoice.equals("4") || movieChoice.equalsIgnoreCase("venom")) {
                    if (user.getAge() < 13) {
                        System.out.println("Movie is not age-suitable for you.");
                    }
                    else {
                        System.out.println("Movie Booked");
                        bookedMovies.add(movie4);
                    }
                }
                else if (movieChoice.equals("5") || movieChoice.equalsIgnoreCase("up")) {
                    System.out.println("Movie Booked");
                    bookedMovies.add(movie5);
                }
                else {
                    System.out.println("Invalid option selected");
                }
            }
            else if (choice.equals("2") || choice.equalsIgnoreCase("view")) {
                System.out.println(bookedMovies);
            }
            else if (choice.equals("3") || choice.equalsIgnoreCase("exit")) {
                System.exit(0);
            }
            else {
                System.out.println("Invalid option selected");
            }
        }
        while (1 < 2);
    }
}
