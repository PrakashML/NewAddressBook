package com.contacts.book;

import java.util.ArrayList;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    public void getContactDetails(){
        System.out.println("Enter details: ");
        Contact person = new Contact();
        person.getPersonDetails();
        contacts.add(person);
    }
}
