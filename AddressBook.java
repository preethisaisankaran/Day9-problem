package com.addressbook;
import java.util.Scanner;
public class AddressBook {
    public static void main(String[] args){
        AddressBook addressBook = new AddressBook();

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
        System.out.println("Option to edit");
        System.out.println("1.FirstName \n 2.Lastname \n 3.Address \n 4.city \n 5.state \n 6. zipcode \n 7. Phoneno \n 8.Email ");



        Scanner obj4 =new Scanner(System.in);
        System.out.println("Enter the option  ");
        int option =obj.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter the First name");
                obj1.setFirstname(obj.next());
                break;
            case 2:
                System.out.println("Enter the Last name");
                obj1.setLastname(obj.next());
                break;
            case 3:
                System.out.println("Enter the Address");
                obj1.setAddress(obj.next());
                break;
            case 4:
                System.out.println("Enter the city");
                obj1.setCity(obj.next());
                break;
            case 5:
                System.out.println("Enter the State");
                obj1.setState(obj.next());
                break;
            case 6:
                System.out.println("Enter the Zipcode");
                obj1.setZipcode(obj.nextInt());
                break;
            case 7:
                System.out.println("Enter the Phoneno");
                obj1.setPhoneno(obj.nextInt());
                break;
            case 8:
                System.out.println("Enter the Email");
                obj1.setEmail(obj.next());
                break;


        }

        System.out.println("Changes " +obj1);
        addressBook.delete();


        }





    public void delete(){
        ContactPerson obj1 = new ContactPerson();
        obj1=null;
        System.out.println("Deleted contact " + obj1);

    }

}
