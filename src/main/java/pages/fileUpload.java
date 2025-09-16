package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fileUpload {
    private WebDriver driver;
    private By clickUpload = By.id("file-submit");
    private By ChooseFile = By.id("file-upload");
    private By getFileName = By.id("uploaded-files");
    public fileUpload(WebDriver driver){
        this.driver = driver;
    }
    public void clickOnChooseFile(String absolutePath){
        driver.findElement(ChooseFile).sendKeys(absolutePath);
        clickonUpload();
    }
    public void clickonUpload(){
        driver.findElement(clickUpload).click();
    }
    public String getFileName(){
       return driver.findElement(getFileName).getText();
    }

}
