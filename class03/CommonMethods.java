package class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {

    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url, String browser) {
        /*
        URL
         */
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

    }

    public static void closeBrowser() {
        driver.quit();

    }
}
