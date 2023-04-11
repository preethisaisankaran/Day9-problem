package com.addressbook;
import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args){


        System.out.println("Welcome to Address Book");
        ContactPerson obj1 = new ContactPerson();


        obj1.setFirstname("Preethi");
        System.out.println(obj1.getFirstname());
        obj1.setLastname("Sankaran");
        System.out.println(obj1.getLastname());
        obj1.setAddress("ABC area");
        System.out.println(obj1.getAddress());
        obj1.setCity("Cuddalore");
        System.out.println(obj1.getCity());
        obj1.setState("TN");
        System.out.println(obj1.getState());
        obj1.setZipcode(607002);
        System.out.println(obj1.getZipcode());
        obj1.setPhoneno(4000000);
        System.out.println(obj1.getPhoneno());
        obj1.setEmail("abc@gmail.com");
        System.out.println(obj1.getEmail());

        ContactPerson obj2 = new ContactPerson();
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the First name ");
        obj2.setFirstname(obj.next());
        System.out.println("enter the Last name ");
        obj2.setLastname(obj.next());
        System.out.println("enter the Address ");
        obj2.setAddress(obj.next());
        System.out.println("enter the city ");
        obj2.setCity(obj.next());
        System.out.println("enter the State ");
        obj2.setState(obj.next());
        System.out.println("enter the Zipcode ");
        obj2.setZipcode(obj.nextInt());
        System.out.println("enter the PhoneNo ");
        obj2.setPhoneno(obj.nextInt());
        System.out.println("enter the  Email");
        obj2.setEmail(obj.next());


    }
}
