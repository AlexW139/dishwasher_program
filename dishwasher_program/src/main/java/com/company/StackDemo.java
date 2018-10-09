package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class StackDemo {
    public static void main(String args[]) {
        String choice;

        Stack array = new Stack(10);

        do {
            System.out.println("Enter the option you would like from the following - 'add','get','check','clean','help','exit' ... : ");
            Scanner scan = new Scanner(System.in);

            choice = AcceptedCommands.acceptCommand(scan.nextLine());

            switch (choice) {
                case "add":
                    System.out.println("Please enter the number of plates you would like to add to the washer: ");
                    int plts_in = UserInput.userInput();
                    try {
                        for (int i = 1; i < plts_in + 1; i++) {
                            array.push("dirty");
                        }
                        System.out.println("You have stored " + array.tos + " plates.");
                    } catch (StackFullException exc) {
                        System.out.println(exc);
                    }
                    break;

                case "get":
                    System.out.println("Please enter the number of plates that you would like to remove from the washer: ");
                    int plts_out = UserInput.userInput();
                    try {
                        for (int i = 0; i < plts_out; i++) {
                            array.pop();
                        }
                        System.out.println("Current number of plates stored is " + array.tos + " plates.");
                    } catch (StackEmptyException exc) {
                        System.out.println(exc);
                    }
                    break;

                case "check":
                    // Check the current stack
                    System.out.println("The current contents of the stack is: ");
                    for (int i = 0; i < array.getLength() - 1; i++) {
                        System.out.print(array.getEntry(i) + ", ");
                    }
                    System.out.println(array.getEntry(array.getLength() - 1));
                    break;

                case "clean":
                    // Clean any plates that are currently in the washer
                    for (int i = 0; i < array.getLength(); i++) {
                        if (array.getEntry(i).equals("empty")) {
                            break;
                        } else array.setEntry(i, "clean");
                    } break;

                case "help":
                    // Display information on the acceptable commands
                    System.out.println("The following commands are available for use:\n");
                    System.out.println("\t'add' - Use to add an integer number of plates to the stack.");
                    System.out.println("\t'get' - Use to remove an integer number of plates from the stack.");
                    System.out.println("\t'check' - Use to display the current contents of the stack.");
                    System.out.println("\t'clean' - Use to clean plates that are currently in the stack.");
                    System.out.println("\t'exit' - Use to exit the program.");
                    System.out.println("");
                    break;

            }
        } while (!choice.equals("exit"));
    }
}
