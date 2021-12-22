package HOMEWORKS_SELENIUM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * HW1:goto
 * http://syntaxprojects.com/javascript-alert-box-demo.php
 * handle all alerts one by one
 * 1.simple
 * 2.conformation
 * 3.prompt
 */
public class Class06_HW {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/javascript-alert-box-demo.php");

    }
}
