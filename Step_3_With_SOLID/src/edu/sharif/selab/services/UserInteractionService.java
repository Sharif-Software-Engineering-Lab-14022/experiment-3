package edu.sharif.selab.services;

import java.util.Scanner;

public class UserInteractionService {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getUserChoice() {
        System.out.println("In order to send an SMS message, enter 1");
        System.out.println("In order to send an email message, enter 2");
        System.out.println("In order to send a Telegram message, enter 3");
        System.out.println("In order to exit, enter 0");

        return scanner.nextInt();
    }

    public static String getSource() {
        System.out.print("Enter source: ");
        return scanner.next();
    }

    public static String getTarget() {
        System.out.print("Enter target: ");
        return scanner.next();
    }

    public static String getContent() {
        System.out.println("Write your message: ");
        return scanner.next();
    }
}

