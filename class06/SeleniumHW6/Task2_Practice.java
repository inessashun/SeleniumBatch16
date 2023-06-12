package class06.SeleniumHW6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Task2_Practice extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
        click on get new user
        print the firstname of user
         */
        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //implicit wait

        //1. click on get new user
        WebElement userBtn = driver.findElement(By.xpath("//button[text()='Get New User']"));
        userBtn.click();
        Thread.sleep(2000);//time for observation

        //2. print the firstname of user
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println("The First name of user : " + firstName.getText());
        Thread.sleep(2000);//time for observation
        driver.quit();



    }
}
