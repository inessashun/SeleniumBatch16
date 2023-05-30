package class01.SeleniumHW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Parabank_ByID {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW1:
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        close the browser

        Note: use name or id as locators
         */

        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        Thread.sleep(3000); //wait 3 sec to navigate webpage

        driver.findElement(By.id("customer.firstName")).sendKeys("Mary");
        driver.findElement(By.id("customer.lastName")).sendKeys("Smith");

        driver.findElement(By.id("customer.address.street")).sendKeys("222 Broadway ave");
        driver.findElement(By.id("customer.address.city")).sendKeys("New York");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("10001");

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("2129876543");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-45-6789");

        driver.findElement(By.id("customer.username")).sendKeys("email2023@email.com");
        driver.findElement(By.id("customer.password")).sendKeys("9876@12345");
        driver.findElement(By.id("repeatedPassword")).sendKeys("9876@12345");

        Thread.sleep(5000); //wait 5 sec to check all codes
        driver.quit();
    }
}
