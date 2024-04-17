package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

import java.util.regex.Pattern;

public class TelegramMessageService implements MessageService{
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        //Empty Body
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        //Empty Body!
    }

    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        if(validateID(telegramMessage.getSourceID()) && validateID(telegramMessage.getTargetID())){
            System.out.println("Sending a telegram message from " + telegramMessage.getSourceID() + " to " + telegramMessage.getTargetID() + " with content : " + telegramMessage.getContent());
        }else{
            throw new IllegalArgumentException("Telegram ID is Not Correct!");
        }
    }

    public boolean validateID(String ID) {
        // Regular expression pattern for validating email addresses
        String IDRegex = "^@[a-z0-9_-]{3,15}$";

        // Compile the pattern into a regex Pattern object
        Pattern pattern = Pattern.compile(IDRegex);

        // Check if the email string matches the regex pattern
        return pattern.matcher(ID).matches();
    }
}
