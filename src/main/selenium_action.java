package main;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class selenium_action {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");

        // 右键点击
        Actions action =new Actions(driver);
//        WebElement news_text = driver.findElement(By.linkText("新闻"));
//        action.contextClick(news_text).perform();
//        Thread.sleep(2000);
//
//        news_text.sendKeys(Keys.ENTER);
//        news_text.sendKeys(Keys.ENTER);

        // 双击
//        WebElement input = driver.findElement(By.id("kw"));
//        input.sendKeys("selenium");
//        action.doubleClick(input).perform();
//        Thread.sleep(3000);

        // 鼠标悬停
        WebElement setting = driver.findElement(By.linkText("设置"));
        action.moveToElement(setting).perform();
        Thread.sleep(3000);


        driver.quit();
    }
}
