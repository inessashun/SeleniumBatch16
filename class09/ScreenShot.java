package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScreenShot extends CommonMethods {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser= "chrome";
        openBrowserAndLaunchApplication(url,browser);

        //find the login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",loginBtn);

        //take the screen shot
        //declare the instance

        //take screen shot as output type FILE

        //save it in your computer

    }
}

/*
                Notes from Moazzam
                -------------------

                options = Options()

                Disable cookies
                options.add_argument("--disable-cookies")

                Create a new ChromeDriver instance with the options
                driver = webdriver.Chrome(options=options)
 */
