package class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.facebook.com/";
        String browser= "chrome";
        openBrowserAndLaunchApplication(url,browser);
        //Thread.sleep(2000); //wait 2 sec to navigate webpage

        //declaring the implicit wait in the start as it is a global wait,
        //and we want it to be implemented on all the webElements
        //to implicit Wait we need to add element to CommonMethods class
        driver.manage().timeouts(). implicitlyWait(Duration.ofSeconds(20)); //declaring the implicit wait in the start

        //click on create new account
        WebElement createNewAccountBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccountBtn.click();
        //Thread.sleep(2000); //wait 2 sec to select

        //send the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));

        //to implicit sendText we need to add element to CommonMethods class
        sendText("abracadabra", firstName); // we can use code ==>> firstName.sendKeys("abracadabra");
        //Thread.sleep(2000); //wait 2 sec to select

    }
}
