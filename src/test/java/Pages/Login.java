package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;

    By userName = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By submit = By.xpath("//button[@type='sumit']");
    By submitButton = By.xpath("//button[@type='submit']");
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void login() {
        driver.findElement(userName).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(submit).click();
    }
    public void loginTest() {
        driver.findElement(userName).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(submitButton).click();
    }
}
