package com.contacts.book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To AddressBook");
        Contact person = new Contact("Prakash","k","lake view road","chennai","tn",456464,657676769,"pk4652@gmail.com");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
    }
}
