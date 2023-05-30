package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSdemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        //click on create new account
        WebElement createNewAccount=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        Thread.sleep(2000);

        WebElement fname=driver.findElement(By.cssSelector("input[name='firstname']"));
        fname.sendKeys("moazzam");
    }
}
