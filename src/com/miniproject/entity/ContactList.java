package com.miniproject.entity;

// Created an object class contact list to store contact details
public class ContactList {
	// Provided data members
	String name;
	int contactNumber;
	String email;
	ContactList next;
	
	// Created a parameterized constructor providing values to store in the object
	public ContactList(String name, int contactNumber, String email) {
		this.name = name;
		this.contactNumber = contactNumber;
		this.email = email;
	}
	// Created a method to print all the contact details
	public void printDetails() {
		System.out.println("Name: "+name);
		System.out.println("Contact Number: "+contactNumber);
		System.out.println("Email: "+email);
	}
}
