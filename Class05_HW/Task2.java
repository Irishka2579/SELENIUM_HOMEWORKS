package HOMEWORKS_SELENIUM.Class05_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * HRMS Application Negative Login:
 * Open chrome browser
 * Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
 * Enter valid username
 * Leave password field empty
 * Click on login button
 * Verify error message with text “Password cannot be empty” is displayed.
 */
public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input")).sendKeys("Irina");
        driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("GetIn");
        WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
        WebElement errorMessage= driver.findElement(By.xpath("//span[@id='spanMessage']/preceding-sibling::input"));
        boolean Error= errorMessage.isDisplayed();
        if(Error){
            System.out.println("'Password cannot be empty' is displayed");
        }

        driver.quit();
    }
}
