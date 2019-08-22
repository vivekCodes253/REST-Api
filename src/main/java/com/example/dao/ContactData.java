package com.example.dao;

import java.util.List;

import com.example.business.Contact;

public interface ContactData {
	public List<Contact> allContacts();
	public Contact getContactById(int id);
	public Contact editContact(Contact c);
	public void deleteContact(int id);
	public void addContact(Contact c);
}
