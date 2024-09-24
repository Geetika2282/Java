public class InterestRt {
    private int accid;
    private String name;
    private static float intrate = 0.05f; // Example interest rate initialization

    // Default constructor
    public InterestRt() {
        this(10000, "aaaa");
    }

    // Parameterized constructor
    public InterestRt(int accid, String name) {
        this.accid = accid;
        this.name = name;
    }

    // Static method to display interest rate
    public static void displayInterestRate() {
        System.out.println("Current interest rate for account: " + intrate);
    }

    // Optional: A setter for the interest rate (if you want to modify it)
    public static void setInterestRate(float newRate) {
        intrate = newRate;
    }
    public static void main(String[] args) {
        InterestRt account1 = new InterestRt(); // Uses default constructor
        InterestRt.displayInterestRate();

        InterestRt account2 = new InterestRt(12345, "John Doe"); // Parameterized constructor
        InterestRt.displayInterestRate();

        InterestRt.setInterestRate(0.07f); // Change the interest rate
        InterestRt.displayInterestRate();
    }
