package class06.SeleniumHW6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task3_Practice extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        develop a function in common methods to select from dropdown(single select)
         */

        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement value = driver.findElement(By.xpath("//select[@id='select-demo']"));
        Thread.sleep(2000); // wait 2 sec to navigate webpage

        Select dropdown=new Select(value);
        value.click();
        dropdown.selectByValue("Tuesday"); //dropdown(single select)
        Thread.sleep(2000); //wait 2 sec to select
        driver.quit();

    }
}
