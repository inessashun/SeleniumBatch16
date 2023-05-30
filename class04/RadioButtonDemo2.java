package class04;

import class03.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000); //code will wait for 5 sec

        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser= "chrome";
        openBrowserAndLaunchApplication(url,browser);

        Thread.sleep(5000); //code will wait for 5 sec

        /*
        //        find the radio btn ageGroup and click on it
        WebElement r1 = driver.findElement(By.xpath("//input[@value='0-5' and @name='ageGroup']"));
        r1.click();

        WebElement r2 = driver.findElement(By.xpath("//input[@value='5-15' and @name='ageGroup']"));
        r2.click();

        WebElement r3 = driver.findElement(By.xpath("//input[@value='15-50' and @name='ageGroup']"));
        r3.click();
        */

        List<WebElement> ageGroup=driver.findElements(By.xpath("//input[@name='ageGroup']"));

        String option="15 - 50";

        for(WebElement age:ageGroup){

            String  value=age.getAttribute("value");
            if(value.equals(option)){
                age.click();
                break;
            }
        }
    }
}
