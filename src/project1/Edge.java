package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

/**
 * 1. Setup Edge browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 *
 */

public class Edge {
    public static void main(String[] args) {
        String Url = "https://demo.nopcommerce.com";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
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
