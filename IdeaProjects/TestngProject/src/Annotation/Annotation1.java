package Annotation;

import org.testng.annotations.*;

public class Annotation1 {
    @BeforeClass
    void beforeClass(){
        System.out.println("This test execute before class");
    }
    @AfterClass
    void afterClass(){
        System.out.println("This test execute after class");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("This test execute before every method");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This test execute after every method");
    }
    @Parameters({"URL"})
    @Test
    public void test1(String urlName) {
        System.out.println("This is first test");
        System.out.println(urlName);
    }
    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[2][1];
        data[0][0]="firstname";
        data[0][1] = "first@123";

        data[1][0] = "secondname";
        data[1][1] = "second@123";

        data[2][0] = "thirdname";
        data[2][1] = "third@123";
    return data;}

    @Test
    void test2() {
        System.out.println("This is second test");
    }
    @Test
    void test3() {
        System.out.println("This is third test");
    }
    @BeforeSuite
    void beforeSuite(){
        System.out.println("This test will execute before suite");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("This test will execute after suite");
    }

}


