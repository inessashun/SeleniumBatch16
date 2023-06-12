package class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser= "chrome";
        openBrowserAndLaunchApplication(url,browser);
        Thread.sleep(2000);

        WebElement alert1Btn = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        Thread.sleep(2000);//to observe
        alert1Btn.click();

        Thread.sleep(2000);//to observe
        //switch the focus of the driver to the alert
        Alert confirmationAlert1= driver.switchTo().alert();
        confirmationAlert1.accept(); //accept the alert means => it's ok click on it

        WebElement alert2Btn = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        Thread.sleep(2000); //to observe
        alert2Btn.click();

        //switch the focus of the driver to the alert
        Alert confirmationAlert2= driver.switchTo().alert();
        confirmationAlert2.dismiss(); //click  to => accept=OK; dismiss=CANCEL
        //HW to do next alert => Prompt Box
    }
}
