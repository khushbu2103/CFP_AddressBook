package AddressBook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class AddressBookMain {

    ArrayList<Contact> arrayList = new ArrayList<>();
    public void AddContact()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = sc.next();
        System.out.println("Enter last name");
        String lastName = sc.next();
        System.out.println("Enter address");
        String address = sc.next();
        System.out.println("Enter city");
        String city = sc.next();
        System.out.println("Enter state");
        String state = sc.next();
        System.out.println("Enter zip code");
        String zipCode = sc.next();
        System.out.println("Enter phone number");
        String phoneNumber = sc.next();
        System.out.println("Enter email");
        String email = sc.next();
        Contact contact1 = new Contact(firstName, lastName, address, city, state, zipCode, phoneNumber,email);
        arrayList.add(contact1);
    }
    public void Display()
    {
        for (Contact contact: arrayList)
        {
            System.out.println(contact);
        }
    }

}
