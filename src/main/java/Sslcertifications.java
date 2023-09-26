import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sslcertifications {
    public static void main(String[] args)
    {
        ChromeOptions options=new ChromeOptions();

        options.setAcceptInsecureCerts(true);
        WebDriver driver= new ChromeDriver(options);
        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
        driver.manage().window().maximize();
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());

    }
}
