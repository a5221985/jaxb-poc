package com.startup.java.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "com.startup.java.model")
public class Bookstore {
	
	@XmlElementWrapper(name = "bookList")
	@XmlElement(name = "book")
	private ArrayList<Book> bookList;
	private String name;
	private String location;

	public ArrayList<Book> getBooksList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
