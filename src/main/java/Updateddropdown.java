import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Updateddropdown {
    public static void main(String[] args) throws InterruptedException {

        {
            ChromeOptions op = new ChromeOptions();
            op.setBinary("C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
            WebDriver driver = new ChromeDriver(op);
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
            {
                System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
            }
            Thread.sleep(2000);
            //int i = 1;
            //while (i < 5) {
            for (int i = 1; i < 5; i++) {
                driver.findElement(By.id("hrefIncAdt")).click();
            }
            driver.findElement(By.id("btnclosepaxoption")).click();
            {
                System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


            }
        }
    }


}