package core.logger.concretes;

import core.logger.abstracts.Logger;

public class MailLog implements Logger {

    @Override
    public void Log(String data) {
        System.out.println("maile kaydedildi" + data);
    }
}
