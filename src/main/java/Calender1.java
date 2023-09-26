import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calender1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\Coditas\\\\Downloads\\\\V4-Automation-master\\\\V4-Automation-master\\\\V4-Automation-master\\\\src\\\\main\\\\resources\\\\chrome\\\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.path2usa.com/travel-companion/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='Date of travel]")).click();
        List<WebElement> dates = driver.findElements(By.className("flatpickr-day "));
        int count = driver.findElements(By.className("flatpickr-day  ")).size();
        for (int i = 0; i < count; i++) {
            String text = driver.findElements(By.className("flatpickr-day ")).get(i).getText();
            if (text.equalsIgnoreCase("sep-22"))
            {
                driver.findElements(By.className("flatpickr-day ")).get(i).click();
                break;
            }

        }
    }
}

