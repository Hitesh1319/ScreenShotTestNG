package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By admin = By.linkText("admi");
    By adminClick = By.linkText("Admin");
    By search = By.xpath("//input[@placeholder='Search']");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void homePage() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(admin).click();
    }

    public void adminClick() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(adminClick).click();
    }

    public void username() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(search).click();
        driver.findElement(admin).click();
    }
}
