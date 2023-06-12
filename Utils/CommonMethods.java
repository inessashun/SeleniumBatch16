package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonMethods {
    /*
    WHY, static variable & static methods ?
    So, then we can use it anywhere in this class -> only inside the class
    e.g. we are accessing "driver" everywhere associated with static modifier
     */

    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String URL, String browser){

        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;

            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
        //maximize the window
        driver.manage().window().maximize();

        //navigate to the url
        driver.get(URL);

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
        //close the browser
    public static void closeBrowser() {
        if(driver!=null) { // it will only work now if the driver was opened/
            driver.quit();
        }
    }

    public static void sendText(String text, WebElement element) {
        element.clear();
        element.sendKeys(text);
    }

    public static void selectFromDropdown(WebElement dd, int index) {
        Select sel = new Select(dd);
        sel.selectByIndex(index);
    }

    public static void selectFromDropdown(WebElement dd, String visibleText) {
        Select sel = new Select(dd);
        sel.selectByVisibleText(visibleText);
    }

    public static void selectFromDropdown(String value, WebElement dd) {
        Select sel = new Select(dd);
        sel.selectByValue(value);
    }

    /*
    //HW:
//create a method in Common methods for screen shot
//it should take file name as a parameter.
     */
    public static void screenShot(String fileName){
        TakesScreenshot ts=(TakesScreenshot)driver;
        File screenShot=ts.getScreenshotAs(OutputType.FILE);

        try{
            FileUtils.copyFile(screenShot,new File("C:\\Users\\Inessa\\Desktop\\Selenium Screenshot\\screen.png"));
        } catch (IOException e) {
            e.printStackTrace(); // OR => throw new RuntimeException(e);
        }
    }

    public static void selectDateOnCalendar( String calendarXpath, String monthXpath, String yearXpath, String dateXpath, String selectDate, String selectMonth, String selectYear) {
        WebElement calendar = CommonMethods.driver.findElement(By.xpath((calendarXpath)));
        calendar.click();

        WebElement month = CommonMethods.driver.findElement(By.xpath(monthXpath));
        Select selMonth = new Select(month);
        selMonth.selectByVisibleText(selectMonth);

        WebElement year = CommonMethods.driver.findElement(By.xpath(yearXpath));
        Select selYear = new Select(year);
        selYear.selectByValue(selectYear);

        boolean found = false;
        while (!found) {
            List<WebElement> allDates = CommonMethods.driver.findElements(By.xpath(dateXpath));
            for (WebElement date : allDates) {
                String currentDate = date.getText();
                if (currentDate.equals(selectDate)) {
                    date.click();
                    found = true;
                    break;
                }
            }
        }
 /*   public static void selectDateOnCalendar(String calendarXapth, String monthXpath, String yearXapth, String dateXpath,String selectDate,String selectMonth,String selectYear){
        WebElement calendar= driver.findElement(By.xpath((calendarXapth)));
        calendar.click();

       selectOption(monthXpath,selectMonth);
       selectOption(yearXapth,selectYear);

        boolean found=false;
        while (!found) {
            List<WebElement> allDates = driver.findElements(By.xpath(dateXpath));
            for (WebElement date : allDates) {
                String currentDate = date.getText();
                if (currentDate.equals(selectDate)) {
                    date.click();
                    found = true;
                    break;
                }
            }
        }
    }

  */
        }
}


