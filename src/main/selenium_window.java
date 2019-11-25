package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class selenium_window {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");

        // 获得当前窗口句柄
        String search_handle = driver.getWindowHandle();

        // 打开百度注册窗口
        driver.findElement(By.linkText("登录")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("立即注册")).click();

        // 获取所有窗口句柄
        Set<String> handles = driver.getWindowHandles();

        // 判断是否为注册窗口，并操作注册窗口上的元素
        for (String handle : handles){
            if (handle.equals(search_handle) == false){
                driver.switchTo().window(handle);
                System.out.println("现在是注册窗口");
                Thread.sleep(3000);

                driver.findElement(By.name("userName")).clear();
                driver.findElement(By.name("userName")).sendKeys("username");
                driver.findElement(By.name("phone")).clear();
                driver.findElement(By.name("phone")).sendKeys("199999999");

                Thread.sleep(3000);

                driver.quit();
            }
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
