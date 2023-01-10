package com.bridgelabz;
//Create Contacts with details(name, age, phoneNumber,city,state)
// -> Add multiple contacts
// in each addressBook ->

public class Contact {
    public Contact() {
        this.firstName = firstName;
        this.city = city;
        this.state = state;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    String firstName,city,state;
    int age;
    String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
