package HOMEWORKS_SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01_HW {
    /**
     * navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
     * fill out the form
     * click on register
     * close the browser
     */
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        WebElement firstname= driver.findElement(By.id("customer.firstName"));
        firstname.sendKeys("Irina");
        WebElement lastname= driver.findElement(By.id("customer.lastName"));
        lastname.sendKeys("Kozlova");
        WebElement address=driver.findElement(By.name("customer.address.street"));
        address.sendKeys("27 East 55");
        WebElement city= driver.findElement(By.name("customer.address.city"));
        city.sendKeys("NYC");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("10035");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("2125007589");
        driver.findElement(By.id("customer.ssn")).sendKeys("1234567890");
        WebElement username= driver.findElement(By.id("customer.username"));
        username.sendKeys("LoveIs");
        WebElement password= driver.findElement(By.name("customer.password"));
        password.sendKeys("Paris");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Paris");
        WebElement register= driver.findElement(By.id("footermainPanel"));
        register.click();
        driver.close();

    }
}
