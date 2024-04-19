package edu.sharif.selab.services;

import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.TelegramMessage;

import java.util.regex.Pattern;

public class TelegramMessageService implements MessageService{
    @Override
    public void sendMessage(Message message) {
        if (message instanceof TelegramMessage) {
            TelegramMessage telegramMessage = (TelegramMessage) message;
            // Send Telegram message logic
            System.out.println("Sending Telegram message from " + telegramMessage.getSourceID() + " to " + telegramMessage.getTargetID() + " with content: " + telegramMessage.getContent());
        } else {
            throw new IllegalArgumentException("Invalid message type");
        }
    }
}
