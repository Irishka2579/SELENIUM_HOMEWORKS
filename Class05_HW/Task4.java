package HOMEWORKS_SELENIUM.Class05_HW;
/**
 * Go to ebay.com
 * get all the categories and print them in the console
 * select Computers/Tables & Networking
 * click on search
 * verify the title of page
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task4 {
    public static String url="https://www.ebay.com/";
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.get(url);

    WebElement categories= driver.findElement(By.id("gh-cat"));
    Select select=new Select(categories);
        List<WebElement> allOptions=select.getOptions();

    for ( WebElement option:allOptions){
        String linkText= option.getText();
        select.selectByVisibleText(linkText);
        System.out.println(linkText);
        }
        Thread.sleep(1000);
    select.selectByVisibleText("Computers/Tablets & Networking");

    Thread.sleep(1000);
    driver.findElement(By.id("gh-ac")).click();

        System.out.println(driver.getTitle());


        driver.quit();

    }
}

