package class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {

    public static WebDriver driver; //you can mentioned static WebDriver here
    public static void openBrowserAndLaunchApplication(String url, String browser) {
        /*
        URL
         */
        //create instance
        driver=new ChromeDriver();
        //navigate to url
        driver.get(url);
        //maximize the screen
        driver.manage().window().maximize();

    }

    public static void closeBrowser() {
        driver.quit();

    }
}
