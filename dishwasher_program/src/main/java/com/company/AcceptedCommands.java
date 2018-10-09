package com.company;

import java.util.Arrays;

public class AcceptedCommands {
    public static String acceptCommand(String received) {
        String[] commandWords = {"add", "get", "check", "clean", "help", "exit"};

        if(Arrays.asList(commandWords).contains(received)) {
            return received;
        } else System.out.println("\n*** Error: Please input one the following commands: 'add','get','check','clean','help','exit' ***\n");
        return "";
    }
}