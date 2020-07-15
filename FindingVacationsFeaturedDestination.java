package SamouczekSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindingVacationsFeaturedDestination {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver", "C:\\Users\\gaja0\\OneDrive\\Pulpit\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String tag = "featured vacation destinations";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(baseUrl);
        driver.findElement(By.linkText(tag)).click();

        





    }
}
