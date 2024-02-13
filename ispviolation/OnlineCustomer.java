package ispviolation;

public class OnlineCustomer implements OnlineTransaction {
    public void bankApp() {
        System.out.println("pay through bank application");
    }

    public void payPal() {
        System.out.println("pay through paypal");
    }

    public void phonePe() {
        System.out.println("pay through phonepe");
    }
}
