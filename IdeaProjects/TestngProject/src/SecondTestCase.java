import org.testng.annotations.Test;

public class SecondTestCase {
    @Test(priority=1)
    void setup()
    {
        System.out.println("this is to opening browsers");
    }
    @Test(timeOut = 4000)
    void searchCustomer()
    {
        System.out.println("this is to search for customer");
    }
    @Test(dependsOnMethods = {"setup", "searchCustomer"})
    void addCustomer()
    {
        System.out.println("this is to add a customer");
    }
    @Test(priority=4, enabled = false)
    void close()
    {
        System.out.println("this is to closing all browers");
    }
}

