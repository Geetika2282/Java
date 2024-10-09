package Phonebook;

public class Contact {

    private String name;
    private int phoneNumb;
    public Contact(String name, int phoneNumber){
        this.name = name;
        this.phoneNumb = phoneNumber;
    }
    public String getName() {
        return name;
    }

    public int getPhoneNumb() {
        return phoneNumb;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumb=" + phoneNumb +
                '}';
    }
}
