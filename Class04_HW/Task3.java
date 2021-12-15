package HOMEWORKS_SELENIUM.Class04_HW;
/**
 * goto:http://syntaxprojects.com/input-form-demo.php
 * fill in all the textboxes in the form
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");

        driver.findElement(By.cssSelector("input[name*='first']")).sendKeys("Irina");
        driver.findElement(By.cssSelector("input[name*='last']")).sendKeys("Kozlova");
        driver.findElement(By.cssSelector("input[name*='email']")).sendKeys("ggg@888.com");
        driver.findElement(By.cssSelector("input[name*='phone']")).sendKeys("212-300-8090");
        driver.findElement(By.cssSelector("input[name*='address']")).sendKeys("325 5th ave");
        driver.findElement(By.cssSelector("input[name*='city']")).sendKeys("New York City");
        WebElement state= driver.findElement(By.cssSelector("select[name*='state']"));
        state.sendKeys("New York");
        driver.findElement(By.cssSelector("input[name*='zip']")).sendKeys("10022");
        driver.findElement(By.cssSelector("input[name*='website']")).sendKeys("www.fb.com");
        WebElement question= driver.findElement(By.cssSelector("input[name*='hosting']"));
        question.sendKeys("No");
        question.click();
        driver.findElement(By.cssSelector("textarea[name*='comment']")).sendKeys("blalalala blabla");
        WebElement send=driver.findElement(By.cssSelector("button[type*='submit']"));
        send.click();


        driver.quit();
    }
}
