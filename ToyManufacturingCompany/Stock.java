package ToyManufacturingCompany;

import java.util.*;

public class Stock{
    public List<Toy> addToys(){
        // Method to add toys to a list
            List<Toy> toylist = new ArrayList<>(); // Initialize the toy list

            // Adding toy instances to the toy list
            toylist.add(new Toy(1, "Ludo", 150, 10, 3, 2012, "Board game"));
            toylist.add(new Toy(2, "Chess", 250, 12, 1, 2022, "Board game"));
            toylist.add(new Toy(3, "Football", 400, 9, 12, 2002, "Outdoor"));
            toylist.add(new Toy(4, "World map puzzle", 300, 11, 10, 2024, "Educational"));
            toylist.add(new Toy(5, "Remote controlled car", 600, 9, 2, 2018, "Battery operated"));

            return toylist; // Return the list of toys
        }

        // Method to print a toy from the list based on pdtID

        public Toy printlist(List <Toy> toyList, int pdtID)
        {
        for(Toy toy: toyList)
        {
            if(toy.getPdtID() == pdtID)
            {
                System.out.println("Result of search by id: "+toy);
                return toy;
            }
        }
            System.out.println("Result of search by id: Toy not found");
            return null;
        }

        public List<Toy> filterToy(List<Toy> toyList, String criteria){
            List<Toy> filtered = new ArrayList<>();
            for(Toy t: toyList){
                if (t.getCategory().contains(criteria)){
                    filtered.add(t);
                }
            }
            return filtered;
        }

    // Method to create a map of product IDs and their prices
    public Map<Integer, Double> priceMap(List<Toy> toyList)
        {
            Map<Integer, Double> priceMap = new TreeMap<>(); // TreeMap to hold product ID and price
            for(Toy t: toyList){
                priceMap.put(t.getPdtID(), t.getPrice());
            }
            return priceMap;
        }

//        Main method
    public static void main(String[] args) {
       Stock st = new Stock();
       List<Toy> toyList = st.addToys();

//       Listing the stock (all toys)
       st.printlist(toyList, 2);

//       Filter the stock by category
        System.out.println("------------Outdoor games-----------");
        List<Toy> indoor = st.filterToy(toyList, "Outdoor");
        List<Toy> educational = st.filterToy(toyList, "Educational");


        // Print filtered toys
        for (Toy t : indoor) {
            System.out.println(t); // Print each filtered toy
        }

        System.out.println("------------Educational games-----------");

        for (Toy t : educational) {
            System.out.println(t); // Print each filtered toy
        }

        System.out.println("----------Price Map------------");
        Map<Integer, Double> priceMap = st.priceMap(toyList); // Get price map
        for (Map.Entry<Integer, Double> entry : priceMap.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue()); // Print the price map
        }


    }

}
