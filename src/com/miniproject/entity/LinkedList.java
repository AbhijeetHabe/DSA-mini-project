package com.miniproject.entity;

// Implementation of a linked list
public class LinkedList {
	// Created a head which refers to object of Contact List
	ContactList head;
	
	// This is a non-parameterized constructor
	public LinkedList() {
		this.head = null;
	}
	
	// This method is to print all the contact lists stored in linked list
	public void traverseList() {
		// If head is null print list is empty
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		
		// We are storing reference of head in temp
		ContactList temp = head;
		
		// We are checking is temp != null if true
		while(temp != null) {
			// We will print the contact list details
			temp.printDetails();
			System.out.println();
			// We will go to next of the temp
			temp = temp.next;
		}
		System.out.println();
	}
	
	// This method is created  to insert contact list at the rear/last end of the linked list
	public void insertAtRearEnd(ContactList element) {
		// If head is null then store the contact list at head
		if (head == null) {
			head = element;
		}
		// We are storing reference of head in temp
		ContactList temp = head;
		// We are checking is temp.next != null if true
		while(temp.next != null) {
			// We will go to next of the temp
			temp = temp.next;
		}
		// At the end of the while loop we will be at the end of the linked list
		// So we will store the contact list element at its next 
		temp.next = element;
		// We are implicitly referring the end as null.
		temp.next.next = null;
		System.out.println("Contact details added successfully!!");
	}
	
	// This is method to search contact details using name
	public void searchContact(String name) {
		// If head is null print list is empty
		if (head == null) {
			System.out.println("Contact list is empty.");
			return;
		}
		
		// We are storing reference of head in temp
		ContactList temp = head;
		// We are checking is temp != null if true
		while(temp != null) {
			// We are comparing two strings if they are equal return true else false
			if (temp.name.equals(name)) {
				// if name is found we are printing the contact list details
				System.out.println("Found "+name+" showing details below:");
				temp.printDetails();
				System.out.println();
				// After printing contact list details we return
				return;
			}
			// We will go to next of the temp
			temp = temp.next;
		}
		// At end of while loop if we did not find the name, we print contact not found
		System.out.println("Contact not found in the list.");
	}
	
	public void updateContactList(String name, int number, String email) {
		// If head is null print list is empty
		if (head == null) {
			System.out.println("Contact list is empty.");
			return;
		}
		// We are storing reference of head in temp
		ContactList temp = head;
		// We are checking is temp != null if true
		while(temp != null) {
			// We are comparing two strings if they are equal return true else false
			if (temp.name.equals(name)) {
				// Updating the details for given contact list name
				temp.contactNumber = number;
				temp.email = email;
				// if name is found we are printing the contact list details
				System.out.println("Updated details for "+name+" showing details below:");
				temp.printDetails();
				System.out.println();
				// After printing contact list details we return
				return;
			}
			// We will go to next of the temp
			temp = temp.next;
		}
	}
	
	public void deleteContactList(String name) {
		// If head is null print list is empty
		if (head == null) {
			System.out.println("Contact list is empty.");
			return;
		}
		// Storing the reference of prev and temp 
		ContactList temp = head;
		ContactList prev = temp;
		// We are checking if temp != null and name does not match
		while (temp!=null && !temp.name.equals(name)) {
			// Storing reference of temp in prev
			prev = temp;
			// We will go to next of the temp
			temp = temp.next;
		}
		// We come out of loop when we found the contact list
		if (temp!=null) {
			// Print the details of the contact list to be deleted
			System.out.println("Deleting "+name+" details as shown below");
			temp.printDetails();
			System.out.println();
			// prev's next references to next of the temp 
			// Removing the temp from the linked list
			prev.next = temp.next;
			// We make the temp's next as null
			temp.next = null;
			return;
		}
		// If temp is null that means we are at the end of the linked list
		// i.e we have not found the contact list, so we prent
		// Contact list not found
		if (temp == null) {
			System.out.println("Contact list not found!");
		}
	}
}
