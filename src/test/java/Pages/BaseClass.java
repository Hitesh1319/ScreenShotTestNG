package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class BaseClass {
    public static WebDriver driver;
    protected static PageFactory pageFactory;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pageFactory = new PageFactory(driver);
    }

    //    @AfterMethod
//    public void screenShot(ITestResult result) {
//        if (ITestResult.FAILURE == result.getStatus()) {
//            try {
//                TakesScreenshot screenshot = (TakesScreenshot) driver;
//                File src = screenshot.getScreenshotAs(OutputType.FILE);
//                FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"\\screenshot\\" + result.getName() + ".png"));
//                //FileUtils.copyFile(src, new File("C:\\Users\\HiteshSharma\\IdeaProjects\\TestNgScreenShot\\Screenshot\\" + result.getName() + ".png"));
//                System.out.println("Successfully captured a screenshot");
//            } catch (Exception e) {
//                System.out.println("Exception while taking screenshot " + e.getMessage());
//            }
//        }
//    }
    public void getScreenShot() throws IOException {
        Date date = new Date();
        String fileName = date.toString().replace(" ", "_").replace(":","_");
        File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShotFile, new File("C:\\Users\\HiteshSharma\\IdeaProjects\\TestNgScreenShot\\Screenshot\\" + fileName + ".jpg"));
    }

//    @AfterTest
//    public void driverClose() {
//        driver.close();
//    }
}