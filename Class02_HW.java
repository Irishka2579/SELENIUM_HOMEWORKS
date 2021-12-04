package HOMEWORKS_SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class02_HW {
    /**
     * navigate to fb.com
     * click on create new account
     * fill up all the textboxes
     * click on sign up button
     * close the pop up
     * close the browser (edited)
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(2000);
       // driver.findElement(By.id("u_0_2_pj")).click();
        driver.findElement(By.name("firstname")).sendKeys("Irina");
        driver.findElement(By.name("lastname")).sendKeys("Kozlova");
        driver.findElement(By.name("reg_email__")).sendKeys("2125001897");
        driver.findElement(By.id("password_step_input")).sendKeys("djfhkjfk");
        driver.findElement(By.id("month")).sendKeys("Feb");
        driver.findElement(By.name("birthday_day")).sendKeys("14");
        driver.findElement(By.name("birthday_year")).sendKeys("2000");
        driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
       // driver.findElement(By.name("websubmit")).click();
        //driver.findElement(By.className("hu5pjgll lzf7d6o1")).click();
        driver.close();
       
    }
}
