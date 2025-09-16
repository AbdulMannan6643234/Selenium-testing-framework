package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Slider {
    private WebDriver driver;
    private By input = By.cssSelector("input[type='range']");
    private By response = By.id("range");
    public Slider(WebDriver driver){
        this.driver = driver;
    }
    public void inputKey(String text){
        driver.findElement(input).sendKeys(text);
    }
    public String response(){
        return driver.findElement(response).getText();
        
    }


}
