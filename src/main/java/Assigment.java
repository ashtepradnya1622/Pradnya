
import java.util.List;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



    public class Assigment {



        public static void main(String[] args) {

// TODO Auto-generated method stub



            WebDriver driver = new ChromeDriver();



            driver.get("https://rahulshettyacademy.com/AutomationPractice/");

            WebElement table=driver.findElement(By.xpath("//table[@id='product']"));



            int rows= table.findElements(By.tagName("tr")).size();

            System.out.println("total number of rows:"+rows);



            int column= table.findElements(By.tagName("th")).size();

            System.out.println("Total number of columns:"+ column);

//printing number of columns

            System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());





            List<WebElement> data= table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



            System.out.println(data.get(0).getText());

            System.out.println(data.get(1).getText());

            System.out.println(data.get(2).getText());



        }




        }

