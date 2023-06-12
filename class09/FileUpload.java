package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) {

        //webside has alot of different task for practice on Selenium => https://the-internet.herokuapp.com/
        String url="https://the-internet.herokuapp.com/upload";
        String browser= "chrome";
        openBrowserAndLaunchApplication(url,browser);

        //find the element which you can click to upload the file
        WebElement fileUploadBtn= driver.findElement(By.xpath("//input[@id='file-upload']"));
        fileUploadBtn.sendKeys("C:\\Users\\Innessa\\Desktop\\Java.txt"); //any file from your Desktop






    }
}
