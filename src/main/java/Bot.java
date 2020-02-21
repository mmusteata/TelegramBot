import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;


public class Bot extends TelegramLongPollingBot {


    /**
     * Method for receiving messages.
     *
     * @param update contain message from user.
     */

    @Override
    public void onUpdateReceived(Update update) {

        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variables
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            SendMessage message = new SendMessage() // Create a message object object
                    .setChatId(chat_id)
                    .setText(message_text);
        }
    }

    /**
     * Method return bot username, which was set at registration.
     *
     * @return bot username
     */

    @Override
    public String getBotUsername() {
        return "MyHelperNotificationbot";
    }

    /**
     * Method return bot's token for communication with Telegram server
     *
     * @return token for bot
     */

    @Override
    public String getBotToken() {
        return "933877450:AAELtutyrU9uDgQP0ETldF3ybCQ52I3-RXQ";
    }

}
