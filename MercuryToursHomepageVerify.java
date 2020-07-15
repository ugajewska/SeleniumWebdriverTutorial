package SamouczekSeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryToursHomepageVerify {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gaja0\\OneDrive\\Pulpit\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String Title = "Welcome: Mercury Tours";
        String currentTitle;

        driver.get(baseUrl);
        currentTitle = driver.getTitle();

        if (currentTitle.equals(Title))
            System.out.printf("Test passed!");
        else
            System.out.printf("Test failed");

        driver.close();




    }
}
