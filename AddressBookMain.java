package AddressBook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class AddressBookMain {
    String name;

    public AddressBookMain(String name) {
        this.name = name;
    }

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
    public void EditContact()
    {
        for (Contact contact : arrayList)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first name you want to edit");
            String firstNameToEdit = sc.next();
            System.out.println("Enter last name you want to edit");
            String lastNameToEdit = sc.next();

            if(contact !=null && contact.getFirstName().equals(firstNameToEdit) && contact.getLastName().equals(lastNameToEdit) )
            {
                System.out.println("Enter contact's new first name");
                String newFirstName = sc.next();
                System.out.println("Enter contact's new last name");
                String newLastName = sc.next();
                System.out.println("Enter contact's new address");
                String newAddress = sc.next();
                System.out.println("Enter contact's new city");
                String newCity = sc.next();
                System.out.println("Enter contact's new state");
                String newState = sc.next();
                System.out.println("Enter contact's new zipCode");
                String newZipCode = sc.next();
                System.out.println("Enter contact's new phoneNumber");
                String newPhoneNumber = sc.next();
                System.out.println("Enter contact's new email");
                String newEmail = sc.next();

                contact.setFirstName(newFirstName);
                contact.setLastName(newLastName);
                contact.setAddress(newAddress);
                contact.setCity(newCity);
                contact.setState(newState);
                contact.setZipCode(newZipCode);
                contact.setPhoneNumber(newPhoneNumber);
                contact.setEmail(newEmail);
            }
            else
                System.out.println("Contact details no found");
        }
    }
    public void DeleteContacts()
    {
        for (Contact contact: arrayList)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first name you want to delete");
            String firstNameToDelete = sc.next();
            if(contact !=null && contact.getFirstName().equals(firstNameToDelete) )
            {
                arrayList.remove(contact);
                System.out.println("Delete operation is successfully done");
                break;
            }

        }
    }
}
