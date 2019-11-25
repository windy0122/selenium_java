package main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class selenium_select {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
//        driver.get("http://news.cyol.com/node_60799.htm");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("设置")).click();
        driver.findElement(By.linkText("搜索设置")).click();
        Thread.sleep(2000);

        //<select>标签的下拉框选择
        WebElement el = driver.findElement(By.xpath("//select"));
        Select sel = new Select(el);
        sel.selectByValue("50");
        Thread.sleep(2000);

        // 保存设置
        driver.findElement(By.className("prefpanelgo")).click();

        //接受弹框
        Thread.sleep(2000);
        Alert alert_button = driver.switchTo().alert();

        String alert_text = alert_button.getText();
        System.out.println(alert_text);
//        alert_button.accept();
        alert_button.dismiss();

        Thread.sleep(2000);

        driver.quit();
    }
}
