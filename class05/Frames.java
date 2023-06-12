package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Frames extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://chercher.tech/practice/frames";
        String browser= "chrome";
        openBrowserAndLaunchApplication(url,browser);
        Thread.sleep(2000);

        // task1: print animal on screen
        //and select Babycat from drop down

        //Step1:    as the webElement is inside an iframe
        //first we need to switch to it
        driver.switchTo().frame(1); //frame with INDEX
        WebElement animal= driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText()); //print on console => Animals:

        //select baby cat
        WebElement dd= driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(dd); //select dropdown
        sel.selectByVisibleText("Baby Cat"); //or we can => selectByValue

        //if we want to switch the focus to the MAIN page
        driver.switchTo().defaultContent();

        //switch to frame containing text box
        driver.switchTo().frame("frame1"); //select frame with STRING
        WebElement textBox=driver.findElement(By.xpath("//input"));
        textBox.sendKeys("abracadabra");

        //check on the checkBox
        //switch to iframe using webElement method
        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3); //frame with WebElement

        driver.findElement(By.id("a")).click(); //checkBox id
    }
}
