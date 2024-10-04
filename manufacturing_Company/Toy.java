package manufacturing_Company;

public class Toy
{
    private int pdtID;
    private String name;
    private double price;
    private String category;
    private int age;
    private int purchaseMonth;
    private int year;

    public Toy(int pdtID, String name, double price, int age, int purchaseMonth, int year, String category){
        this.pdtID = pdtID;
        this.name = name;
        this.price = price;
        this.age = age;
        this.purchaseMonth = purchaseMonth;
        this.year = year;
        this.category = category;
    }
    //    getter for pdtID
    public int getPdtID(){
        return pdtID;
    }

//    setter for pdtID

    public void setPdtID(int pdtID){
        this.pdtID = pdtID;
    }

    //    getter for name
    public String getName(){
        return name;
    }

    //    setter for name
    public void setName(String name){
        this.name = name;
    }

    // getter for price
    public double getPrice(){
        return price;
    }

    // setter for price
    public void setPrice(double price){
        this.price = price;
    }

    // getter for age
    public int getAge(){
        return age;
    }

    // setter for age
    public void setAge(int age){
        this.age = age;
    }

    // Getter for purchaseMonth
    public int getPurchaseMonth() {
        return purchaseMonth;
    }

    // Setter for purchaseMonth
    public void setPurchaseMonth(int purchaseMonth) {
        this.purchaseMonth = purchaseMonth;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }


    // Getter for year
    public String getCategory() {
        return category;
    }

    // Setter for year
    public void getCategory(String category) {
        this.category = category;
    }

    // Override toString to provide a string representation of the Toy object
    @Override
    public String toString() {
        return "[Name = "+name + ", Price = "+price + "]";
    }
}