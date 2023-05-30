package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //driver.get("http://practice.syntaxtechs.net/");
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //maximize
        driver.manage().window().maximize();
        //wait 5 sec
        Thread.sleep(5000);
        //UserName textBox through xpath , send Keys
        WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        //Password textBox through xpath, send Keys
        WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        //
        WebElement loginBtn=driver.findElement(By.xpath("//input[contains(@id,'Login')]"));
        loginBtn.click();

        WebElement pimTab=driver.findElement(By.xpath("(//a[@id='menu_pim_viewPimModule'])"));
        pimTab.click();

    }
}
