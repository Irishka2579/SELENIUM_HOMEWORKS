package HOMEWORKS_SELENIUM.Class05_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Go to facebook
 * click on create new account  page
 * Fill out the whole form
 * Click signup
 */
public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Irina");
        driver.findElement(By.name("lastname")).sendKeys("Kozlova");
        driver.findElement(By.name("reg_email__")).sendKeys("2125001897");
        driver.findElement(By.id("password_step_input")).sendKeys("djfhkjfk");
        driver.findElement(By.id("month")).sendKeys("Feb");
        driver.findElement(By.name("birthday_day")).sendKeys("14");
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();

        driver.close();

    }
}
