package HOMEWORKS_SELENIUM.Class04_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * task2:(use advance xpath)
 * RMS Application Negative Login:
 * Open chrome browser
 * Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
 * Enter valid username
 * enter wrong password
 * Click on login button
 * Verify error message with text “Invalid Credenitals” is displayed.
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
            System.out.println("'Invalid Credentials' is displayed");
        }

        driver.quit();
    }
    }


