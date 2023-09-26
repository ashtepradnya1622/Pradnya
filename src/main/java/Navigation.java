import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {

        {
            ChromeOptions op = new ChromeOptions();
            op.setBinary("C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
            WebDriver driver = new ChromeDriver(op);
            driver.manage().window().maximize();
            driver.get("https://www.google.com/search?q=google+.com&rlz=1C1CHBF_enIN954IN954&oq=google+.com&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTINCAEQABiDARixAxiABDIHCAIQABiABDIHCAMQABiABDIGCAQQRRg8MgYIBRBFGEEyBggGEEUYQTIGCAcQRRhB0gEIMjYwNGowajeoAgCwAgA&sourceid=chrome&ie=UTF-8");
            driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
            driver.navigate().back();
            driver.navigate().forward();


        }
    }
}

