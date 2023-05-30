package class03.SeleniumHW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Practice_ByCssSelector {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW1:
        Open Chrome browser
        Go to “http://practice.syntaxtechs.net/input-form-demo.php
        fill in the complete form
         */
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000); // wait 2 sec to navigate webpage

        WebElement firstname = driver.findElement(By.cssSelector("input[name ='first_name']"));
        firstname.sendKeys("Jenny");

        WebElement lastname = driver.findElement(By.cssSelector("input[name ='last_name']"));
        lastname.sendKeys("Thomas");

        WebElement email = driver.findElement(By.cssSelector("input[name ='email']"));
        email.sendKeys("jennyt22@gmail.com");

        WebElement phone = driver.findElement(By.cssSelector("input[name ='phone']"));
        phone.sendKeys("(212)321-6789");

        WebElement address = driver.findElement(By.cssSelector("input[name ='address']"));
        address.sendKeys("222 Broadway ave");

        WebElement city = driver.findElement(By.cssSelector("input[placeholder ='city']"));
        city.sendKeys("New York");

        WebElement state = driver.findElement(By.cssSelector("select[name='state']"));
        state.sendKeys("New York");

        WebElement zip = driver.findElement(By.cssSelector("input[name='zip']"));
        zip.sendKeys("10001");

        WebElement website = driver.findElement(By.cssSelector("input[name='website']"));
        website.sendKeys("www.google.com");

        WebElement hostingYesNo = driver.findElement(By.cssSelector("input[type='radio']"));
        hostingYesNo.click();//yes

        WebElement comment = driver.findElement(By.cssSelector("textarea[placeholder*='Project']"));
        comment.sendKeys("comment");

        Thread.sleep(5000); //wait 5 sec to check all codes
        driver.close();
    }
}
