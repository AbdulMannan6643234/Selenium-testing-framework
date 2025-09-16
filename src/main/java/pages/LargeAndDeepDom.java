package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDom {
    private WebDriver driver;
    private By table = By.id("large-table");
    public LargeAndDeepDom(WebDriver driver){
        this.driver = driver;
    }
    public void scrollToTable(){
        WebElement tableElement = driver.findElement(table);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String Script = "arguments[0].scrollIntoView();";
        js.executeScript(Script, tableElement);
    }
}
