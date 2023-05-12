package com.miniproject.main;

import com.miniproject.entity.*;
import java.util.Scanner;

public class ContactListMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		
		while(true) {
			System.out.println("1. Create a new contact");
			System.out.println("2. Print all contact list details");
			System.out.println("3. Search a particular contact and print it");
			System.out.println("4. Update an existing contact and print the new values");
			System.out.println("5. Delete a contact and print it before deleting from the list");
			System.out.println("6. exit");
			
			int choice = scanner.nextInt();
	        scanner.nextLine();

	        switch (choice) {
	            case 1:
	                System.out.print("Enter name: ");
	                String name = scanner.next();
	                System.out.print("Enter contact number: ");
	                int contactNumber = scanner.nextInt();
	                System.out.print("Enter email: ");
	                String email = scanner.next();
	                ContactList newContact = new ContactList(name, contactNumber, email);
	                ll.insertAtRearEnd(newContact);
	                break;
	            case 2:
	                ll.traverseList();;
	                break;
	            case 3:
	                System.out.print("Enter name to search: ");
	                String searchName = scanner.next();
	                ll.searchContact(searchName);
	                break;
	            case 4:
	                System.out.print("Enter name to update: ");
	                String updateName = scanner.next();
	                System.out.print("Enter new contact number: ");
	                int newContactNumber = scanner.nextInt();
	                System.out.print("Enter new email: ");
	                String newEmail = scanner.next();
	                ll.updateContactList(updateName, newContactNumber, newEmail);
	                break;
	            case 5:
	                System.out.print("Enter name to delete: ");
	                String deleteName = scanner.next();
	                ll.deleteContactList(deleteName);
	                break;
	            case 6:
	                System.out.println("Exiting program...");
	                System.exit(0);
	            default:
	                System.out.println("Invalid choice.");
	                break;
	        }
		}
	}

}
