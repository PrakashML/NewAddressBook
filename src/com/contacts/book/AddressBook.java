package com.contacts.book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Predicate;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String,Contact> contactHashMap = new HashMap<>();

    HashMap<String,Contact> contactHashMap2 = new HashMap<>();
    public void getContactDetails(){
        System.out.println("Enter details : ");
        Contact person = new Contact();
        person.getPersonDetails();
        int present = 0;
        for (Contact contact :contacts) {
            if (contact.getFirstName().equals(person.getFirstName())){
                present = 1;
                System.out.println("Person already exist");
                break;
            }
        }
        if (present==0){
            contacts.add(person);
        }
    }

    public void displayContact(){
        for (Contact contact:contacts) {
            System.out.println(contact);
        }
    }

    public void editPersonDetails(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter name to edit : " ) ;
        String name = input1.next();
        for (Contact person:contacts) {
            if (person.getFirstName().equals(name)) {
                System.out.println("Enter the option to edit");
                System.out.println("1.Firstname\t 2.Lastname\t 3.Address\t 4.City\t 5.State\t 6.Zipcode\t 7.Phone number\t 8.Email\t 9.Exit");
                int choice = input1.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Changing First name : ");
                        person.setFirstName(input1.next());
                        break;
                    case 2:
                        System.out.println("Changing last name : ");
                        person.setLastName(input1.next());
                        break;
                    case 3:
                        System.out.println("Changing address : ");
                        person.setAddress(input1.next());
                        break;
                    case 4:
                        System.out.println("Changing city : ");
                        person.setCity(input1.next());
                        break;
                    case 5:
                        System.out.println("Changing state : ");
                        person.setState(input1.next());
                        break;
                    case 6:
                        System.out.println("Changing zipcode : ");
                        person.setZipcode(input1.nextInt());
                        break;
                    case 7:
                        System.out.println("Changing phone number: ");
                        person.setPhoneNumber(input1.nextInt());
                        break;
                    case 8:
                        System.out.println("Changing email : ");
                        person.setEmail(input1.next());
                        break;
                    case 9:
                        System.out.println("Exiting from edit operation");
                        break;
                }
            }
        }
        System.out.println(contacts);
    }

    public void searchByCityName(String cityName,String personName){
        int count = 0;
        for (Contact contact : contacts) {
            if(contact.getCity().equals(cityName)){
                contactHashMap.put(cityName,contact);
            }
            if(contact.getFirstName().equals(personName)){
                count+=1;
            }
        }
        contacts.stream().filter(t -> t.getCity().equals(cityName)).forEach(x -> System.out.println(x));
        System.out.println(contactHashMap.keySet());
        System.out.println("Number of persons of same name : " + count );
    }

    public void deleteContact(){
        Scanner input1 = new Scanner(System.in);
        System.out.println(contacts);
        System.out.println("Enter name to delete : " );
        String name = input1.next();
        for (Contact person:contacts) {
            if(person.getFirstName().equals(name)){
                contacts.remove(person);
                System.out.println("Contact deleted successfully !!!");
                return;
            }
        }
        System.out.println(contacts);
    }

    public void sortByPerson(){
        Comparator<Contact> contactComparable = (a, b) -> a.compareTo(b);
        contacts.stream().sorted(contactComparable).forEach(x -> System.out.println(x));
    }

    public void sortByCity(){
        Comparator<Contact> contactComparable = (a, b) -> a.compareTo(b);
        contacts.stream().sorted(contactComparable).forEach(x -> System.out.println(x));
    }
}
