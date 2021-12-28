package HOMEWORKS_SELENIUM.Class08_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * goto https://chercher.tech/practice/implicit-wait-example
 * the checkbox take 10 seconds  to populate
 * use implicit wait to check only the first checkbox that populates
 *  close the browser
 */
public class Implicit {
    public static String url = "https://chercher.tech/practice/implicit-wait-example";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("input[type='checkbox']")).click();

        driver.quit();

    }
}