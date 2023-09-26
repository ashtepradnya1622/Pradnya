import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class Childwindow {
    public static void main(String[] args) throws InterruptedException {

            ChromeOptions op = new ChromeOptions();
            op.setBinary("C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
            WebDriver driver = new ChromeDriver(op);
            driver.get("https://rahulshettyacademy.com/loginpagePractise/");
            driver.findElement(By.cssSelector("body a.blinkingText")).click();
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> it = windows.iterator();
            String parentid = it.next();
            String childid = it.next();
            it.next();
            driver.switchTo().window(childid);
            System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
           driver.findElement(By.cssSelector(".im-para.red")).getText();


        }
    }

