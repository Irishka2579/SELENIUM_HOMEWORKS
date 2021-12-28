package HOMEWORKS_SELENIUM.Class08_HW;
/**
 * goto http://syntaxprojects.com/window-popup-modal-demo.php
 * click on follow on instagram
 * get the title and of new window and print it on the console
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class getTitleOfInstagram {
    public static String url = " http://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement instagramButton = driver.findElement(By.linkText("Follow On Instagram"));
        instagramButton.click();
        System.out.println(driver.getTitle());
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while(iterator.hasNext()){
            String newWindow = iterator.next();
            driver.switchTo().window(newWindow);
           if(driver.getCurrentUrl().equalsIgnoreCase("https://www.instagram.com/Syntaxtechs/")){
                System.out.println(driver.getTitle());

                driver.quit();


    }}}
}
