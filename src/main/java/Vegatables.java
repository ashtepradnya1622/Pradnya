//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class Vegatables
//{
//    public static void main(String[] args) throws InterruptedException
//    {
//
//        ChromeOptions op = new ChromeOptions();
//        op.setBinary("C:\\Users\\Coditas\\Downloads\\V4-Automation-master\\V4-Automation-master\\V4-Automation-master\\src\\main\\resources\\chrome\\chrome.exe");
//        WebDriver driver = new ChromeDriver(op);
//        int j=0;
//
//        String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
//
//



//        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
//
//        Thread.sleep(3000);
//
//        addItems(driver,itemsNeeded);
//
//        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
//
//        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//
//        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
//
//
//
//        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
//
//        driver.findElement(By.cssSelector("button.promoBtn")).click();
//
////explicit wait
//
//
//
//        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
//
//        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());










//
//    }
//
//    public static  void addItems(WebDriver driver,String[] itemsNeeded)
//
//    {
//
//        int j=0;
//
//        List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
//
//        for(int i=0;i<products.size();i++)
//
//        {

//Brocolli - 1 Kg

//Brocolli,    1 kg

            //String[] name=products.get(i).getText().split("-");

//            String formattedName=name[0].trim();
//
////format it to get actual vegetable name
//
////convert array into array list for easy search
//
////  check whether name you extracted is present in arrayList or not-
//
//            List itemsNeededList = Arrays.asList(itemsNeeded);
//
//            if(itemsNeededList.contains(formattedName))
//
//            {
//
//                j++;
//
////click on Add to cart
//
//                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//
//                if(j==itemsNeeded.length)
//
//                {
//
//                    break;
//
//                }
//
//            }
//
//        }
//
//    }
//
//
//
//}
////        int j = 0;
////
////
////
////
////        String[] itemsneeded = {"Cucumber", "Brocolli ", "Raspberry "};
////        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
////        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
////        for (int i = 0; i < products.size(); i++) {
////            String[] name = products.get(i).getText().split[].("-")[0];
////            String formatedname =
////            List <String> itemsneededlist = Arrays.asList(itemsneeded);
////
////            if (itemsneededlist.contains(formatedname)) {
////                j++;
////                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
////                if (j == 3)
////                {
////                    break;
////
////                }
////
////            }
////
////        }
////    }
////}
////
////
////
////
