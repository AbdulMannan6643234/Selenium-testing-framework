package utils;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;
public class myWebDriverListener implements WebDriverListener {
    private static final Logger logger = Logger.getLogger(myWebDriverListener.class.getName());
    @Override
    public void afterClick(WebElement element) {
        logger.info("After clicking: " + element);
    }

    @Override
    public void beforeGet(WebDriver driver, String url) {
        logger.info("Navigating to: " + url);
    }
    @Override
    public void onError(Object target, java.lang.reflect.Method method, Object[] args, InvocationTargetException e) {
        logger.log( Level.SEVERE,"Error occurred: " + e.getCause());
    }
}
