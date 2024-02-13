package Annotation;

import org.testng.annotations.*;

public class Annotation2 {
    @BeforeMethod
    void beforeMethod(){
        System.out.println("This test execute before every method");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This test execute after every method");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("This test execute before class");
    }
    @AfterClass
    void afterClass(){
        System.out.println("This test execute after class");
    }
    @Test
    void test4(){
        System.out.println("This is a test4");
    }
    @Test
    void test5(){
        System.out.println("This is a test5");
    }
    @BeforeTest
    void beforeTest(){
        System.out.println("This is a before starting test");
    }
    @AfterTest
    void afterTest(){
        System.out.println("This is a after completion test");
    }
}

