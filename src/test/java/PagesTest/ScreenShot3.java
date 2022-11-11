package PagesTest;

import Pages.BaseClass;
import org.testng.annotations.Test;

public class ScreenShot3 extends BaseClass {
    @Test
    public void Test3() {
        pageFactory.getLogin().loginTest();
        pageFactory.getHomePage().adminClick();
        pageFactory.getHomePage().username();
    }
}
