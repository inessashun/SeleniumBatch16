package class01.SeleniumHW1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_SmartBear_ByName {
    public static void main(String[] args) throws InterruptedException {
        /*
        HW2:
        navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
        enter the username "Tester"
        enter the password "test"
        get the title of the webPage and confirm that it is  "Web Orders Login"
        ------------------
         */
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        String title=driver.getTitle();

        if(title.equals("Web Orders Login")){
            System.out.println("The Webpage title is confirmed");
        }else{
            System.out.println("The title is incorrect");
        }
        System.out.println("Web Orders Login= " + title);
        Thread.sleep(5000); //wait 5 sec until returned to print on IntelliJ
        driver.quit();
    }
}
