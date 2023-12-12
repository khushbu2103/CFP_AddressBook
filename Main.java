package AddressBook;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static boolean attempt = true;
    public static void main(String[] args) {

        System.out.println("Hello world");

        AddressBookMain ob = new AddressBookMain();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n1. Add Contact Details"
                    + "\n2. View Contact Details"
                    + "\n3. Update Contact Details."
                    + "\n4. Delete Contact Details.");

            System.out.println("Enter the choice:");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Add Contacts:");
                    ob.AddContact();
                    break;

                case 2:
                    System.out.println("View Contacts:");
                    ob.Display();
                    break;

                case 3:
                    System.out.println("Update Contacts:");
                    ob.EditContact();
                    break;
//
                case 4:
                    System.out.println("Delete Contacts:");
                    ob.DeleteContacts();
                    break;

            }
        }
        while (attempt);

    }
}