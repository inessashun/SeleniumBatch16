package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance
        WebDriver driver= new ChromeDriver();

        //use.get(url) to navigate to the desired url HRMS
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        //maximize the window
        driver.manage().window().maximize();

        //add some wait time
        Thread.sleep(5000); //code will wait for 5 sec

        //==>>> driver.findElement(By.id("txtUsername")).sendKeys("Admin"); //we can use this code
        //or you can use to find the element username TextBox
        WebElement usrNameTxtBox=driver.findElement(By.id("txtUsername"));
        usrNameTxtBox.sendKeys("Admin"); //if you need to reuse WebElement

        //add some wait time, slow down
        Thread.sleep(2000); //code will wait for 2 sec

        //after sending the username to the textBox clear the text box/ JUST FOR PRACTICE WE ARE DELETING IT
        usrNameTxtBox.clear();

        //sending the username again
        usrNameTxtBox.sendKeys("Admin");

        //find the password
        WebElement pass = driver.findElement(By.id("txtPassword"));
        pass.sendKeys("Hum@nhrm123"); //==>> PASSWORD to Syntax WebSite!
//*****  Up to here it was HW1  *******
        //find the login button
        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();

        //get the welcome message
        WebElement message = driver.findElement(By.linkText("Welcome Admin"));
        String text = message.getText(); //to print out in Console
        System.out.println(text);
        //login in the application
        //and verify that u see the message Welcome Admin

        //click on the recruitment tab
        driver.findElement(By.partialLinkText("Recru")).click();



    }
}
