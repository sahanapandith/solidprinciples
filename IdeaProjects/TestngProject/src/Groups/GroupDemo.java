package Groups;

import org.testng.annotations.Test;

public class GroupDemo {
    @Test(groups = { "sanity"})
    void test1(){
        System.out.println("this is first test");
    }
    @Test(groups = {"unit"})
    void test2(){
        System.out.println("this is second test");
    }
    @Test(groups={"sanity"})
    void test3(){
        System.out.println("this is third test");
    }
    @Test (groups={"regression"})
    void test4(){
        System.out.println("this is fourth test");
    }
    @Test (groups = {"unit"})
    void test5(){
        System.out.println("this is fifth test");
    }
    @Test(groups  ={"sanity", "regression", "unit"})
    void test6(){
        System.out.println("this is sixth test");
    }
}
