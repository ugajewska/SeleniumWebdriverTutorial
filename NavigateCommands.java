package SamouczekSeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaja0\\OneDrive\\Pulpit\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "http://demo.guru99.com/test/newtours/";
        String nextUrl = "http://demo.guru99.com/Agile_Project/Agi_V1/";

        driver.get(url);
        driver.navigate().to(nextUrl); //navigate to new page
        driver.navigate().back(); //navigate to the previous page
        driver.navigate().forward(); // navigate back to the "nextUrl" page

        driver.close(); //close only the browser
        // driver.guick(); closes all windows and a driver
    }
}
