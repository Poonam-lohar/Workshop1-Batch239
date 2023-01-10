package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
//Create Contacts with details(name, age, phoneNumber,city,state)
// -> Add multiple contacts
// in each addressBook ->
public class AddressBook {

    ArrayList<Contact> arrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);


    public void createContact() {
        Contact contact = new Contact();
        System.out.println("Enter first Name: ");
        contact.setFirstName(sc.next());
        System.out.println("Enter age: ");
        contact.setAge(sc.nextInt());
        System.out.println("Enter Phone Number: ");
        contact.setPhoneNumber(sc.next());
        System.out.println("Enter city: ");
        contact.setCity(sc.next());
        System.out.println("Enter State: ");
        contact.setState(sc.next());
        arrayList.add(contact);
        System.out.println(arrayList);
    }

    public void addContact() {
        Contact contact = new Contact();
        System.out.println("Enter first Name: ");
        contact.setFirstName(sc.next());
        System.out.println("Enter age: ");
        contact.setAge(sc.nextInt());
        System.out.println("Enter Phone Number: ");
        contact.setPhoneNumber(sc.next());
        System.out.println("Enter city: ");
        contact.setCity(sc.next());
        System.out.println("Enter State: ");
        contact.setState(sc.next());
        arrayList.add(contact);
        System.out.println(arrayList);

    }

    public void editContact() {
        System.out.println("Edit contact by First name: ");
        String name = sc.next();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getFirstName().equals(name)) {
                System.out.println("Edit by: \n1.age \n2.Phone number \n3.City \n4.State");
                int edit = sc.nextInt();

                switch (edit) {
                    case 1:
                        System.out.println("Enter age: ");
                        arrayList.get(i).setAge(sc.nextInt());
                        break;
                    case 2:
                        System.out.println("Enter Phone number: ");
                        arrayList.get(i).setPhoneNumber(sc.next());
                        break;
                    case 3:
                        System.out.println("Enter city: ");
                        arrayList.get(i).setCity(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter State: ");
                        arrayList.get(i).setState(sc.next());
                        break;
                }
                System.out.println("Edited List is....");
                System.out.println(arrayList);
            } else {
                System.out.println("Enter valid name: ");

            }
        }
    }
}

