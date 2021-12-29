package HOMEWORKS_SELENIUM.Class09_HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * goto https://chercher.tech/practice/explicit-wait
 * 1.click on open an alert after 5 sec and then using explicit wait manage that alert
 * 2.click on display button after 10 sec and once the button is displayed
 * print the status of isDisplayed() (edited)
 */
public class AlertExplicitWait {
    public static String url = "https://chercher.tech/practice/explicit-wait";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement openAlert= driver.findElement(By.id("alert"));
        openAlert.click();
        WebDriverWait wait=new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.alertIsPresent());
         Alert alert=driver.switchTo().alert();
         alert.accept();

         WebElement EnButton= driver.findElement(By.id("display-other-button"));
         EnButton.click();
         WebDriverWait wait1=new WebDriverWait(driver,10);
         wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
         WebElement enable= driver.findElement(By.id("hidden"));
        System.out.println(enable.isDisplayed());




    }
}