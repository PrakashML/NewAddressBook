package com.contacts.book;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To AddressBook");
        Scanner input = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        while(true){
            System.out.println("Want to add new contact? Press1 or 0");
            int add = input.nextInt();
            if(add == 1){
                addressBook.getContactDetails();
            }
            else break;
        }


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
