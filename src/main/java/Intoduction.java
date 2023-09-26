import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class Intoduction {
    public static void main(String[] args) {
      //ChromeOptions op = new ChromeOptions();
        //op.setBinary
         //System.setproperty ("webdriver.gecko.driver " "\\Users\\Coditas\\Downloads\\geckodriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://courses.rahulshettyacademy.com/courses");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit();

    }
}
