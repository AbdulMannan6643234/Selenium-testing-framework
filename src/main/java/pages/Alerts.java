package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts {
    private WebDriver driver;
    private By clickAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private By clickConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private By clickPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private By Response = By.id("result");
    public Alerts(WebDriver driver){
        this.driver = driver;
    }
    public void clickonAlertButton(){
        driver.findElement(clickAlertButton).click();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText(){
       return driver.switchTo().alert().getText();
    }
    public String getResponse(){
       return driver.findElement(Response).getText();
    }
     public void clickonConfirmButton(){
        driver.findElement(clickConfirmButton).click();
    }
    public void clickonPromptButton(){
        driver.findElement(clickPromptButton).click();
    }
    public void alert_inputText(String text){
        driver.switchTo().alert().sendKeys(text);
    }

}
