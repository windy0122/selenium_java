package main;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class selenium_wait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("http://www.baidu.com");
//        driver.manage().window().maximize();

        // 显示等待
//        WebDriverWait wait = new WebDriverWait(driver,10,1);
//        wait.until(new ExpectedCondition<WebElement>() {
//           @Override
//           public WebElement apply(WebDriver text) {
//               return text.findElement(By.id("kw"));
//           }
//        }).sendKeys("你好");
//
//        driver.findElement(By.id("su")).click();
//        Thread.sleep(2000);

        // 隐式等待
        //页面加载超时时间设置为 5s
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");

        //定位对象时给 10s 的时间, 如果 10s 内还定位不到则抛出异常
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("kw")).sendKeys("你好");

        //异步脚本的超时时间设置成 3s
        driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);

        driver.quit();

    }
}
