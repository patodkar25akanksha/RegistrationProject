package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTrip {

    @Test
    public void booking(){
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\Akanksha\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        WebElement from  = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
        from.click();

        WebElement fr  = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
        fr.sendKeys("pune");

        WebElement city1  = driver.findElement(By.xpath("(//div[@class=\"calc60\"])[1]"));
        city1.click();

        WebElement to  = driver.findElement(By.xpath("(//input[@type=\"text\"])[3]"));
        to.click();
        to.sendKeys("Mumbai");

        WebElement city2  = driver.findElement(By.xpath("(//div[@class=\"calc60\"])[1]"));
        city2.click();

        WebElement departure  = driver.findElement(By.xpath(" //span[contains(text(),'Departure')]"));
        departure.click();

        WebElement date1  = driver.findElement(By.xpath("(//span[@class=\"font30 latoBlack\"])[1]"));
        date1.click();

        WebElement ret  = driver.findElement(By.xpath("//span[contains(text(),'Return')]"));
        ret.click();

        WebElement date  = driver.findElement(By.xpath("(//div[@class=\"dateInnerCell\"])[15]"));
        date.click();

        WebElement travellerclass  = driver.findElement(By.xpath("//span[@class=\"lbl_input appendBottom5\"]"));
        travellerclass.click();



    }
}
