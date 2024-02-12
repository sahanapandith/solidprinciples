package dsp;

public interface Product {
    void seeReviews();
    void getSample();
}

class DipFollows{
    public static void main(String[] args) {
        Shelf s = new Shelf();
        s.customizeShelf();
    }
}
