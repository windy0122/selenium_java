package main;
//import javaBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;


public class selenium_demo_one {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("http://www.baidu.com");
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        driver.close();

        // 打开百度首页
        driver.get("http://www.baidu.com");
        System.out.printf("now accesss %s \n", driver.getCurrentUrl());
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // 点击打开新闻
        driver.findElement(By.linkText("新闻")).click();
        System.out.printf("now accesss %s \n", driver.getCurrentUrl());
        Thread.sleep(2000);

        // 浏览器后退
        driver.navigate().back();
        Thread.sleep(2000);

        // 浏览器前进
        driver.navigate().forward();
        Thread.sleep(2000);

        driver.close();

    }
}
