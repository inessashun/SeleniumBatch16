package class02.SeleniumHW2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_FB_ByXpath {
    public static void main(String[] args) throws InterruptedException {
        /*
         (only use XPATH)
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        close the popup
        close the browser

        Note : in order for ur code to work
        u have to put Thread.sleep(2000) after clicking on Create new account
         */
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement createAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccount.click();
        Thread.sleep(2000); //wait 2 sec to navigate webpage
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Joan");
        driver.findElement(By.xpath("//input[@aria-label='Last name']")).sendKeys("Taylor");
        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("taylorjoan@gmail.com");
        driver.findElement(By.xpath("//input[@aria-label='Re-enter email']")).sendKeys("taylorjoan@gmail.com");
        driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("7M23@65g");

        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("March");
        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("01");
        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2000");

        driver.findElement(By.xpath("//label[text()='Female']")).click();

        driver.findElement(By.xpath("//button[@name='websubmit']")).click();

        Thread.sleep(6000); //wait 6 sec until submitted, then page close
        driver.close();
    }
}
