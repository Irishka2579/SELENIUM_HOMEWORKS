package HOMEWORKS_SELENIUM.Class05_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * HW1: Amazon link count:
 * Open chrome browser
 * Go to “https://www.amazon.com/”
 * Get all links
 * Get number of links that has text
 * Print to console only the links that has text
 */

public class Task1 {
    public static String url = "https://amazon.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement all= driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select((all));

        List<WebElement> options= select.getOptions();
        for(WebElement option:options){
            String optionText=option.getText();
            System.out.println(optionText);

        }
        int size= options.size();
        System.out.println(size);
    }}
