import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentframe {
    public static void main(String[] args)  {
        System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\Coditas\\\\Downloads\\\\V4-Automation-master\\\\V4-Automation-master\\\\V4-Automation-master\\\\src\\\\main\\\\resources\\\\chrome\\\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Nested Frames")).click();
        driver.switchTo().frame("frame-top");

            driver.switchTo().frame("frame-middle");

            System.out.println(driver.findElement(By.id("content")).getText());

}



}

