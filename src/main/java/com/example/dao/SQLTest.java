package com.example.dao;

import java.util.List;

import com.example.business.Contact;

public class SQLTest {

	public static void main(String[] args) {
		//Methods to tesst
		//1) Add - done
		//2) Update - done
		//3) Delete - done
		//4) Allcontacts - done
		//5) Specific contacts -
		
		Contact c = new Contact(28,"Vivek","122");
		
		JDBCops sq = new JDBCops();
		System.out.println(sq.getContactById(2).getName());
		

	}

}
