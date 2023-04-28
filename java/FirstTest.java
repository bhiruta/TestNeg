import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver driver;

    @Test(priority = 1)
    void openBrowser() {
        System.out.println("Open Browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/ ");

    }

    @Test(priority = 2)
    void Register() {
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Dhara");
        driver.findElement(By.name("LastName")).sendKeys("Panchal");

        driver.findElement(By.name("DateOfBirthDay")).sendKeys("21");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("Feb");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1981");

        driver.findElement(By.id("Email")).sendKeys("dharapanchal@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("abcd");
        driver.findElement(By.id("Password")).sendKeys("dhara1234");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("dhara1234");
        driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();


    }

    @Test(priority = 3)
    void login() {

        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.id("Email")).sendKeys("dharapanchal@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("dhara1234");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }

    @Test(priority = 4)
    void logout() {
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
    }

    @Test(priority = 5)
    void closeBrowser() {
        System.out.println("Close Browser");
        driver.close();

    }

}






