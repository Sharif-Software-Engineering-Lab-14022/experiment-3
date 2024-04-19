package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.Message;

import java.util.regex.Pattern;

public class EmailMessageService implements MessageService{
    @Override
    public void sendMessage(Message message) {
        if (message instanceof EmailMessage) {
            EmailMessage emailMessage = (EmailMessage) message;
            // Send email message logic
            System.out.println("Sending email from " + emailMessage.getSourceEmailAddress() + " to " + emailMessage.getTargetEmailAddress() + " with content: " + emailMessage.getContent());
        } else {
            throw new IllegalArgumentException("Invalid message type");
        }
    }
}
