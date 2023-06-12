package class06.SeleniumHW6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1_Practice extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
        click on start
        print the text  "welcome syntax technologies "on console (edited)
         */
        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //1. click on start
        WebElement btn1 = driver.findElement(By.xpath("//button[@id='startButton']"));
        btn1.click();
        Thread.sleep(2000);//time for observation

        //2. print the text  "welcome syntax technologies "on console
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        wait.until(ExpectedConditions.textToBePresentInElement(text,"Welcome Syntax Technologies"));
        System.out.println("THe displayed message is: " + text.getText());
        Thread.sleep(2000); //time for observation
        driver.quit();

    }
}
