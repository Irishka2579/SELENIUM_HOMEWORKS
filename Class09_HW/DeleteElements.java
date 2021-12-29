package HOMEWORKS_SELENIUM.Class09_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * goto http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx
 * and delete all the eneteries which have product mymoney and lives in us state (edited)
 */
public class DeleteElements {
    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username= driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password= driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement loginButton= driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
        for (int i = 1; i < rows.size(); i++) {
            String rowText = rows.get(i).getText();
            if (rowText.contains("MyMoney") && rowText.contains("US")) {
                List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
                checkBoxes.get(i - 1).click();
            }
        }

        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
}}
