package com.company;

public class DataUser {
    private String name;
    private int callMinutes;
    private int textMinutes;
    private double gbUsed;

    public DataUser(String name, int callMinutes, int textMinutes, double gbUsed) {
        this.name = name;
        this.callMinutes = callMinutes;
        this.textMinutes = textMinutes;
        this.gbUsed = gbUsed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCallMinutes() {
        return callMinutes;
    }

    public void setCallMinutes(int callMinutes) {
        this.callMinutes = callMinutes;
    }

    public int getTextMinutes() {
        return textMinutes;
    }

    public void setTextMinutes(int textMinutes) {
        this.textMinutes = textMinutes;
    }

    public double getGbUsed() {
        return gbUsed;
    }

    public void setGbUsed(double gbUsed) {
        this.gbUsed = gbUsed;
    }
    public String toString() {
        return ("Name: " + name + "\nCall Minutes: " + callMinutes + "\nTest Minutes: " + textMinutes + "\nGB Used:" + gbUsed);
    }
}
