package com.company;

public class Movie {
    private String name;
    private String rating;
    private int ticketsAvailable;
    private double ticketPrice;

    public Movie(String name, String rating, int ticketsAvailable, double ticketPrice) {
        this.name = name;
        this.rating = rating;
        this.ticketsAvailable = ticketsAvailable;
        this.ticketPrice = ticketPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }

    public void setTicketsAvailable(int ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String toString() {
        return ("Movie Name: " + name + "\nMovie Rating: " + rating + "\nTickets Available: " + ticketsAvailable + "\nTicket Price: " + ticketPrice);
    }

}
