package class07.SeleniumHW7;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task1_HRM extends CommonMethods {
    public static void main(String[] args) {
        /*
        goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        login
        click on PIM
        from the table choose any ID
        and print out the row number of that id
        please make sure that ur code is dynamic enough to cater if another row gets deleted ,
        it still prints the row correctly
         */
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement userPassword = driver.findElement(By.id("txtPassword"));
        userPassword.sendKeys("Hum@nhrm123");

        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();

        WebElement PIMBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        PIMBtn.click();

        //search row for ID -55822A
        List<WebElement> employeeID=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for (int i = 0; i<employeeID.size();i++){
            String id = employeeID.get(i).getText();
            if(id.equals("55822A")){
                System.out.println("The row number of employeeID is: "+(i+1));
            }
        }
        driver.quit();
    }
}
