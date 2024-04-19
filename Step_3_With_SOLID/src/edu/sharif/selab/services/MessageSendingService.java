package edu.sharif.selab.services;

import edu.sharif.selab.models.Message;

public class MessageSendingService {
    public static void sendMessage(MessageService messageService, Message message) {
        messageService.sendMessage(message);
    }
}

