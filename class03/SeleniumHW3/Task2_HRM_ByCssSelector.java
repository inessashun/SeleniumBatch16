package class03.SeleniumHW3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_HRM_ByCssSelector {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW2:
        Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
        Enter valid username
        Leave password field empty
        Click on login button
        Verify error message with text “Password cannot be empty” is displayed.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        Thread.sleep(3000); //wait 3 sec to navigate webpage
        driver.manage().window().maximize();

        WebElement username=driver.findElement(By.cssSelector("input[id= 'txtUsername']"));
        username.sendKeys("Mary");
        WebElement loginBtn = driver.findElement(By.cssSelector("input[id= 'btnLogin']"));
        loginBtn.click();
        WebElement notEmpty = driver.findElement(By.cssSelector("span[id='spanMessage']"));
        System.out.println(notEmpty.getText());

        Thread.sleep(3000); //wait 3 sec to print returned message on IntelliJ
        driver.close();
    }
}
