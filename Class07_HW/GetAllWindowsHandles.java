package HOMEWORKS_SELENIUM.Class07_HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;

/**
 * goto the Website https://syntaxprojects.com/window-popup-modal-demo.php
 * click on follow on instagram
 * click on facebook.com
 * get all windows handles
 */

public class GetAllWindowsHandles {

    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement instagram=driver.findElement(By.cssSelector("a[title='Follow @syntaxtech on Instagram']"));
        instagram.click();
        Thread.sleep(1000);

        WebElement facebook=driver.findElement((By.cssSelector("a[title='Follow @syntaxtech on Facebook']")));
        facebook.click();

        Iterator<String>allWindowHandle=driver.getWindowHandles().iterator();

        String mainWindow= allWindowHandle.next();
        System.out.println("Main window "+mainWindow);

        String instagramWindow=allWindowHandle.next();
        System.out.println("Instagram Window "+instagramWindow);

        String facebookWindow=allWindowHandle.next();
        System.out.println("Facebook Window "+facebookWindow);

}}

