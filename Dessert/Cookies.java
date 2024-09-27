package Dessert;

public class Cookies extends Dessert{
    protected float total;
    protected int qty;
    protected int price = 50;
//    protected int qty;

    public Cookies(int qty){
        super(qty);
        this.qty = qty;
    }

    public float calculatePrice(){
        this.total = this.qty * this.price;
        return this.total;
    }
}
