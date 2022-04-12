package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {

    public static void main(String[] args) {
        String Url = "https://demo.nopcommerce.com";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(Url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current Url"+ driver.getCurrentUrl());

        String login = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.out.println("Page Resource: "+driver.getPageSource());

        driver.navigate().to(login);
        System.out.println("Page Login"+login);

        WebElement emailfield = driver.findElement(By.id("Email"));
        emailfield.sendKeys("rlobo@gmail.com");

        WebElement passwordfield = driver.findElement(By.name("Password"));
        passwordfield.sendKeys("Pass123?");

        driver.close();



    }
}
