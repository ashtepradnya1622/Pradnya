
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class One {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions op = new ChromeOptions();
        op.setBinary("C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
        WebDriver driver = new ChromeDriver(op);

//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        Thread.sleep(3000);
        List<WebElement> Options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement Option : Options)
        {
            if (Option.getText().equalsIgnoreCase("india"))
            {
                Option.click();
                break;
            }

//
//            }
//    driver.findElement(By.id("autosuggest")).sendKeys("ind");
//
//            Thread.sleep(3000);
//
//            List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//
//        for(WebElement option :options)
//
//        {
//
//        if(option.getText().equalsIgnoreCase("India"))
//
//        {
//
//        option.click();
//
//        break;

        }

    }
}






