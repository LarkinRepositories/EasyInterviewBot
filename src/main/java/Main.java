import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class Main {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        Bot easyInterviewBot = new Bot();
        try {
            telegramBotsApi.registerBot(easyInterviewBot);
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }

    }
}
