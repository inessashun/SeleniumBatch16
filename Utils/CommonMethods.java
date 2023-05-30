package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class CommonMethods {
    /*
    WHY, static variable & static methods ?
    So, then we can use it anywhere in this class -> only inside the class
    e.g. we are accessing "driver" everywhere associated with static modifier
     */

    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String URL, String browser){

        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;

            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
        //maximize the window
        driver.manage().window().maximize();

        //navigate to the url
        driver.get(URL);
    }
        //close the browser
    public static void closeBrowser() {
        if(driver!=null) {
            driver.quit();
        }
    }
}


