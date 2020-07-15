package SamouczekSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBetweenPopupWindows {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaja0\\OneDrive\\Pulpit\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "http://jsbin.com/usidix/1";
        String message;

        driver.get(url);
        driver.findElement(By.cssSelector("input[value=\"Go!\"")).click();
        message = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        System.out.println(message);
        driver.quit();

    }
}
