package Dessert;
public abstract class Dessert {

    public int price;
    public int qty;

    public Dessert(int qty) {
    this.qty = qty;
    }

    public abstract float calculatePrice();


}
