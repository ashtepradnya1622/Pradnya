import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.List;

public class Brokenlinks2 {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> links = Collections.singletonList ((WebElement) driver.findElements(By.cssSelector("li[class='gf-li']a")));
        for (WebElement link : links)
        {
            String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int responseCode = conn.getResponseCode();
            System.out.println(responseCode);
            if (responseCode >400)
               {
                  System.out.println("The link with Text" + link.getText()+ "is broken with code "+responseCode);
                Assert.assertTrue(false);
               }


        }
    }
}


