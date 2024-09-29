import java.util.ArrayList;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }
    private void resize(){
        int[] temp = new int[data.length * 2];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        CustomArrayList list = new CustomArrayList();
    }

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList <String>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Porsche");
        System.out.println(cars);

        // Inserting an element at beginning of arrayList
        cars.add(0, "Lamborghini");
        System.out.println(cars);

        // Accessing an element
        System.out.println(cars.get(0));

        // Change an element
        cars.set(0, "Rolls Royce");

        // Remove an item
        cars.remove(2);
        System.out.println(cars);

        // Remove all elements of ArrayList: returns empty list
        cars.clear();
        System.out.println(cars);

        // To find size of ArrayList
        System.out.println(cars.size());


        ArrayList<String> car = new ArrayList<String>();
        car.add("Volvo");
        car.add("BMW");
        car.add("Ford");
        car.add("Mazda");

        // Loop through an ArrayList
        for (int i=0; i<car.size(); i++){
            System.out.println(car.get(i));
        }

        // ArrayList using for each
        for(String i: car){
            System.out.println(i);
        }

        
    }
}
