package edu.sharif.selab.services;

import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.SmsMessage;

public class SmsMessageService implements MessageService{
    @Override
    public void sendMessage(Message message) {
        if (message instanceof SmsMessage) {
            SmsMessage smsMessage = (SmsMessage) message;
            // Send SMS message logic
            System.out.println("Sending SMS from " + smsMessage.getSourcePhoneNumber() + " to " + smsMessage.getTargetPhoneNumber() + " with content: " + smsMessage.getContent());
        } else {
            throw new IllegalArgumentException("Invalid message type");
        }
    }
}
