package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {
    public static void main(String[] args) throws InterruptedException {
        //create instance
        WebDriver driver= new ChromeDriver();

        //use.get(url) to navigate to the desired url
        driver.get("https://www.google.com");

        //add some wait time / slow down
        Thread.sleep(2000); //code will wait for 2 sec

        //to navigate page
        driver.navigate().to("https://www.facebook.com/");

        //add some wait time / slow down
        Thread.sleep(2000); //code will wait for 2 sec

        //to refresh page
        driver.navigate().refresh();

        //add some wait time / slow down
        Thread.sleep(1000); //code will wait for 1 sec

        //go back to previous page
        driver.navigate().back(); //back to google

        //add some wait time / slow down
        Thread.sleep(2000); //code will wait for 2 sec

        //gp forward to other page
        driver.navigate().forward(); //go to facebook again

        //add some wait time / slow down
        Thread.sleep(2000); //code will wait for 2 sec

        //close the Current Tab
        driver.close(); //to close 1 opened Tab

        //close the WebBrowser
        driver.quit(); //to close whole Browser

    }
}
