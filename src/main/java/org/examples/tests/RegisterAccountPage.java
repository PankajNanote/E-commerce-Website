package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;

public class RegisterAccountPage {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.id("input-firstname")).sendKeys("Veer");
        driver.findElement(By.id("input-lastname")).sendKeys("Zara");
        driver.findElement(By.id("input-email")).sendKeys("veerza@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("071132456");

        driver.findElement(By.name("password")).sendKeys("test@234");
        driver.findElement(By.name("confirm")).sendKeys("test@234");

//        driver.findElement(By.linkText("login page")).click();
//        if(driver.findElement(By.linkText("Login")).isDisplayed()) {
//            System.out.println("Login link is displayed");
//        }
//        else{
//            System.out.println("Login link is not displayed");
//        }
//        driver.navigate().back();

        driver.findElement(By.partialLinkText("login")).click();
        if(driver.findElement(By.partialLinkText("Log")).isDisplayed()) {
            System.out.println("Login link is displayed");
        }
        else{
            System.out.println("Login link is not displayed");
        }
        driver.navigate().back();
       List<WebElement> buttons = driver.findElements(By.tagName("button"));
       for(WebElement button : buttons){
           System.out.println(button.getText());
       }
    }
}
