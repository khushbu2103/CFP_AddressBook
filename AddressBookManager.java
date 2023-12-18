package AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookManager {
    public void MultipleAddressBook()
    {
        String menu = "Press \n1:Adding A contact\n2: Displaying All Contact\n3: Search by first name\n4: Search by Phone number\n5: Delete by USer First name\n6: Update phone Number";
        Scanner sc = new Scanner(System.in);
        ArrayList<AddressBookMain> arrayList2 = new ArrayList<>();
        AddressBookMain a = new AddressBookMain("Addressbook1");
        AddressBookMain b = new AddressBookMain("Addressbook2");
        AddressBookMain c = new AddressBookMain("Addressbook3");
        arrayList2.add(a);
        arrayList2.add(b);
        arrayList2.add(c);
        int z = 1;
        do {
            System.out.println("1 : Select Address Book\\n2: Display all the address book\\n3:Find all contacts of a city");
            int option = sc.nextInt();
            switch (option)
            {
                case 1:
                    System.out.println("Enter the address book you want to search");
                    String searchAddressBook = sc.next();
                    for (AddressBookMain ab : arrayList2)
                    {
                        if(ab.name.equalsIgnoreCase(searchAddressBook));
                        {
                            int choice;
                           do {
                               System.out.println("Welcome to address book");
                               AddressBookMain abm = new AddressBookMain("khushi");
                               System.out.println("1.want to add contact\n 2.want to display contact\n3.want to edit contact\n4.want to delete contact");
                               int input = sc.nextInt();
                               switch (input)
                               {
                                   case 1:
                                       abm.AddContact();
                                       break;
                                   case 2:
                                       abm.Display();
                                       break;
                                   case 3:
                                       abm.EditContact();
                                       break;
                                   case 4:
                                       abm.DeleteContacts();
                                       break;
                               }
                               System.out.println("Enter 0 to exit");
                               choice = sc.nextInt();
                           }while (choice!=0);
                        }
                        
                    }

                    break;
                case 2:
                    for (AddressBookMain ks: arrayList2
                         ) {
                        System.out.println(ks.name+ " : " +ks.arrayList
                        );
                    }
                    break;
                case 3:
                    System.out.println("Enter the city you want to display");
                    String city = sc.next();
                    for (AddressBookMain ks2:arrayList2
                         ) {
                        for (Contact contact:ks2.arrayList

                             ) {
                            if(city.equalsIgnoreCase(contact.getCity())){
                                System.out.println(ks2.name+ " : "+contact);
                            }
                        }
                    }
                    break;
                default:
                    z=0;
                    break;
            }

        } while (z!=0);
    }
}
