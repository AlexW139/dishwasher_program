package com.company;

public class NegativeInputException extends Exception {

    public String toString() {
        return "\n*** Error: Please enter a positive integer ***\n";
    }
}
