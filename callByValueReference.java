class Car{
    String name;
    float mileage;
    int cost;
}


public class callByValueReference {
    public static void main(String[] args) {
        // 'c' is an object reference variable pointing to a new Car object created in memory.
        Car c = new Car();
        c.name = "BMW";
        c.mileage = 5.5f;
        c.cost = 75;
        System.out.println(c.cost + " " + c.mileage + " " + c.name);


        // 'b' is an object reference variable, but it doesn't reference any Car object yet (it's null).
        Car b;

        // 'b' now references the same Car object as 'c', so both will have the same values.
        b = c;
        System.out.println(b.cost + " " + b.mileage + " " + b.name);


        b.name = "Audi";
        // Modifying 'b.name' will also change 'c.name' because both 'b' and 'c' refer to the same object.
        System.out.println(b.name);
        System.out.println(c.name);
    }
}
