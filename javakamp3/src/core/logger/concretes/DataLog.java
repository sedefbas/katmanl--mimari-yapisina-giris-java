package core.logger.concretes;

import core.logger.abstracts.Logger;

public class DataLog implements Logger {

    @Override
    public void Log(String data) {
        System.out.println("veritabanına kaydedildi:" + data);
    }
}
