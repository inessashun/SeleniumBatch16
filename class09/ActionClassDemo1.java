package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo1 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://www.amazon.com/";
        String browser= "chrome";
        openBrowserAndLaunchApplication(url,browser);

        //find the WebElement that you want to hover your cursor to
        WebElement signIn=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        //Action class
        Actions action=new Actions(driver);
        //perform the desired action
        action.moveToElement(signIn);



    }
}
