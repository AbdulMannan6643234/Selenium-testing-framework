package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class multipleWindows {
    private WebDriver driver;
    private By clickHere = By.linkText("Click Here");
    public multipleWindows(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickHere(){
        driver.findElement(clickHere).click();
    }
    

}
