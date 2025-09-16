package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
public class infiniteScroll {
    private WebDriver driver;
    private By textBlocks = By.className("jscroll-added");
    public infiniteScroll(WebDriver driver){
        this.driver = driver;
    }
    public void scrollToElement(int index){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String Script = "window.scrollTo(0,document.body.scrollHeight);";
        while (getNumberOfElements()<index){
            js.executeScript(Script);
        }
    }
    public int getNumberOfElements(){
        return driver.findElements(textBlocks).size();
    }

}
