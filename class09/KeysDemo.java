package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class KeysDemo extends CommonMethods {
    public static void main(String[] args) {
        String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        String browser= "chrome";
        openBrowserAndLaunchApplication(url,browser);

        //locate the text Box UserName
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester", Keys.TAB); //add userName and move to next TextBox

        //locate the password TextBox
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test",Keys.ENTER); //add password and click Login bnt





    }
}
