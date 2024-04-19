package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

public class MessageCreationService {
    public static Message createMessage(int userChoice, String source, String target, String content) {
        return switch (userChoice) {
            case 1 -> createSmsMessage(source, target, content);
            case 2 -> createEmailMessage(source, target, content);
            case 3 -> createTelegramMessage(source, target, content);
            default -> throw new IllegalArgumentException("Invalid user choice");
        };
    }

    private static Message createSmsMessage(String source, String target, String content) {
        validatePhoneNumber(source);
        validatePhoneNumber(target);

        SmsMessage smsMessage = new SmsMessage();
        smsMessage.setSourcePhoneNumber(source);
        smsMessage.setTargetPhoneNumber(target);
        smsMessage.setContent(content);
        return smsMessage;
    }

    private static Message createEmailMessage(String source, String target, String content) {
        validateEmailAddress(source);
        validateEmailAddress(target);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setSourceEmailAddress(source);
        emailMessage.setTargetEmailAddress(target);
        emailMessage.setContent(content);
        return emailMessage;
    }

    private static Message createTelegramMessage(String source, String target, String content) {
        validateTelegramID(source);
        validateTelegramID(target);

        TelegramMessage telegramMessage = new TelegramMessage();
        telegramMessage.setSourceID(source);
        telegramMessage.setTargetID(target);
        telegramMessage.setContent(content);
        return telegramMessage;
    }

    private static void validatePhoneNumber(String phoneNumber) {
        if (!phoneNumber.matches("\\d{11}")) {
            throw new IllegalArgumentException("Invalid phone number format");
        }
    }

    private static void validateEmailAddress(String email) {
        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            throw new IllegalArgumentException("Invalid email address format");
        }
    }

    private static void validateTelegramID(String telegramID) {
        if (!telegramID.matches("@[a-zA-Z0-9_-]{3,15}")) {
            throw new IllegalArgumentException("Invalid Telegram ID format");
        }
    }
}


