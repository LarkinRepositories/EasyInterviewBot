import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
        update.getUpdateId();
        try {
            messageHandling(update);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    private void messageHandling(Update update) throws TelegramApiException {
        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());
        String message = update.getMessage().getText();
        if (message.contains("Привет")) {
            sendMessage.setText("Привет, дружище!");
            execute(sendMessage);
        }

    }

    public String getBotUsername() {
        return "@easyInterviewBot";
    }

    public String getBotToken() {
        return "922870945:AAFL5fBvOIllba2q6hD3WhJf_HoZ3VboqoA";
    }
}
