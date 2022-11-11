package ListnerClass;

import Pages.BaseClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listener extends BaseClass implements ITestListener {

    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }


    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
    }

    public void onTestFailure(ITestResult result) {
        try {
            getScreenShot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
