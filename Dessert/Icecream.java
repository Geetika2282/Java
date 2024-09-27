package Dessert;

public class Icecream extends Dessert {
    protected float total;
    protected int qty;
    protected float price = 10;

    public Icecream(int qty){
        super(qty);
    }

    @Override
    public float calculatePrice(){
        this.total = this.qty * this.price;
        return this.total;
    }
}
