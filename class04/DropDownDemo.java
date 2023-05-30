package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(5000); //code will wait for 5 sec

        String url="http://www.facebook.com/";
        String browser= "chrome";
        openBrowserAndLaunchApplication(url,browser);
        Thread.sleep(5000); //code will wait for 5 sec

        // click on create new account
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        //because the DOM doesn't have firstName by default
        //it only shows up after click on create new account
        //and the code takes some time to appear in DOM for firstName
        //we must add a sleep here

        Thread.sleep(5000); //code will wait for 2 sec
        //1.find the element associate with the dropdown
        //option[text()=‘May’] is this right
        WebElement days= driver.findElement(By.xpath("//select[@id='day']"));
        //2.create an object of the select class and pass in the parameters the element dropdown
        Select sel=new Select(days);
        //3.use method provided in select class to select the option that u desire
        sel.selectByVisibleText("2");//True
        Thread.sleep(2000);
        sel.selectByValue("26");//True
        Thread.sleep(2000);
        sel.selectByIndex(0); //False
        Thread.sleep(2000);


        WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
        Select sel1=new Select(month);
        sel.selectByVisibleText("January");

        WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
        Select sel2=new Select(year);
        sel.selectByVisibleText("1978");

    }
}
