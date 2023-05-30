package class04.SeleniumHW4;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2_FB_ByCommonMethods extends CommonMethods{
    public static void main(String[] args) throws InterruptedException {
        /*
        hw2:
        goto facebook.com
         click on create account
        and select your date of birth using select class
         */
        String url="https://www.facebook.com/";
        String browser= "chrome";
        openBrowserAndLaunchApplication(url,browser);
        Thread.sleep(2000); //wait 2 sec to navigate webpage

        WebElement createNewAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createNewAccount.click();
        Thread.sleep(2000); //wait 2 sec to select

        WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
        Select option=new Select(month);
        option.selectByIndex(3);
        Thread.sleep(2000); //wait 2 sec to select

        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        Select option1=new Select(day);
        option1.selectByVisibleText("26");
        Thread.sleep(2000); //wait 2 sec to select

        WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
        Select option2=new Select(year);
        option2.selectByValue("1980");
        Thread.sleep(2000); //wait 2 sec to select

        driver.close();

    }
}
