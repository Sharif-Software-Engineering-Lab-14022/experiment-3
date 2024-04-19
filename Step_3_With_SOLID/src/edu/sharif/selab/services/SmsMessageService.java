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

    private boolean validatePhoneNumber(String phoneNumber) {
        // Check if the phone number is exactly 11 characters long
        if (phoneNumber.length() != 11) {
            return false; // Phone number length is not valid
        }

        // Check if the phone number contains only numeric digits
        for (char digit : phoneNumber.toCharArray()) {
            if (!Character.isDigit(digit)) {
                return false; // Phone number contains non-numeric characters
            }
        }

        // If all checks pass, return true (valid phone number)
        return true;
    }
}
