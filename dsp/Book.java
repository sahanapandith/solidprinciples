package dsp;

public class Book implements Product {
    @Override
    public void seeReviews() {
        System.out.println("see reviews of book");
    }

    public void getSample() {
        System.out.println("get sample of book");
    }
}
