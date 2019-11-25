package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class selenium_elements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");

        WebElement search_text = driver.findElement(By.id("kw"));
        search_text.sendKeys("selenium");
        search_text.submit();
        Thread.sleep(2000);

        // 匹配第一页搜索结果标题，循环打印
        List<WebElement> search_result = driver.findElements(By.xpath("//div/div/h3"));
        // 打印元素个数
        System.out.println(search_result.size());

        // 循环打印搜索结果的标题
        for(WebElement result: search_result){
            System.out.println(result.getText());
        }

        System.out.println("====================================================================");

        //打印n行的标题
        WebElement text = search_result.get(search_result.size() - 5);
        System.out.println(text.getText());

        driver.quit();


    }
}
