package com.contacts.book;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To AddressBook");
        Scanner input = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        addressBook.getContactDetails();
    }
}
