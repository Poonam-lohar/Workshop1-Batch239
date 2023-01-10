package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("...Welcome To Address Book....");
        AddressBook addressBook = new AddressBook();
        addressBook.createContact();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1.create contact \n2.Add Contact \n3.Edit contact \n4.Exit");
        System.out.println("Enter choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                addressBook.createContact();
                System.out.println("Contact Created Successfully........");
                break;
            case 2:
                addressBook.addContact();
                System.out.println("Contact Added Successfully....");
                break;
            case 3:
                addressBook.editContact();
                System.out.println("Contact Edited Successfully.....");
                break;
            case 4:
                System.out.println("Exited Successfully..........");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
