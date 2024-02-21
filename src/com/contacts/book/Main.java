package com.contacts.book;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To AddressBook");
        HashMap<String, AddressBook> dictionary = new HashMap<>();
        AddressBook Book = new AddressBook();
        Scanner input = new Scanner(System.in);
        int option;
        while (true) {
            System.out.println("Options are : ");
            System.out.print("1.Add Contact to existing address book\t");
            System.out.print("2.Edit Contact\t");
            System.out.print("3.Display Address Book\n");
            System.out.print("4.Delete Contact\t");
            System.out.print("5.Display available Address Books\t");
            System.out.print("6.Add new Address Book\n");
            System.out.print("7.Search a person by City\t");
            System.out.print("8.Sort by Person\t");
            System.out.println("9. Sort by City");
            option = input.nextInt();
            switch (option) {

                case 1:
                    System.out.println("Enter name of address book in which you want to add contact : ");
                    String addressBookName = input.next();
                    if (dictionary.containsKey(addressBookName)) {
                        System.out.println(addressBookName + " Address book exist.");
                        AddressBook addressBook = dictionary.get(addressBookName);
                        addressBook.getContactDetails();
                    } else {
                        System.out.println("Address Book does not exist");
                    }
                    break;
                case 2:
                    System.out.println("Enter name of address book in which you want to edit contact : ");
                    String addressBookName1 = input.next();
                    if (dictionary.containsKey(addressBookName1)) {
                        System.out.println(addressBookName1 + " Address book exist.");
                        AddressBook addressBook = dictionary.get(addressBookName1);
                        addressBook.editPersonDetails();
                    } else {
                        System.out.println("Address Book does not exist");
                    }
                    break;
                case 3:
                    System.out.println("Enter name of address book in which you want to display contact : ");
                    String addressBookName2 = input.next();
                    if (dictionary.containsKey(addressBookName2)) {
                        System.out.println(addressBookName2 + " Address book exist.");
                        AddressBook addressBook = dictionary.get(addressBookName2);
                        addressBook.displayContact();
                    } else {
                        System.out.println("Address Book does not exist");
                    }
                    break;
                case 4:
                    System.out.println("Enter name of address book in which you want to delete contact : ");
                    String addressBookName3 = input.next();
                    if (dictionary.containsKey(addressBookName3)) {
                        System.out.println(addressBookName3 + " Address book exist.");
                        AddressBook addressBook = dictionary.get(addressBookName3);
                        addressBook.deleteContact();
                    } else {
                        System.out.println("Address Book does not exist");
                    }
                    break;
                case 5:
                    if (dictionary.isEmpty()) {
                        System.out.println("Dictionary is empty");
                    } else {
                        System.out.println(dictionary.keySet());
                    }
                    break;
                case 6:
                    System.out.println("Enter name of address book you want to add to dictionary : ");
                    String addressBookName4 = input.next();
                    if (dictionary.containsKey(addressBookName4)) {
                        System.out.println(addressBookName4 + " Address book exist.");
                    } else {
                        System.out.println("Address Book does not exist");
                        AddressBook addressBook = new AddressBook();
                        dictionary.put(addressBookName4, addressBook);
                    }
                    break;
                case 7 :
                    String addressBookName5 = input.next();
                    if(dictionary.containsKey(addressBookName5)){
                        System.out.println("Enter name of city : ");
                        String cityName = input.next();
                        AddressBook addressBook = dictionary.get(addressBookName5);
                        System.out.println("Enter a person's name : ");
                        String personName = input.next();
                        addressBook.searchByCityName(cityName,personName) ;
                    }
                    else {
                        System.out.println("Address Book does not exist");
                    }
                    break;
                case 8 :
                    System.out.println("Enter name of address book in which you want to sort contact by Person : ");
                    String addressBookName7 = input.next();
                    if(dictionary.containsKey(addressBookName7)){
                        System.out.println(addressBookName7 + " Address book exist.");
                        AddressBook addressBook = dictionary.get(addressBookName7);
                        addressBook.sortByPerson();
                    }
                    else {
                        System.out.println("Address Book does not exist");
                    }
                    break;
                case 9:
                    System.out.println("Enter name of address book in which you want to sort contact by City");
                    String addressBookName8 = input.next();
                    if(dictionary.containsKey(addressBookName8)){
                        System.out.println(addressBookName8 + " Address book exist.");
                        AddressBook addressBook = dictionary.get(addressBookName8);
                        addressBook.sortByCity();
                    }
                    else {
                        System.out.println("Address Book does not exist");
                    }
                    break;
            }
        }
    }
}
