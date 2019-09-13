import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {

    }

    public String getBotUsername() {
        return "@easyInterviewBot";
    }

    public String getBotToken() {
        return "922870945:AAFL5fBvOIllba2q6hD3WhJf_HoZ3VboqoA";
    }
}
