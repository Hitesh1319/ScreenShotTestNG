package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    protected Login login;
    protected HomePage homePage;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public Login getLogin() {
        if (login == null) {
            login = new Login(driver);
        }
        return login;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }
}