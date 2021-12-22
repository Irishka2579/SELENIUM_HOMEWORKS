package HOMEWORKS_SELENIUM.Class07_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * goto https://demoqa.com/nestedframes
 * print the text childframe on console (
 */

public class ChildFrameGetText {

    public static String url = "https://demoqa.com/nestedframes";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
     WebElement parentFrame=driver.findElement(By.id("frame1"));
     driver.switchTo().frame(parentFrame);

        WebElement childFrame= driver.findElement(By.cssSelector("iframe[srcdoc ='<p>Child Iframe</p>']"));
        driver.switchTo().frame(childFrame);


        System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());
    }
}