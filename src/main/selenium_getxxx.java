package main;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_getxxx {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        System.out.println("search before =========================");

        // 获取当前url和title
        System.out.printf("title of current page is %s\n", driver.getTitle());
        System.out.printf("url of current page is %s\n", driver.getCurrentUrl());

        // 百度搜索
        WebElement search = driver.findElement(By.id("kw"));
        search.sendKeys("你好");
        search.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        System.out.println("Search after================");

        // 获取当前url和title
        System.out.printf("title of current page is %s\n", driver.getTitle());
        System.out.printf("url of current page is %s\n", driver.getCurrentUrl());

        // 获取第一个标题的title
        WebElement title_first = driver.findElement(By.xpath("//div[@id='content_left']/div[1]/h3/a"));
        System.out.println(title_first.getText());
        Thread.sleep(2000);

        driver.quit();

    }
}
