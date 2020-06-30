package com.company;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void ageValidator(User user,Movie movie) {
        switch (movie.getRating()) {
            case "G":
                System.out.println("Movie Booked!");
                break;
            case "PG":
                if (user.getAge() < 10) {
                    System.out.println("Movie is not age-suitable for you.");
                }
                else {
                    System.out.println("Movie Booked!");
                }
                break;
            case "PG-13":
                if (user.getAge() < 13) {
                    System.out.println("Movie is not age-suitable for you.");
                }
                else {
                    System.out.println("Movie Booked");
                }
                break;
            case "R":
                if (user.getAge() < 18) {
                    System.out.println("Movie is not age-suitable for you.");
                }
                else {
                    System.out.println("Movie Booked");
                }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
