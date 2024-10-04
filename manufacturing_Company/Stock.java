package manufacturing_Company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stock {
    private List<Toy> toyList;
    public Stock(){
        this.toyList = addToys();
    }
    public List<Toy> addToys() {
        Toy t1 = new Toy(1, "Ludo", 550, 10, 3, 2012, "Board game");
        Toy t2 = new Toy(2, "Chess", 250, 9, 3, 2012, "Board game");
        Toy t3 = new Toy(3, "Football", 300, 9, 3, 2024, "Outdoor");
        Toy t4 = new Toy(4, "Remote controlled car", 150, 9, 3, 2012, "Battery operated");
        Toy t5 = new Toy(5, "Building Blocks", 920, 6, 1, 2024, "Educational");
        Toy t6 = new Toy(6, "Action Figure", 450, 12, 7, 2019, "Outdoor");
        Toy t7 = new Toy(7, "Puzzle", 2000, 5, 4, 2024, "Educational");
        Toy t8 = new Toy(8, "Drone", 600, 10 , 8, 2023, "Battery operated");


//      List of toys
        List<Toy> toylist = new ArrayList<>(Arrays.asList(t1, t2, t3, t4, t5, t6, t7, t8));
        return toylist;
        /*-----------------------
//        Created a stream named data that converts toylist into stream
        Stream<Toy> data = toylist.stream();
//        List to stream
        toylist.stream()
                .forEach(toy -> System.out.println(toy));
        return data;-----------------*/
    }

    public List<Toy> filterToy(String criteria){
        return toyList.stream()
                .filter(toy -> toy.getCategory().equals(criteria)) //filtering by category; criteria will be given as argument
                .collect(Collectors.toList());
    }

    public List<Toy> byPrice(){
        return toyList.stream()
                .filter(toy -> toy.getPrice()>500 & (toy.getPrice()<1000)).collect(Collectors.toList());
    }

     public List<Toy> sortPrice(){
        return toyList.stream().sorted(Comparator.comparing(Toy::getPrice)).collect(Collectors.toList());
    }
    public List<Toy> oldStock(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return toyList.stream().filter(toy -> currentYear-toy.getYear()>1).collect(Collectors.toList());
    }

    // Method to group toys by category using streams
    public Map<String, List<Toy>> groupByCategory(List<Toy> toylist) {
        return toylist.stream()
                .collect(Collectors.groupingBy(Toy::getCategory));
    }

    public Optional<Toy> maxPrice(){
        return toyList.stream()
                .max(Comparator.comparingDouble(Toy::getPrice));
    }

    public Optional<Toy> minPrice(){
            return toyList.stream()
                    .min(Comparator.comparingDouble(Toy::getPrice));
        }

        public Map<Integer, Long> countByAgeGroup(){
            return toyList.stream()
                    .collect(Collectors.groupingBy(Toy::getAge, Collectors.counting()));
        }

    public static void main(String[] args) {
        // List the stock
        Stock s1 = new Stock();
        List<Toy> toyList = s1.addToys();
        System.out.println("-----------All toys----------- ");
        toyList.forEach(toy-> System.out.println(toy));

        System.out.println("-----------Filter toys (Category: Battery operated)-----------");
        List<Toy> filtered = s1.filterToy("Battery operated");
        filtered.forEach(toy-> System.out.println(toy));

        System.out.println("-----------Filter by price range-----------");
        List<Toy> priceToy = s1.byPrice();
        priceToy.stream().forEach(toy -> System.out.println(toy));
        System.out.println("-----------List-----------");
        priceToy.forEach(toy -> System.out.println(toy));

        System.out.println("-----------Sort toys by price range-----------");
        List<Toy> sortPrice = s1.sortPrice();
        sortPrice.forEach(toy -> System.out.println(toy));

        System.out.println("-----------Old stock-----------");
        List<Toy> oldToys = s1.oldStock();
        oldToys.forEach(toy -> System.out.println(toy));

        System.out.println("-----------Toys Grouped by Category-----------");
        Map<String, List<Toy>> groupedByCategory = s1.groupByCategory(toyList);
        groupedByCategory.forEach((category, toys) -> {
            System.out.println(category + ": " + toys);
        });

        System.out.println("-----------Most/ Least expensive-----------");
        System.out.println("Most expensive: "+s1.maxPrice());
        System.out.println("Least expensive: "+s1.minPrice());

        System.out.println("-----------Group toys by age-----------");
        System.out.println(s1.countByAgeGroup());

    }
}
