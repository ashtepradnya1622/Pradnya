import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown {
    public static void main(String[] args) throws InterruptedException {

        {
            ChromeOptions op = new ChromeOptions();
            op.setBinary("C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
            WebDriver driver = new ChromeDriver(op);
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
            WebElement staticDrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
            Select dropdown = new Select(staticDrop);
            dropdown.selectByIndex(3);
            System.out.println(dropdown.getFirstSelectedOption().getText());
            dropdown.selectByVisibleText("AED");
            System.out.println(dropdown.getFirstSelectedOption().getText());
            dropdown.selectByVisibleText("INR");
            System.out.println(dropdown.getFirstSelectedOption().getText());




        }
    }
}