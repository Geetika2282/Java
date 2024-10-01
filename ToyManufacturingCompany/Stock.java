/* For a Toy manufacturing company, create an app to perform basic operations on the stock
The Toy data has:
        . product id name
        . price
        . category
        . age [to present age appropriate toys]
        . purchase month, year
        1. List the Stock
        2. Filter the stock by category [e.g. Educational / Battery operated etc.] 3. Search toy in the list by using binarySearch (with prodid as key)
        4. List Toys by price range
        5. List toys for a specific age
        6. Sort the toys by price, name, prodid
        7. Make the list of old stock [older than 1 year] 8. Make a group of toys as per their category
*/

package ToyManufacturingCompany;

import java.util.*;

public class Stock{
//    Method to add toys in toylist
    public List<Toy> addToys(){
        List<Toy> toylist = new ArrayList<>();

        // Adding toy instances to the toy list
        toylist.add(new Toy(1, "Ludo", 150, 10, 3, 2012, "Board game"));
        toylist.add(new Toy(2, "Chess", 250, 12, 1, 2022, "Board game"));
        toylist.add(new Toy(3, "Football", 400, 9, 12, 2023, "Outdoor"));
        toylist.add(new Toy(4, "World map puzzle", 300, 11, 10, 2024, "Educational"));
        toylist.add(new Toy(5, "Remote controlled car", 600, 9, 2, 2018, "Battery operated"));

        return toylist;
    }

    // Printing on basis of pdtID
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
        System.out.println("Toy not found");
        return null;
    }

// Filter on basis of category
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

// Binary search method using pdtID
    public Toy binarySearchToyById(List<Toy> toyList, int pdtID) {

// Sort before applying binary search
        Collections.sort(toyList, Comparator.comparingInt(Toy::getPdtID));

// Binary Search
        int low = 0;
        int high = toyList.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Toy midToy = toyList.get(mid);

            if (midToy.getPdtID() == pdtID) {
                return midToy; // pdtID found
            }
            else if (midToy.getPdtID() < pdtID) {
                low = mid + 1; // Search in the right half
            }
            else {
                high = mid - 1; // Search in the left half
            }
        }
        return null; // pdtID not found
    }

// Filter toys by specified age
    public List<Toy> filterByAge(List<Toy> toyList, int specifiedAge) {
        List<Toy> filteredToys = new ArrayList<>();
        for (Toy toy : toyList) {
            if (toy.getAge() == specifiedAge) {
                filteredToys.add(toy);
            }
        }
        return filteredToys;
    }

// Sort toys by price
    public List<Toy> sortByPrice(List<Toy> toyList) {
        Collections.sort(toyList, Comparator.comparingDouble(Toy::getPrice));  // Sort by price
        return toyList;
    }

// Sort toys by name
    public List<Toy> sortByName(List<Toy> toyList) {
        Collections.sort(toyList, Comparator.comparing(Toy::getName));  // Sort by name
        return toyList;
    }

// Sort toys by pdtID
    public List<Toy> sortByPdtID(List<Toy> toyList) {
        Collections.sort(toyList, Comparator.comparingInt(Toy::getPdtID));  // Sort by pdtID
        return toyList;
    }

// Returns toys older than 1 year (compared to present date)
    public List<Toy> oldToys(List<Toy> toyList) {
        List<Toy> oldToys = new ArrayList<>();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        for (Toy toy : toyList) {
            if (currentYear - toy.getYear() > 1) {
                oldToys.add(toy);
            }
        }
        return oldToys;
    }

//   ------------------Main method-----------------
    public static void main(String[] args) {
        Stock st = new Stock();
        List<Toy> toyList = st.addToys();

//  1. Listing the stock (all toys)
        st.printlist(toyList, 2);

//  2. Filter the stock by category
        System.out.println("------------Outdoor games-----------");
        List<Toy> indoor = st.filterToy(toyList, "Outdoor");
        List<Toy> educational = st.filterToy(toyList, "Educational");

//  Print filtered toys
        for (Toy t : indoor) {
            System.out.println(t);
        }


//  3. Using binary search to search toy with pdtID = 2
        System.out.println("-----------Binary search-------------");

        Toy result = st.binarySearchToyById(toyList, 2);
        if (result != null) {
            System.out.println("Toy found: " + result);
        } else {
            System.out.println("Toy not found.");
        }

//  4. List Toys by price range
        System.out.println("----------Price Map------------");
        Map<Integer, Double> priceMap = st.priceMap(toyList); // Get price map
        for (Map.Entry<Integer, Double> entry : priceMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue()); // Print the price map
        }

//  5. List toys by specific age
        System.out.println("------------Toys for Age 9-----------");
        List<Toy> toysForAge9 = st.filterByAge(toyList, 9);  // Get toys for age 9
        for (Toy t : toysForAge9) {
            System.out.println(t);
        }

//  6.1 Sort by price
        System.out.println("----------Sorted by Price------------");
        List<Toy> sortedByPrice = st.sortByPrice(toyList);
        for (Toy t : sortedByPrice) {
            System.out.println(t);
        }

//  6.2 Sort by name
        System.out.println("----------Sorted by Name------------");
        List<Toy> sortedByName = st.sortByName(toyList);
        for (Toy t : sortedByName) {
            System.out.println(t);
        }

//  6.3 Sort by pdtID
        System.out.println("----------Sorted by pdtID------------");
        List<Toy> sortedByPdtID = st.sortByPdtID(toyList);
        for (Toy t : sortedByPdtID) {
            System.out.println(t);
        }

//  7. Filter and list toys older than 1 year
        System.out.println("----------Toys older than 1 year------------");
        List<Toy> oldToys = st.oldToys(toyList);
        for (Toy t : oldToys) {
            System.out.println(t);
        }

//  8. Print on basis of category (educational)
        System.out.println("------------Educational games-----------");

        for (Toy t : educational) {
            System.out.println(t); // Print each filtered toy
        }

    }



}
