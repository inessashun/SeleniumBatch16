package class04.SeleniumHW4;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task1_Practice_ByCommonMethods extends CommonMethods{
    public static void main(String[] args) throws InterruptedException {
        /*
        HW1:
        goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
        select , tuesday, thursday and friday one by one
         */

        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser= "chrome";
        openBrowserAndLaunchApplication(url,browser);
        Thread.sleep(2000); //wait 2 sec to navigate webpage

        WebElement value = driver.findElement(By.xpath("//select[@id='select-demo']"));
        Thread.sleep(2000); // wait 2 sec to navigate webpage

        Select option=new Select(value);
        value.click();
        option.selectByValue("Tuesday");
        Thread.sleep(2000); //wait 2 sec to select
        option.selectByValue("Thursday");
        Thread.sleep(2000); //wait 2 sec to select
        option.selectByValue("Friday");
        Thread.sleep(2000); //wait 2 sec to select

        driver.close();
    }
}
