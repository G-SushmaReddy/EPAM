package com.epam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DownloadPage {
    By downloadText = By.tagName("h1");
    WebDriver driver;

    DownloadPage(WebDriver driver){
        this.driver = driver;
    }

    public String getDownloadText(){
        return driver.findElement(downloadText).getText();
    }


}
