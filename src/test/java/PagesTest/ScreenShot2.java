package PagesTest;

import Pages.BaseClass;
import org.testng.annotations.Test;

public class ScreenShot2 extends BaseClass {
    @Test()
    public void Test2() {
        pageFactory.getLogin().loginTest();
        pageFactory.getHomePage().homePage();
    }
}
