package isp;

public interface PlaceOrder {
    public void placeOrder();
}
interface PayOrder {
    public void payOrder();
}

class Glocories implements PayOrder{
    @Override
    public void payOrder()
    {
        System.out.println("you can pay for order");
    }
}


