package class05.SeleniumHW5;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1_Practice extends CommonMethods {
    public static void main(String[] args) throws InterruptedException{
        /*
        http://practice.syntaxtechs.net/javascript-alert-box-demo.php
        click on the last alert
        send keys and accept it
         */
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser= "chrome";
        openBrowserAndLaunchApplication(url,browser);
        Thread.sleep(2000);

        //1. click on the last alert
        WebElement alert3Btn = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        Thread.sleep(2000); //time for observation
        alert3Btn.click();

        //2. send keys and accept it
        Alert confirmationAlert3 = driver.switchTo().alert();
        confirmationAlert3.sendKeys("KeysToAccept");
        Thread.sleep(2000); //time for observation


        confirmationAlert3.accept();
        Thread.sleep(2000); //time for observation

        driver.quit();

    }
}
