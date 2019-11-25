package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class selenium_scroll {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(700,600));
        driver.get("http://www.baidu.com");

        driver.findElement(By.id("kw")).sendKeys("呵呵");
        driver.findElement(By.id("su")).click();
        Thread.sleep(2000);

        ((JavascriptExecutor)driver).executeScript("window.scrollTo(100,450)");
        Thread.sleep(3000);

        driver.quit();
    }
}
