//import java.time.Duration;
//import java.util.Arrays;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.jetbrains.annotations.NotNull;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//    public class Cart {
//        public static void main(String[] args) {
//            // TODO Auto-generated method stub
//            String[] items = { "Beetroot", "Carrot", "Mushroom", "Walnuts" };
//            {
//                ChromeOptions op = new ChromeOptions();
//                op.setBinary("C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
//                WebDriver driver = new ChromeDriver(op);
//            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//            addItem(driver, items);
//            proceedToCart(driver, wait);
//        }
//        public static void addItem(@NotNull WebDriver driver, String[] items) {
//            List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
//            int j = 0;
//            for (int i = 0; i < products.size(); i++) {
//                String prodName = products.get(i).getText().split("-")[0].trim();
//                List<String> ArrayItem = Arrays.asList(items);
//                if (ArrayItem.contains(prodName)) {
//                    driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//                    if (j == items.length)
//                        break;
//                }
//            }
//        }
//        public static void proceedToCart(@NotNull WebDriver driver, @NotNull WebDriverWait wait) {
//            driver.findElement(By.xpath("//img[@alt='Cart']")).click();
//            driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
//            driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
//            driver.findElement(By.cssSelector("button.promoBtn")).click();
//            System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//}
