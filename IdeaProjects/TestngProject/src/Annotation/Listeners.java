package Annotation;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
public void onTestSkipped(ITestResult result){
System.out.println("this the skipped testcase");
}
}
