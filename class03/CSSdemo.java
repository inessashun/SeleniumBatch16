package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSdemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        //to navigate a WebBrowser to FB .com
        driver.get("https://www.facebook.com/");

        //open up and maximize the window
        driver.manage().window().maximize();

        //temporary holds executing for 2 sec
        Thread.sleep(2000);

        //open up and click on create new account
        WebElement createNewAccount=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        //needs time to execute the window, because the Dom doesn't have firstName as default it only shows up after
        //click on create new account and the code takes some time to appear in DOM for firstName
        //temporary holds executing for 2 sec
        Thread.sleep(2000);

        //find the textBox enter the first name, sendKeys to it
        WebElement fname=driver.findElement(By.cssSelector("input[name='firstname']"));
        fname.sendKeys("moazzam");

        //to close the window X button - we use the last 4 symbols on the link to close.
        WebElement closePage=driver.findElement(By.cssSelector("img[src$='Gm8t.png']"));
        closePage.click();

        //All steps PASSED !
    }
}
