package main;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_test_two {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        driver.manage().window().maximize();

        // 获得百度输入框的尺寸
        WebElement text_size = driver.findElement(By.id("kw"));
        System.out.println(text_size.getSize());

        // 返回底部备案信息
        WebElement text = driver.findElement(By.id("cp"));
        System.out.println(text.getText());

        // 返回元素的属性值
        WebElement ty = driver.findElement(By.id("kw"));
        System.out.println(ty.getAttribute("type"));

        // 返回元素是否可见
        WebElement display = driver.findElement(By.id("kw"));
        System.out.println(display.isDisplayed());

        driver.quit();

    }
}
