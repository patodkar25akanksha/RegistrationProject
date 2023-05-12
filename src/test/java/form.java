import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class form {

@Test
    public void registration() {
        System.setProperty("webdriver.Chrome.driver","C:\\Users\\Akanksha\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        driver.manage().window().maximize();
        WebElement firstname  = driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
        firstname.sendKeys("Riya");

        WebElement lastname  = driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]"));
        lastname.sendKeys("Roy");

        WebElement phone  = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]"));
        phone.sendKeys("9865367532");

        WebElement email  = driver.findElement(By.xpath("//input[@id='userName']"));
        email.sendKeys("riyaroy@gmail.com");

        WebElement adress  = driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]"));
        adress.sendKeys("Manik nagar");

        WebElement city  = driver.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]"));
        city.sendKeys("Pune");

        WebElement state  = driver.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]"));
        state.sendKeys("Maharashtra");

        WebElement postalcode  = driver.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]"));
        postalcode.sendKeys("442003");

        Select country = new Select(driver.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]")));
        country.selectByValue("INDIA");

        WebElement username  = driver.findElement(By.xpath("//input[@id='email']"));
        username.sendKeys("riyaroy@gmail.com");

        WebElement password  = driver.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]"));
        password.sendKeys("riya&123");

        WebElement confirmpassword  = driver.findElement(By.xpath("//tbody/tr[15]/td[2]/input[1]"));
        confirmpassword.sendKeys("riya&123");

        WebElement submit = driver.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]"));

        if(submit.isEnabled()){
            submit.click();
        }








    }
}



