package SamouczekSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class Waits {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaja0\\OneDrive\\Pulpit\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //This means that you are setting 10 seconds wait time

        //Explicit Wait
        WebDriverWait myWait = new WebDriverWait(driver, 10);
        //np
        myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("username")));
        driver.findElement(By.id("username")).sendKeys("Gajewska");

    }

}
