package com.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ContactRepository;

@RestController
@CrossOrigin
public class ContactRestController {
	
	@Autowired
	private ContactRepository contactrep;
	
	
	
	@RequestMapping(method=RequestMethod.GET, value="/contact/{id}")
	public Contact getContacts(@PathVariable int id) {
		return contactrep.getContact(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/contact")
	public List<Contact> getAllContacts() {
		return contactrep.allContacts();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/contact", 
			headers = {"Content-Type=application/json, application/xml", "Accept=application/json, application/xml" })
	public void insertContact(@RequestBody Contact contact) {
		contactrep.newContact(contact);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/contact", 
			headers = {"Content-Type=application/json, application/xml", "Accept=application/json, application/xml" })
	public void updateContact(@RequestBody Contact contact) {
		contactrep.updateContact(contact);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/contact/{id}", headers = {"Content-Type=application/json, application/xml", "Accept=application/json, application/xml" })
	public void deleteContact(@PathVariable int id) {
		contactrep.deleteContact(id);
	}
}
