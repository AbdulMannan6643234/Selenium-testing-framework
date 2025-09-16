package pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Loading {
   private WebDriver driver;
   private By Example1 = By.xpath(".//a[text()='Example 1: Element on page that is hidden']");
   private By Example2 = By.xpath(".//a[text()='Example 2: Element rendered after the fact']");
   private By start = By.cssSelector("#start button");
   private By loading = By.id("loading");
   private By text = By.id("finish");
   public Loading(WebDriver driver){
   this.driver = driver;
   }
   public void clickLink(By e){
    driver.findElement(e).click();
   }
   public void clickExampleOne(){
    clickLink(Example1);
    clickLink(start);
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5) );
    //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
    FluentWait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
    .withTimeout(Duration.ofSeconds(5))
    .pollingEvery(Duration.ofSeconds(1))
    .ignoring(NoSuchElementException.class);
    wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
}
public void clickExampleTwo(){
    clickLink(Example2);
    clickLink(start);
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5) );
    //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
    FluentWait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
    .withTimeout(Duration.ofSeconds(5))
    .pollingEvery(Duration.ofSeconds(1))
    .ignoring(NoSuchElementException.class);
    wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
}
   public String getResponse(){
    return driver.findElement(text).getText();
   }


}
