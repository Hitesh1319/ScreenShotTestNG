package PagesTest;

import Pages.BaseClass;
import org.testng.annotations.Test;

public class ScreenShot extends BaseClass {
    @Test()
    public void login(){
        pageFactory.getLogin().login();
        driver.close();
    }

}