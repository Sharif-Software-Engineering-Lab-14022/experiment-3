import edu.sharif.selab.models.Message;
import edu.sharif.selab.services.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome to SE Lab Messenger.");

        int userAnswer;
        do {
            userAnswer = UserInteractionService.getUserChoice();
            if (userAnswer == 0) {
                break;
            }

            String source = UserInteractionService.getSource();
            String target = UserInteractionService.getTarget();
            String content = UserInteractionService.getContent();

            try {
                Message message = MessageCreationService.createMessage(userAnswer, source, target, content);
                MessageService messageService = MessageServiceFactory.createMessageService(userAnswer);
                MessageSendingService.sendMessage(messageService, message);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (true);
    }
}


