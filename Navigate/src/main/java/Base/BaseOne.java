package Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;

public class BaseOne {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.geckodriver", "./src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //driver.close();
        driver.navigate().to(url: "https://www.youtube.com/");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(millis: 7000);
        driver.close();
        Dimension Size = driver.manage().window().getSize();
        System.out.println("The size of the window is : " + Size);
       int Height =  driver.manage().window().getSize().getHeight();
       System.out.println("The Height of the window is : " + Height);
       int width = driver.manage().window().getSize().getHeight();
        System.out.println("The Height of the window is : " + width);
        driver.manage().window().setSize(new Dimension( width: 1200, height: 600));
        if (driver.getTitle().equals("konnect-CHT"))
        {
            System.out.println("Title is correct");
        }
        else
        {
            System.out.println("Title is not correct");
        }
    }
}
