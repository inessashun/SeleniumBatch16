package class08.SeleniumHW8;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1_HRM_StringXpath_MonthError extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {
        /* 2nd way solution ==>> NOT WORKING/ Month error
        -------------------
        goto syntax hrms
        login
        click on recruitment
        select a date on the calendar
         */
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();

        WebElement recruitment = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitment.click();

        String calendarXpath="//img[@class='ui-datepicker-trigger'][1]";

        String yearXpath="//select[@class='ui-datepicker-year']";
        String monthXpath="//select[@class='ui-datepicker-month']";
        String dateXpath="//table/tbody/tr/td";
        //date: 2022/07/03 - order: year/month/day
        String selectYear="2022";
        String selectMonth="Jul";
        String selectDate="3";
        selectDateOnCalendar(calendarXpath,yearXpath,monthXpath,dateXpath,selectYear,selectMonth,selectDate);

        Thread.sleep(2000);
        driver.quit();
    }
}
