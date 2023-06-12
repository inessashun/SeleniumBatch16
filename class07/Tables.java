package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApplication;

public class Tables {
    public static void main(String[] args) {
        String url="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
        String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);

        //************Table Level Access************
        //print the whole table on the console

        //get the whole table
        WebElement wholeTable= driver.findElement(By.xpath("//table[@id='customers']"));
        String allText= wholeTable.getText();
        System.out.println(allText);

        System.out.println("*****************************");
        //************Row Level Access of Table************
        //print all the rows of the table
        //modified: print the row that contains google as company name
        List<WebElement> allRows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row:allRows){
            String rowText=row.getText();
            if(rowText.contains("Google")){
                System.out.println(rowText); // ==>> Google  Maria Anders Germany
            }

        }

        System.out.println("*****************************");
        //************Column Level Access of Table************
        //print each and every data in the table
        List<WebElement> allCellData=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement cell:allCellData){
            String cellData=cell.getText();
            System.out.println(cellData);
        }




    }
}
