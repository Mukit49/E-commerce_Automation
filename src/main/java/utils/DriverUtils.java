package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtils {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void initializeDriver() {
        // Set the system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "E:\\Chrome2\\chromedriver.exe");

        // Create an instance of ChromeDriver
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
