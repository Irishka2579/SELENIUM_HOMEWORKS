package HOMEWORKS_SELENIUM.Class04_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * task1:(use xpath)
 * RMS Application Negative Login:
 * Open chrome browser
 * Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
 * Enter valid username
 * Leave password field empty
 * Click on login button
 * Verify error message with text “Password cannot be empty” is displayed.
 */

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username= driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Irina");
        WebElement login=driver.findElement(By.xpath("//input[@name='Submit']"));
         login.click();
         WebElement errorMessage= driver.findElement(By.xpath("//span[@id='spanMessage']/preceding-sibling::input"));
        boolean Error= errorMessage.isDisplayed();
        if(Error){
            System.out.println("'Password can not be empty' is displayed");
        }

        driver.quit();
    }
}
