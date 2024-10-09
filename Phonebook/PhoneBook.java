package Phonebook;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.*;

public class PhoneBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(String name, int phoneNum) throws IllegalArgumentException{
        for(Contact cont: contacts){
            if(cont.getName().equalsIgnoreCase(name)){
                throw new IllegalArgumentException("Contact already exists!");
            }
        }
        contacts.add(new Contact(name, phoneNum));
        System.out.println("Contact added");
    }

//    Ans 2
    public void displayAllContact(){
        if(contacts.isEmpty()){
            System.out.println("No contacts saved");
        }
        else {
            for(Contact cont: contacts){
                System.out.println(cont);
            }
        }
    }

//    Search
    public Contact searchContact(String name) throws NoSuchElementException{
        for(Contact cont: contacts){
            if(cont.getName().equalsIgnoreCase(name)){
                return cont;
            }
        }
        throw new NoSuchElementException("Doesn't exist");
    }

//    Delete
    public void deleteCont(String name) throws NoSuchElementException{
        Contact contDelete = searchContact(name);
        contacts.remove(contDelete);
        System.out.println("Deleted");
    }

//    main
public static void main(String[] args) {
    PhoneBook phoneBook = new PhoneBook();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter choice: \n1. Add contact \n2.Display all \n3.Search contact \n4. Delete contact \n5. Exit");
    while (true) {
        try {
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the contact name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the phone number: ");
                    int phoneNumber = sc.nextInt();
                    try {
                        phoneBook.addContact(name, phoneNumber);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    phoneBook.displayAllContact();
                    break;

                case 3:
                    System.out.print("Enter the name to search: ");
                    String searchName = sc.nextLine();
                    try {
                        Contact foundContact = phoneBook.searchContact(searchName);
                        System.out.println("Contact found: " + foundContact);
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Enter the name of the contact to delete: ");
                    String deleteName = sc.nextLine();
                    try {
                        phoneBook.deleteCont(deleteName);
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Exiting the phonebook. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
            sc.next();
        }
    }
    }
}


