import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {

        public static void main(String[] args)
        {
            String text="Poonam";
                ChromeOptions op = new ChromeOptions();
                op.setBinary("C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
                WebDriver driver = new ChromeDriver(op);
                driver.get("https://rahulshettyacademy.com/AutomationPractice/");
                driver.findElement(By.id("name")).sendKeys(text);
                driver.findElement(By.cssSelector("[id='alertbtn']")).click();
                System.out.println( driver.switchTo().alert().getText());
                driver.switchTo().alert().accept( );
                driver.findElement(By.id("confirmbtn")).click();
            System.out.println( driver.switchTo().alert().getText());
            driver.switchTo().alert().dismiss();



            }
        }



