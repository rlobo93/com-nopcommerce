package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

     static String baseUrl = "https://www.nopcommerce.com/demo";
        static String browser = "Edge";
        static WebDriver driver;

        public static void main(String[] args) {

            if(browser.equalsIgnoreCase("Chrome")){

                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
                driver.get(baseUrl);
                driver.manage().window().maximize();

            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver =new FirefoxDriver();

            }else if (browser.equalsIgnoreCase("Edge")){
                System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
                driver = new EdgeDriver();

            } else {
                System.out.println("Wrong browser name");
            }
            driver.get(baseUrl);
            driver.manage().window().maximize();
            WebElement emailfield = driver.findElement(By.id("Email"));
            emailfield.sendKeys("rlobo@gmail.com");

            WebElement passwordfield = driver.findElement(By.name("Password"));
            passwordfield.sendKeys("Pass123?");
            driver.close();

        }

    }



