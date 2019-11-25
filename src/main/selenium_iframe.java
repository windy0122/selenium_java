package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_iframe {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.126.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // 即使到了登录页面，也无法输入，必须切换iframe
        driver.findElement(By.xpath("/html//div[@id='lbNormal']")).click();

        WebElement xf = driver.findElement(By.xpath("//*[@id=\"loginDiv\"]/iframe"));
        driver.switchTo().frame(xf);

        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("username");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("password");

        driver.findElement(By.id("dologin")).click();

        Thread.sleep(3000);
        driver.quit();


    }
}
