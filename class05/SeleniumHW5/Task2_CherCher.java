package class05.SeleniumHW5;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2_CherCher extends CommonMethods {
    public static void main(String[] args) throws InterruptedException{
        /*
        goto https://chercher.tech/practice/frames
        click on check box
        then select baby cat from drop down
        then enter text in text box
         */
        String url="https://chercher.tech/practice/frames";
        String browser= "chrome";
        openBrowserAndLaunchApplication(url,browser);
        Thread.sleep(2000);

        //1. click on check box
        driver.switchTo().frame(0);
        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.id("a")).click();

        //2. then select baby cat from drop down
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement animal= driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());

        WebElement dd= driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(dd); //select dropdown
        sel.selectByVisibleText("Baby Cat");

        //3. then enter text in text box
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Text To Write");


    }
}
