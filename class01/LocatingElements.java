package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver= new ChromeDriver();

        //to navigate facebook page
        driver.get("https://www.facebook.com/");

        //!! maximize the window => make it a habbit because sometimes it not showed full window
        driver.manage().window().maximize();

        //on TextBox send some text in the email
        //find the element                . send some text
        driver.findElement(By.id("email")).sendKeys("moazam@gmail.com");

        //send some text to the password field
        driver.findElement(By.id("pass")).sendKeys("hjjhhhgk");

        //print on the console
        String url=driver.getCurrentUrl();
        System.out.println(url);

        //ger title of the page
        String title=driver.getTitle();
        System.out.println(title);

        //confirm that the title is "Facebook - log in or sing up
        if(title.equals("Facebook - log in or sing up")){
            System.out.println("the title is correct");
        }else{
            System.out.println("the title is incorrect");
        }

        //add some wait time
        Thread.sleep(5000); //code will wait for 5 sec

        //close the WebBrowser
        driver.quit();
    }
}
