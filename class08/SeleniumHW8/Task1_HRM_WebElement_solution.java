package class08.SeleniumHW8;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1_HRM_WebElement_solution extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*  1st way solution
        -------------------
        goto syntax hrms
        login
        click on recruitment
        select a date on the calendar
         */
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement userPassword = driver.findElement(By.id("txtPassword"));
        userPassword.sendKeys("Hum@nhrm123");

        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();

        WebElement recruitmentTab = driver.findElement(By.xpath("//b[text()='Recruitment']/parent::a"));
        recruitmentTab.click();

        WebElement calendar = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger'][1]"));
        calendar.click();

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select yearSel = new Select(year);
        yearSel.selectByVisibleText("2022");

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select monthSel = new Select(month);
        monthSel.selectByVisibleText("Jul");

        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement day:days){
            String daySel = day.getText();
            if(daySel.equals("3")){
                day.click();
                break;
            }
        }
        //selected date - 2022/07/03 , order - year/month/day
        Thread.sleep(5000);
        driver.quit();
    }
}
