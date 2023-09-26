import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Actiondemo {

    private static Object keys;

    public static void main(String[] args) throws InterruptedException {

        {
            ChromeOptions op = new ChromeOptions();
            op.setBinary("C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://www.amazon.com/");
            Actions a= new Actions(driver);
            WebElement move=(driver.findElement(By.cssSelector("a[id='nav-link-accountList']")));
            a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("womenstop").doubleClick().build().perform();
            //move to sepecific element
            a.moveToElement(move).contextClick().build().perform() ;
           // a.moveToElement()
        }
    }
}