package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

        //if not open IMPORT? click shift+o
public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {

        /**
         * *task:
         * navigate to google.com
         */
        //declare the instance
        WebDriver driver= new FirefoxDriver();

        //use.get(url) to navigate to the desired url
         driver.get("https://www.google.com");

        //maximize the window
        driver.manage().window().maximize();

         // get the current url
        String currentUrl=driver.getCurrentUrl();

        //print on the console
        System.out.println("the current url is "+currentUrl);

        //get title of the page
        String title=driver.getTitle();

        //print the title on console
        System.out.println("The title of the page is "+title);

        //add some wait time
        Thread.sleep(5000); //code will wait for 5 sec

        //close the WebBrowser
        driver.quit();

    }
}
