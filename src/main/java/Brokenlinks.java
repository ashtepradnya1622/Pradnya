import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import static javafx.scene.input.KeyCode.U;

public class Brokenlinks
{
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        String url =driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
        //HttpURLConnection  conn =(HttpURLConnection ) new URL(url).openConnection();
       HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
       conn.setRequestMethod("HEAD");
       conn.connect();
       int responseCode =conn.getResponseCode();
        System.out.println(responseCode);


    }
}
