package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_upload {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://image.baidu.com/");

        Thread.sleep(2000);

        driver.findElement(By.className("st_camera_off")).click();
        driver.findElement(By.id("stfile")).sendKeys("F:\\1.png");

        Thread.sleep(5000);

        driver.quit();





    }
}
