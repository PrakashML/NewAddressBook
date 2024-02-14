package com.contacts.book;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To AddressBook");
        Scanner input = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        addressBook.getContactDetails();
        System.out.println("Want to Edit Press 1 or else 0: ");
        if(input.nextInt() == 1){
            addressBook.editPersonDetails();
        }
        else System.out.println("No Changes Done");
        System.out.println("Want to Delete Press 1 or else 0: ");
        if(input.nextInt() == 1){
            addressBook.deleteContact();
        }
        else System.out.println("No Changes done");

    }
}
