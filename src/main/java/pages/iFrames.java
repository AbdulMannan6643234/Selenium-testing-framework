package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class iFrames {
    private WebDriver driver;
    private By textArea = By.id("tinymce");
    private By decreaseIndentButton = By.cssSelector("#mceu_12 button");
    public iFrames(WebDriver driver){
        this.driver = driver;
    }
    public void clearTextArea(){
        switchToIframe();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void SetTextArea(String text){
        switchToIframe();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public void decreaseIndentation(){
        switchToIframe();
        driver.findElement(decreaseIndentButton).click();
        switchToMainArea();
    }
    private void switchToIframe(){
        driver.switchTo().frame("mce_0_ifr");
        
    }
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }
    public String getTextFromEditor(){
        switchToIframe();
        String Text = driver.findElement(textArea).getText();
        switchToMainArea();
        return Text;
    }

}
