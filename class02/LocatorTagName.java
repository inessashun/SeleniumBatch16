package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorTagName {
    public static void main(String[] args) {
        //declare the instance
        WebDriver driver= new ChromeDriver();

        //use.get(url) to navigate to the desired url
        driver.get("https://www.amazon.com");

        //maximize the window
        driver.manage().window().maximize();

        //find by TagName
        //==>>  driver.findElement(By.tagName("button"));
        //if there are multiple elements with the same Tag Name the Selenium
        // is going to pick the first one it finds

        //get all the links from amazon .com print them on the console
        List<WebElement>allLinks=driver.findElements(By.tagName("a"));

        //traverse
        for(WebElement link:allLinks){

            String linkOfWebsite= link.getAttribute("href");
            System.out.println(linkOfWebsite);
        }
    }
}
