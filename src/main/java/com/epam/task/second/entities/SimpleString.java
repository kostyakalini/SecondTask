package com.epam.task.second.entities;

public class SimpleString {
    private String string;

    public SimpleString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public static void main(String[] args) {
        String regex = "\\s[a-zA-Z]{5}\\s";
        String value = "In JavaRush, Diego the best, Diego is Java God".replaceAll(regex, " Amigo ");
        System.out.println(value);
    }
}
