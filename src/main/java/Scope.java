import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.chord;

public class Scope {
    public static void main(String[] args) {


        System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\Coditas\\\\Downloads\\\\V4-Automation-master\\\\V4-Automation-master\\\\V4-Automation-master\\\\src\\\\main\\\\resources\\\\chrome\\\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());
        for (int i = 1; i < (columndriver.findElements(By.tagName("a")).size()); i++)
        {
            String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
        }


    }
}


