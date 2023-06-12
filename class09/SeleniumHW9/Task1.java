package class09.SeleniumHW9;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Task1 extends CommonMethods {
    /*
    create a method in Common methods for screenshot
    it should take file name as a parameter
     */
    public static void main(String[] args) throws InterruptedException {
        String url = "http://yahoo.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);


        WebElement logoYahoo = driver.findElement(By.xpath("//img[@class='_yb_izo7k _yb_4ee44']")); //Open the WebElement
        JavascriptExecutor js = (JavascriptExecutor) driver; //JSExecutor

        //The js.Script code to draw background with a border around image
        js.executeScript("arguments[0].style.backgroundColor='orange'", logoYahoo);
        js.executeScript("arguments[0].style.border='5px solid green'",logoYahoo);
        Thread.sleep(2000); //time to observation

        Actions action = new Actions(driver); //Action class
        action.moveToElement(logoYahoo);

        screenShot("Orange image with Green border around Yahoo Logo"); //auto screenshot and save it to Desktop
        closeBrowser();
    }
}
