package utils;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogConfig {
    public static void configure(){
        try {
            FileHandler fh = new FileHandler("resources/logs/automation.log",true);
            fh.setFormatter(new SimpleFormatter());
            Logger logger = Logger.getLogger("");
            logger.addHandler(fh);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
