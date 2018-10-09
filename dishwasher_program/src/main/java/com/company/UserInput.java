package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static int userInput() {
        try {
            Scanner keyboard = new Scanner(System.in);
            int input = keyboard.nextInt();
            if(input < 0) throw new NegativeInputException();
            return input;
        } catch (NegativeInputException exc) {
            System.out.println(exc);
        } catch (InputMismatchException exc) {
            System.out.println("\n*** Error: Please enter a positive integer ***\n");
        } return 0;
    }

}
