package edu.sharif.selab.services;

import edu.sharif.selab.services.EmailMessageService;
import edu.sharif.selab.services.MessageService;
import edu.sharif.selab.services.SmsMessageService;
import edu.sharif.selab.services.TelegramMessageService;

public class MessageServiceFactory {
    public static MessageService createMessageService(int userChoice) {
        return switch (userChoice) {
            case 1 -> new SmsMessageService();
            case 2 -> new EmailMessageService();
            case 3 -> new TelegramMessageService();
            default -> throw new IllegalArgumentException("Invalid user choice");
        };
    }
}

