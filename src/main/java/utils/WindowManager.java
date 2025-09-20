package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;
    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }
    public void goBack(){
        navigate.back();
    }
    public void refresh(){
        navigate.refresh();
    }
    public void goForward(){
        navigate.forward();
    }
    public void goTo(String url){
        navigate.to(url);
    }
    public void switchToTab(String tabTitle){
        var Windows = driver.getWindowHandles();
        System.out.println("Number of windows:"+Windows.size());
        System.out.println("Window Handles:");
        Windows.forEach(System.out::println);
        for(String Window : Windows){
            System.out.println("Swtiching to WIndow:"+Window);
            driver.switchTo().window(Window);
            System.out.println("Current Window Title:"+driver.getTitle());
            if(tabTitle.equals(driver.getTitle())){
                    break;
            }
        }
    }
    public void switchToTabWithUrl(String url){
        var Windows = driver.getWindowHandles();
        System.out.println("Number of windows:"+Windows.size());
        System.out.println("Window Handles:");
        Windows.forEach(System.out::println);
        for(String Window : Windows){
            System.out.println("Swtiching to WIndow:"+Window);
            driver.switchTo().window(Window);
            System.out.println("Current Window url:"+driver.getCurrentUrl());
            if(url.equals(driver.getCurrentUrl())){
                    break;
            }
        }
    }
    public String getButton(){
        return driver.findElement(By.id("start")).getText();
    }
}
