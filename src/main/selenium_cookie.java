package main;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_cookie {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://10.12.64.215:9000");

        Cookie c1 = new Cookie("Admin-Token","30b1c6b1-0ce5-4fda-880c-c15816fd2c48");
        driver.manage().addCookie(c1);

        Thread.sleep(3000);
        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.quit();
    }
}
