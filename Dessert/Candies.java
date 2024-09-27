package Dessert;

public class Candies extends Dessert{
    protected float total;
    protected int qty;
    protected float price=15;

    public Candies(int qty){
        super(qty);
        this.qty = qty;

    }

    public float calculatePrice() {
        this.total = this.qty * this.price;
        return this.total;
    }


}
