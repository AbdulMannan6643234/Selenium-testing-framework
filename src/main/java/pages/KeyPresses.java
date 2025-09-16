package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class KeyPresses {
    private WebDriver driver;
    private By textbox = By.id("target");
    private By result = By.id("result");
    public KeyPresses(WebDriver driver){
        this.driver = driver;
    }
    public void typeText(String text){
        driver.findElement(textbox).sendKeys(text);
    }
    public String getResponse(){
       return driver.findElement(result).getText();
    }
    public void enterat(){
        typeText(Keys.chord(Keys.SHIFT, "2") + "=@");
    }
}   
