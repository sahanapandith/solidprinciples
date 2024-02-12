package isp;

public class Clothing implements PlaceOrder, PayOrder {
    @Override
    public void placeOrder() {
        System.out.println("you can place order");
    }

    @Override
    public void payOrder() {
        System.out.println("you can pay for order");
    }
}
