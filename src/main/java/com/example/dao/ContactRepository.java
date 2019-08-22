package com.example.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.business.Contact;

@Service
public class ContactRepository {
	private ContactData contactdao;
	
	@Autowired
	public ContactRepository(ContactData Contact) {
		this.contactdao = Contact;
	}
	
	public List<Contact> allContacts(){
		return contactdao.allContacts();
	}
	
	public Contact getContact(int id) {
		return contactdao.getContactById(id);
	}
	
	public Contact updateContact(Contact contact) {
		return contactdao.editContact(contact);
	}
	
	public void newContact(Contact contact) {
		contactdao.addContact(contact);
	}
	
	public void deleteContact(int id) {
		 contactdao.deleteContact(id);
	}
}
